package ru.relex.education.getInfoFromFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

/**
 * ����� ��������� ���������� �� ������.
 * 
 * @author V. Kodenko
 * 
 */
public class PresentationMembers {
    static private String regexFile = ".*xml";
    static private String regexIdName = "\\<callernumber\\>([0-9]+)\\-(.*)\\<";
    static private String regexTime = "(\\d{13}).*?PARTICIPANT.*?ParticipantJoinEvent.*?\n*?.*?\n*?.*\n*?.*?\\<userId\\>(\\d{2,3})\\<\\/userId|.*(\\d{13}).*PARTICIPANT.*ParticipantLeftEvent.*\\n.*\\<userId\\>(\\d{2,3})\\<.*";
    static private List<String> filesFound = new ArrayList<String>();
    /* ����� ���������� ����� */
    static private int i = 0;
    /* ��� �������� ����� */
    static private String fullFileName = null;
    //------------------------------------------
    //------------------------------------------//
    //------------------------------------------
    /**
     * ����� ������ ������ �� ��������� �������.
     * 
     * @param dir
     *            ���������� ������ ������
     * @param regexFile
     *            ������ ��� ������
     * @param date
     *            ���� �������� �����
     * @return ������ ������ ���� ��������� ������
     */
    public static void findFileInCatalog(String dir, List<String> filesFound,
            String date) {

        /* ������ ��� ������ ������ */
        Pattern p = Pattern.compile(regexFile);
        File f1 = new File(dir);
        File listFiles[] = f1.listFiles();
        /* ������ ������ ���� �������� ����� */
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        /* �������� ����������� �������� */
        if (listFiles != null) {
            /* ���� ��� ��������� ����������� �������� */
            for (int i = 0; i < listFiles.length; i++) {
                String direct = listFiles[i].toString();
                /* �������� ������� ��� ���� */
                if (listFiles[i].isDirectory()) {

                    /*
                     * ���� ������ ������� - ��������� ����� printCatalog() �
                     * ����� �����
                     */
                    findFileInCatalog(direct, filesFound, date);
                } else {
                    /*
                     * ���� ���� - ��������� �� ������������ ������� � ��������
                     * � ������
                     */
                    Matcher m = p.matcher(direct);
                    if (m.matches()) {
                        /* ��������� ���� �������� � �������� ������� */
                        String dateMakeFile = df.format(new java.util.Date(
                                listFiles[i].lastModified()));
                        /* �������� ���� �������� */
                        if (dateMakeFile.endsWith(date))
                            /*
                             * ���� �������� ������������� - ��������� ��� �����
                             * � ������
                             */
                            filesFound.add(listFiles[i].toString());
                    }
                }
                direct = null;
            }
            /* ���� � �������� ���������� ��� ������ */
        } else

            System.out.println(dir + " is not a directory");
    }

    /**
     * ����� ������ ����� � ���������� ���� String
     * 
     * @param fileName
     *            ��� �����
     * @return ���������� ���� String, ���������� ����� �����
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String readFile(String fileName)
            throws FileNotFoundException, IOException {
        /* ���������� ������ ����� � ��������� ���������� */
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        /* ���������� ��� �������� ����������� ������ */
        String contentsFile;

        while ((contentsFile = br.readLine()) != null) {
            stringBuilder.append(contentsFile + "\n");
        }
        contentsFile = stringBuilder.toString();
        br.close();

        return contentsFile;
    }

    /**
     * ����� ������������ ����������� � ���� .
     * 
     * @param direcrory
     *            ���������� ������ ������ event.xml
     * @param lectureName
     *            �������� ������
     * @return Map - ���������� ���������� � ���������� ������
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static Map<String, Attendence> getAttendenceInfo(String fileName,
            String lectureName) throws FileNotFoundException, IOException {
        // --------------------------------------------------
        /* ����� ����� � �������� �� ������� - ���������� */

        /*
         * �������� ����� ��� ������������ ������ ���������� �� ����������
         * ������
         */
        Map<String, Attendence> participantFullInfo = new HashMap<String, Attendence>();
        // ---------------------------------------------------
        /* ����� � ������ .xml ������� ���� ������ */

        /* ������ ����������� ����� */

        String contentsFile = readFile(fileName);

        // ---------------------------------------------------
        /* ����� �������� ������ */
        Pattern namePattern = Pattern
                .compile("metadata contextactivitydescription=\\\""
                        + lectureName + "\\\"");
        Matcher nameMatcher = namePattern.matcher(contentsFile);
        if (nameMatcher.find()) {

            // --------------------------------------------------

            /* ������ ������ ����� � ������� */

            Pattern idNamePattern = Pattern.compile(regexIdName);
            Matcher idNameMatcher = idNamePattern.matcher(contentsFile);

            /* ������������ ����� ��������� id */
            Map<String, String> participant = new HashMap<String, String>();
            while (idNameMatcher.find()) {
                String id = idNameMatcher.group(1);
                String name = idNameMatcher.group(2);

                participant.put(id, name);
            }

            // ---------------------------------------------------------
            Pattern idTimeEnterPattern = Pattern.compile(regexTime);
            // "event timestamp\\=\\\"(\\d+)\\\" module\\\"PARTICIPANT\\\" eventname\\=\\\"ParticipantJoinEvent\\\".*<userId\\>(\\d{2,3})\\<\\/userId\\>|.*(\\d+).*PARTICIPANT.*ParticipantLeftEvent.*\\n.*\\<userId\\>(\\d{2,3})\\<.*");
            Matcher idTimeInOutMatcher = idTimeEnterPattern
                    .matcher(contentsFile);
            /* ���� ������� ������������ �������: ����� ����� ��� ������ */
            while (idTimeInOutMatcher.find()) {
                // System.out.println(idTimeInOutMatcher.group(1) + "    "
                // + idTimeInOutMatcher.group(2) + "    "
                // + idTimeInOutMatcher.group(3) + "   "
                // + idTimeInOutMatcher.group(4));
                String idEnter = idTimeInOutMatcher.group(2);
                String timeEnter = idTimeInOutMatcher.group(1);
                String idExit = idTimeInOutMatcher.group(4);
                String timeExit = idTimeInOutMatcher.group(3);

                /* ���� id ����� �� ����� null */
                if (idEnter != null) {

                    /* ���� �� ��� id ������������ � participant Map */
                    if (participant.containsKey(idEnter)) {
                        /* ���� �� � �������������� Map ������ ��� ������� id */
                        if (participantFullInfo.containsKey(idEnter)) {

                            /* �������� � List ����� SaveTime */

                            Date t = new Date(Long.parseLong(timeEnter));

                            SaveTime saveTime = new SaveTime(t, null);
                            /*
                             * �������� � List ����� ����� timeInOut ��� �������
                             * id
                             */
                            participantFullInfo.get(idEnter).getTimeInOut()
                                    .add(saveTime);

                            /*
                             * ���� � �������������� Map ��� ������� id ���
                             * �������
                             */
                        } else {

                            /*
                             * ������� ����� ����� timeInOut ��� ������� id �
                             * ������ ������� �����
                             */
                            Date t = new Date(Long.parseLong(timeEnter));
                            SaveTime saveTime = new SaveTime(t, null);
                            /*
                             * ������� List ��� �������� �������� SaveTime ���
                             * ������� id ������
                             */
                            List<SaveTime> timeInOut = new ArrayList<SaveTime>();
                            /*
                             * ��������� � List ������ SaveTime ��� ������� id
                             * ������
                             */
                            timeInOut.add(saveTime);
                            /*
                             * ������� Attendence ������ ��� ������� id ������
                             */
                            Attendence attendence = new Attendence(
                                    participant.get(idEnter), timeInOut);
                            /*
                             * �������� ���� id ������ � ������ Attendence �
                             * �������������� Map
                             */
                            participantFullInfo.put(idEnter, attendence);

                        }
                    }
                }
                /* ���� id ����� ����� null, ������ ��� id ������ */
                else {
                    /* ����� ����� participantFullInfo ��� ������� id ������ */
                    if (participant.containsKey(idExit)) {
                        /* ����� ����� Attendence ��� ������� id ������ */
                        participantFullInfo
                                .get(idExit)
                                .getTimeInOut()
                                .get(participantFullInfo.get(idExit)
                                        .getTimeInOut().size() - 1);
                        /* �������� List �� Attendence ��� ������� id ������ */
                        /* ���� ���� OutputTime null */
                        if (participantFullInfo
                                .get(idExit)
                                .getTimeInOut()
                                .get(participantFullInfo.get(idExit)
                                        .getTimeInOut().size() - 1)
                                .getOutputTime() == null) {
                            /*
                             * ���������� ����� ������ � ��������� �������� ��
                             * List �� Attendence ��� ������� id ������
                             */

                            Date t = new Date(Long.parseLong(timeExit));
                            participantFullInfo
                                    .get(idExit)
                                    .getTimeInOut()
                                    .get(participantFullInfo.get(idExit)
                                            .getTimeInOut().size() - 1)
                                    .setOutputTime(t);
                            /* ���� ���� OutputTime not null - �������� �������� */
                        } else {

                            Date t = new Date(Long.parseLong(timeExit));
                            SaveTime saveTimeOut = new SaveTime(null, t);
                            participantFullInfo.get(idExit).getTimeInOut()
                                    .add(saveTimeOut);

                        }
                    }
                }
            }
        }

        return participantFullInfo;
    }

    /* ������������ �������� ������ */
    /**
     * ����� Main ���������� ������.
     * 
     * @param args
     *            [0] - ������� ��� ������
     * @param args
     *            [1] - �������� ������
     * @param args
     *            [2] - ��� �����, ����������� ���������� � ����������
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException,
            IOException {

        /* �������� �������� ����������: */
        if (args.length == 4) {
            // ----------------------------------------
            /* ����� ������ � �������� ���������� */

            findFileInCatalog(args[0], filesFound, args[3]);

            /* ���������� ����� ����� �� ���������� ������ */
            for (String fileName : filesFound) {
                fullFileName = fileName;
                /* ��������� ����� ������������ ����� */
                i++;
                // -----------------------------------
                /* ������������ Map ��� ������� ����� */
                Map<String, Attendence> participantFullInfo = getAttendenceInfo(
                        fileName, args[1]);
                /* �������� ���������� �������� ������ */
                String outputFileName = args[2];
                /* �������� ����� ��������� ����� */
                outputFileName = outputFileName + "\\OutputFile" + i + ".txt";
                OutputStream os = null;

                try {

                    os = new FileOutputStream(outputFileName);
                    writeTo(os, participantFullInfo.values());
                } catch (FileNotFoundException e) {
                    System.out.println("������ �������� ����� "
                            + outputFileName);
                    System.exit(0);
                } finally {
                    if (os != null)
                        os.close();
                }
            }
        } else
            System.out
                    .println("������� �������� ������ � �������: ������� ��� ������, "
                            + "�������� ������,  ��� �������� �������� ������, ���������� "
                            + "���������� � ���������� � ���� ���������� (� ������� dd.mm.yyyy)");
    }

    private static void writeTo(OutputStream os,
            Collection<Attendence> participantFullInfo) {
        PrintWriter pw = new PrintWriter(os);
        String contentsFile;
        String timeIn, timeOut;
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        pw.println(fullFileName);
        pw.println();
        /* ������������ ����������� �� �������� Map */

        for (Attendence entry : participantFullInfo) {

            /* ���������� ������� ����� � ������ ��� ������ ������������ */
            for (SaveTime saveTime : entry.getTimeInOut()) {

                /* ������������ ������ ����������� */
                /* ���� ���� null - ��������������� �� ���� � ������ �� ���� */
                if (saveTime.getInputTime() == null) {
                    timeIn = null;
                    timeOut = df.format(saveTime.getOutputTime());
                    /* ���� ����� ����� not null, ��������� ����� ������ */
                } else {
                    if (saveTime.getOutputTime() == null) {
                        timeIn = df.format(saveTime.getInputTime());
                        timeOut = null;
                    } else {
                        timeIn = df.format(saveTime.getInputTime());
                        timeOut = df.format(saveTime.getOutputTime());
                    }
                }
                /* ���������� �������������� ������ �� ��������� ������� */
                contentsFile = String.format("name: %1$-25s %2$5s  - %3$5s",
                        entry.getName(), timeIn, timeOut);
                /* ������ �������������� ������ � ���� */
                pw.println(contentsFile);
            }
        }
        pw.flush();
    }
}

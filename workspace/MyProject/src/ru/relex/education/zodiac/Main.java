package ru.relex.education.zodiac;

/**
 * ����� Main ����� ����� ������� �� ������ � ���.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {

    public static void main(String args[]) {
        /** ������������ �������� ������ */
        int maxMonth = 13;
        /** ������������ �������� ��� � ������ */
        int maxDay = 31;
        /** ���� try ��������� ���������� ���������� ��������� �� ������� ������� */
        try {
            /** ���� ������ ����������� maxMonth ������� �� maxDay ��� */
            for (int j = 1; j <= maxMonth; j++) {
                for (int i = 1; i <= maxDay; i++) {

                    System.out.println("" + j + "." + i + "\t"
                            + ZodiacFinal.determineZodiac(j, i));
                }
            }
        /** ���� catch ��� ������������� ���������� ������� ��������� ArrayIndexOutOfBoundsException*/
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
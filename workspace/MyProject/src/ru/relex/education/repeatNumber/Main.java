package ru.relex.education.repeatNumber;

/**
 * Main ����� ������� ������ ����� ����������� ����������� �������� ����� �
 * ������������ ������.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {
    public static void main(String[] args) {
        /* �������� ������� args[0] */
        if (args.length != 0) {
        
         /*
         * ����� ������ ������� ����������� �������� ����� �� 0 �� 9 � ������ �
         * �������� ������������ �������� � ������ ������ ResultObject(int maxValue, List<Integer> resultList)
         */
        ResultObject resultObject = MaxRepeatNum.consider(args[0]);

        /* ����� ����������� */
        printResult(resultObject);
        }
        /* �������� ��� ������� ��������� ��� �������� ������ */
        else System.out.println(" No enter original string ");
        
    }

    private static void printResult(ResultObject resultObject) {
        System.out.print("Max repeat number : " + resultObject.getmaxValue()
                + " Number is : ");
        for (Integer i : resultObject.getresultList()) {
            /* ����� ����������� */
            System.out.print("  " + i + "  ");

        }
    }
}

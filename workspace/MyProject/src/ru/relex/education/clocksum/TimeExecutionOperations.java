package ru.relex.education.clocksum;

/**
 * ����� �������� ������� ���������� ����� �������� � ������� ���������
 * ��������� �������.
 * 
 * @author Vladimir K.
 */
public class TimeExecutionOperations {

    /**
     * ����� �������� ������� ���������� ����� �������� � ������� ���������
     * ��������� �������.
     * 
     * @param ������ ������������ ������
     */
    public static double timeExecute(Runnable runnable) {
        long differenceTime = 0; // �������� ������� ���������� ��������
        long finalTime = 0; //����� ����� ����������� ��������
        long startTime = 0; //����� ����� ����������� ��������
        int numberOfIteration = 10000;

        while (differenceTime < 3000) {
            numberOfIteration = numberOfIteration * 2;
            startTime = System.currentTimeMillis();

            for (int j = 0; j < numberOfIteration; j++) {
                runnable.run();
            }
            finalTime = System.currentTimeMillis();
            differenceTime = finalTime - startTime;
        }
        return (differenceTime + 0d) / numberOfIteration;
    }
}

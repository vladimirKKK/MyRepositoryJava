package ru.relex.education.test;

/**
 * ����� �������� ���������� ���������� ����������� � ����� ��� ���������
 * ������� �� 00:00 �� 23:59.
 * 
 * @author Vladimir K.
 */
public class Calculation {

    public static int calculate() {
        int s = 0;
        for (int j = 0; j < 10000; j++) {
            for (int i = 0; i < 24; i++) {
                if ((i % 10) < 6)
                    ++s;
            }
        }
        return s;
    }
}

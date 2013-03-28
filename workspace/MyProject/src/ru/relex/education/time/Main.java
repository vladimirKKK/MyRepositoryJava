package ru.relex.education.time;
/**
 * ����� ���������� ������: �������������� ������ � ��������� ������� � ����� ����������� � ���� �������. 
 * ������� ���������.
 * 
 * @������_�������� ������ ��������� ������
 * @������_�������� ��������� ��������� ������
 * @NUMBER_OF_COLUMNS ���������� �������� � �������
 * @author Vladimir K.
 */
public class Main {
    private static final int NUMBER_OF_COLUMNS = 3;

    public static void main(String[] args) {
        TableOfResults.formatAsTable(1, 77, NUMBER_OF_COLUMNS);
    }
}

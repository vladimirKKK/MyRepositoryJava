package ru.relex.education.converttometers;

/**
 * ����� ������� ������ � ������ �� �������� ������ � ������ �������� �����.
 * 
 * @author Vladimir K.
 * 
 */
public class ConversionToMetr {
    /**
     * ����� ������� ������ � ������ �� �������� ������ � ������ �������� �����.
     * 
     * @param type
     *            ��� ������ �����
     * @param length
     *            �������� ����� ��� ��������� ����
     * @return ����� � ������
     */
    public static double convert(Length type, double lenght) {
        /** ��������� �������� */
        double meters;
        /** ������ �������� ����� � ������ */
        meters = lenght * type.getFactor();

        return meters;
    }
}

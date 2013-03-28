package ru.relex.education.converttometers;

/**
 * ������������ ����� ������ ��������� ������.
 * 
 * @author Vladimir K.
 * 
 */
public enum Length {
    DECIMETER(0.1, "��������"), KILOMETER(1000, "��������"), METER(1, "����"), MILLIMETER(0.001, "���������"), CENTIMETER(
            0.01, "���������");

    /** ����������� ��� �������� � ����� */
    private double factor;
    private String name;

    /**
     * ����������� ������������.
     * 
     * @param factor
     *            �������� ������������ �����
     */
    Length(double factor, String name) {
        this.factor = factor;
        this.name = name; }

    /** ������ ������������ */
    double getFactor() {
        return factor;

    }

    public String getName() {
        return name;
    }
   
}

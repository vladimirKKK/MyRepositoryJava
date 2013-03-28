package ru.relex.education.Course;

/**
 * ������������ ����������� ��������.
 * 
 * @author Vladimir K.
 */
public enum Order {
    FORWARD(0), RIGHT(1), BACK(2), LEFT(3);

    // ���������� ��� �������� ��������� �����������
    private int order;

    /**
     * ����������� ������������
     * 
     * @param order
     *            �������� ��������� �����������
     */
    Order(int order) {
        this.order = order;
    }

    // ����� ������ �������� ��������� �����������
    int getNumber() {
        return order;

    }
}

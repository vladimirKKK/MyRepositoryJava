package ru.relex.education.Course;

/**
 * ������������ ������ �����.
 * 
 * @author Vladimir K.
 */
public enum SideOfTheWorld {
    NORTH(1), EAST(2), SOUTH(3), WEST(4);

    // ���������� ��� �������� ������ ������� �����
    private int number;
    /**
     * ����������� ������������
     * @param number ����� ������� �����
     */
    SideOfTheWorld(int number) {
        this.number = number;
    }

    /*
     * ����� ������ ������ ������� �����
     */
    int getNumber() {
        return number;

    }
}

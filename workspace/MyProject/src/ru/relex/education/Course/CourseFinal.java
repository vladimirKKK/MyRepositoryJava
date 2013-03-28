package ru.relex.education.Course;

import static ru.relex.education.Course.SideOfTheWorld.*;

/**
 * ����� ����� � �������������� ������ �����.
 * 
 * @author Vladimir K.
 * 
 */
public class CourseFinal {
    // �������� �������� � ���������� �����������
    private static SideOfTheWorld sideWorld[] = { NORTH, EAST, SOUTH, WEST,
            NORTH, EAST, SOUTH };

    /**
     * ����� ������� ������ ����� �� �������� �������� � ����������
     * ������������� � �������������� ��������.
     * 
     * @param currentDirection
     *            ������� ����������� ���� SideOfTheWorld
     * @param order
     *            ��������� �������� ���� Order
     * @return ����� ����������� ���� SideOfTheWorld
     */
    public static SideOfTheWorld changeCourse(
            SideOfTheWorld currentDirection, Order order) {

        // ���������� ��� �������� �������� ������ �����������
        int resultPosition;

        // ����� �������� ����������� = ������� �������� �����������
        // ��������� ��������� � -1 (������ ������� ���������� � 0)
        resultPosition = currentDirection.getNumber()
                + order.getNumber() - 1;

        // ����� ���������� - ������ �����������, ���� SideOfTheWorld
        return sideWorld[resultPosition];
    }

}

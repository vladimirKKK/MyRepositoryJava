package ru.relex.education.Course;

import static ru.relex.education.Course.SideOfTheWorld.*;

/**
 * Класс задач с использованием сторон света.
 * 
 * @author Vladimir K.
 * 
 */
public class CourseFinal {
    // Создание массивов с названиями направлений
    private static SideOfTheWorld sideWorld[] = { NORTH, EAST, SOUTH, WEST,
            NORTH, EAST, SOUTH };

    /**
     * Метод расчета нового курса по заданным текущему и требуемому
     * направленению с использованием массивов.
     * 
     * @param currentDirection
     *            текущее направление типа SideOfTheWorld
     * @param order
     *            требуемое изменеие типа Order
     * @return новое направление типа SideOfTheWorld
     */
    public static SideOfTheWorld changeCourse(
            SideOfTheWorld currentDirection, Order order) {

        // переменная для хранения значения нового направления
        int resultPosition;

        // новое значение направления = текущее значение направления
        // прибавить изменение и -1 (номера массива начинаются с 0)
        resultPosition = currentDirection.getNumber()
                + order.getNumber() - 1;

        // вывод результата - нового направления, типа SideOfTheWorld
        return sideWorld[resultPosition];
    }

}

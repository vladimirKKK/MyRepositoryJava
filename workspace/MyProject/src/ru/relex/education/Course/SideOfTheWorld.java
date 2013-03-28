package ru.relex.education.Course;

/**
 * Перечисление сторон света.
 * 
 * @author Vladimir K.
 */
public enum SideOfTheWorld {
    NORTH(1), EAST(2), SOUTH(3), WEST(4);

    // переменная для хранения номера стороны света
    private int number;
    /**
     * конструктор перечисления
     * @param number номер стороны света
     */
    SideOfTheWorld(int number) {
        this.number = number;
    }

    /*
     * метод вывода номера стороны света
     */
    int getNumber() {
        return number;

    }
}

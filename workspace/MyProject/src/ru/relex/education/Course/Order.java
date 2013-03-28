package ru.relex.education.Course;

/**
 * Перечисление направлений движения.
 * 
 * @author Vladimir K.
 */
public enum Order {
    FORWARD(0), RIGHT(1), BACK(2), LEFT(3);

    // переменная для хранения изменения направления
    private int order;

    /**
     * конструктор перечисдения
     * 
     * @param order
     *            значение изменения направления
     */
    Order(int order) {
        this.order = order;
    }

    // метод вывода значения изменения направления
    int getNumber() {
        return order;

    }
}

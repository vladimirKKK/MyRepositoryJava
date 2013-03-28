package ru.relex.education.technumber;


/**
 * Класс выполнения задачи: в диапазоне от 0 до заданного числа подсчет количества включений заданных элементов.
 
 * @author Vladimir K.
 */
public class Main {
/**
 * 
 * @param first максимальное число
 * @param second первый элемент поиска
 * @param third второй элемент поиска
 */
    public static void main(String[] args) {
        int s = Calculation.calculate(4, 3, 1);
        System.out.print(s);
        System.currentTimeMillis();
        }
}

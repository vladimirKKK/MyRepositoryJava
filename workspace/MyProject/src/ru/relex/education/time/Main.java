package ru.relex.education.time;
/**
 *  ласс выполнени€ задачи: преобразовани€ секунд к заданному формату и вывод результатов в виде таблицы. 
 * входным парамерам.
 * 
 * @первый_аргумент начало диапазона секунд
 * @второй_аргумент окончание диапазона секунд
 * @NUMBER_OF_COLUMNS количество столбцов в таблице
 * @author Vladimir K.
 */
public class Main {
    private static final int NUMBER_OF_COLUMNS = 3;

    public static void main(String[] args) {
        TableOfResults.formatAsTable(1, 77, NUMBER_OF_COLUMNS);
    }
}

package ru.relex.education.zodiac;

/**
 * Класс Main поиск знака зодиака по месяцу и дню.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {

    public static void main(String args[]) {
        /** максимальное значение месяца */
        int maxMonth = 13;
        /** максимальное значение дня в месяце */
        int maxDay = 31;
        /** блок try обработки исключения превышения обращение за пределы массива */
        try {
            /** цикл вывода результатов maxMonth месяцев по maxDay дню */
            for (int j = 1; j <= maxMonth; j++) {
                for (int i = 1; i <= maxDay; i++) {

                    System.out.println("" + j + "." + i + "\t"
                            + ZodiacFinal.determineZodiac(j, i));
                }
            }
        /** блок catch при возникновении исключения вывести вообщение ArrayIndexOutOfBoundsException*/
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
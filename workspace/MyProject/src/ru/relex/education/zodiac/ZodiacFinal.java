package ru.relex.education.zodiac;

import static ru.relex.education.zodiac.SignOfZodiac.*;

/**
 * Класс задач с использованием знаков зодиака.
 * 
 * @author Vladimir K.
 * 
 */
public class ZodiacFinal {

    /** массив объектов DayChange_MaxDay_ZodiacSigns_InMonth, хранящих день */
    /** смены знака зодиакак, максимальное значение дней в месяце и два знака */
    /** зодиака в месяце */
    static ZodiacSignsInMonth signZodiacInYear[] = {
            new ZodiacSignsInMonth(21, 31, CAPRICORN),
            new ZodiacSignsInMonth(19, 29, AQUARIUS),
            new ZodiacSignsInMonth(21, 31, PISCES),
            new ZodiacSignsInMonth(21, 30, ARIES),
            new ZodiacSignsInMonth(22, 31, TAURUS),
            new ZodiacSignsInMonth(22, 30, GEMINI),
            new ZodiacSignsInMonth(23, 31, CANCER),
            new ZodiacSignsInMonth(24, 31, LEO),
            new ZodiacSignsInMonth(24, 30, VIRGO),
            new ZodiacSignsInMonth(24, 31, LIBRA),
            new ZodiacSignsInMonth(23, 30, SCORPIO),
            new ZodiacSignsInMonth(22, 31, SAGITTARIUS) };

    /**
     * 
     * @param month
     *            проверяемый месяц
     * @param day
     *            проверяемый день
     * @return результат: true - значение дня находится в разрешенном диапазоне,
     *         false - значение дня превышает в разрешенный диапазон
     */
    public static boolean check(int month, int day) {

        /** обработка исключения обращение за пределы массива */
        try {
            /** проверка с использованием массива signZodiacInYear */
            /** для конкретного месяца сравниваем с максимальным значением дня */
            return (signZodiacInYear[month - 1].getMaxDayInMonth() >= day);
            /** передать исключение на верхний уровень */
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /**
     * метод расчета значения знака зодиака по заданным дате и времени
     * 
     * @param month
     *            требуемый месяц
     * @param day
     *            требуемый день
     * @return знак зодиака типа SignOfZodiac
     */
    public static SignOfZodiac determineZodiac(int month, int day) {

        /** переменная для хранения результата вычислений - инициализация */
        SignOfZodiac signum;

        /** вызов метода проверки превышения границы месяца */
        if (check(month, day)) {

            /** обработка исключения обращение за пределы массива */
            try {
                /**
                 * проверка знака зодиака в месяце - сравненеие с граничной
                 * датой
                 */
                /** смены знака */
                if (signZodiacInYear[month - 1].getDayChangeSign() <= day)

                    /** если значение даты больше или равно граничной дате смены */
                    /** знака */
                    if (month == 12)
                        signum = signZodiacInYear[month - 12].getSign();
                    else
                        signum = signZodiacInYear[month].getSign();
                else
                    /** если значение даты меньше граничной */
                    signum = signZodiacInYear[month - 1].getSign();

                /** передать исключение на верхний уровень */
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }

            return signum;

            /** при превышении границы месяца */
        } else {
            System.out.print("Введена несуществующая дата  ");

            return null;
        }

    }

}

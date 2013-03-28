package ru.relex.education.converttometers;

/**
 * Класс расчета длинны в метрах по заданной длинне в других единицах длины.
 * 
 * @author Vladimir K.
 * 
 */
public class ConversionToMetr {
    /**
     * Метод расчета длинны в метрах по заданной длинне в других единицах длины.
     * 
     * @param type
     *            тип единиц длины
     * @param length
     *            значение длины для заданного типа
     * @return длина в метрах
     */
    public static double convert(Length type, double lenght) {
        /** результат рассчета */
        double meters;
        /** расчет значения длины в метрах */
        meters = lenght * type.getFactor();

        return meters;
    }
}

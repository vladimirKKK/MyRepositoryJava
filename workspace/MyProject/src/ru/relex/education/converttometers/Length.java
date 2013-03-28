package ru.relex.education.converttometers;

/**
 * Перечисление типов единиц измерения длинны.
 * 
 * @author Vladimir K.
 * 
 */
public enum Length {
    DECIMETER(0.1, "дециметр"), KILOMETER(1000, "километр"), METER(1, "метр"), MILLIMETER(0.001, "миллиметр"), CENTIMETER(
            0.01, "сантиметр");

    /** коэффициент для перевода в метры */
    private double factor;
    private String name;

    /**
     * Конструктор перечисления.
     * 
     * @param factor
     *            параметр коэффициента длины
     */
    Length(double factor, String name) {
        this.factor = factor;
        this.name = name; }

    /** Чтение коэффициента */
    double getFactor() {
        return factor;

    }

    public String getName() {
        return name;
    }
   
}

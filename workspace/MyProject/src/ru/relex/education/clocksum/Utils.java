package ru.relex.education.clocksum;
import ru.relex.education.time.Time;
/**
 * Класс преобразование числа минут в значения часов и минут и вывод объекта типа Time.
 *
 * @author Vladimir K.
 */
public class Utils {
/**
 * Метод преобразования минут в значения: десятков часов, часов, десятков минут, минут.
 * @param minutes
 * @return объект типа Time  с двумя полями
 */
    public static Time splite(int minutes) {
        int hour;
        int min;
        
        hour = minutes / 60;
        min = minutes % 60;
        
        Time t = new Time( hour, min );
        return t;
    }
}

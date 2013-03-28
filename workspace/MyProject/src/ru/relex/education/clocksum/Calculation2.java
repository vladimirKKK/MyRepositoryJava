package ru.relex.education.clocksum;
import ru.relex.education.time.Time;
/**
 * Класс рассчета количества зеркальных отображений в часах при диапазоне
 * времени от 00:00 до 23:59 методом сравнения значений часов и минут.
 * 
 * @author Vladimir K.
 */
public class Calculation2 implements  Calculation {
    
    public int calculate() {
        int s = 0;

        for (int i = 0; i < (24 * 60); i++) {
            Time t = Utils.splite(i);

            if (((t.getMinutes() / 10) == (t.getSeconds() % 10))
                    & (t.getMinutes() % 10 == (t.getSeconds() / 10)))
                ++s;
        }
        return s;
    }
}

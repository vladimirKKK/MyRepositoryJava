package ru.relex.education.clocksum;
/**
 * Класс рассчета количества зеркальных отображений в часах при диапазоне
 * времени от 00:00 до 23:59 методом сравнения значений.
 * 
 * @author Vladimir K.
 */
public class Calculation1 implements  Calculation {
 /**
  * Метод рассчета количества зеркальных отображений в часах при диапазоне
  * времени от 00:00 до 23:59 методом сравнения значений.
  */
    public  int calculate() {
        int s = 0;// колличество совпадений
        
        for (int i = 0; i < 24; i++) {
            if ((i % 10) < 6)
                ++s;
        }
        
        return s;
      }
}

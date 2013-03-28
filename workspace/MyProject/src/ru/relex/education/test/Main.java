package ru.relex.education.test;
import java.text.ParseException;
/**
 * Класс выполнения задачи: подсчет количества зеркальных отображений в часах
 * при диапазоне времени от 00:00 до 23:59.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {
    
    public static void main(String[] args) throws ParseException{
        long b = System.currentTimeMillis();
        int s = Calculation.calculate();
        long a = System.currentTimeMillis();
        String sss = null;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a-b);
        System.out.print(s);
    }

}

package ru.relex.education.technumber;


/**
 * Класс подсчета числа включений заданных элементов в числах от 0 до заданного.
 * @author Vladimir K.
 */
public class Calculation {

    /**--------------------------------
     * @param number максимальное число
     * @param element1 первый элемент поиска
     * @param element2 второй элемент поиска
     */
    public static int calculate(int number, int element1, int element2) {
        int s = 0;
        String a = Integer.toString(element1);
        String b = Integer.toString(element2);
        
        for (int i = 0; i <= number; i++) {
            
            if ((Integer.toString(i).contains(a)) || (Integer.toString(i).contains(b))) {
                s = s + 1;
            }
        }
        return s;
    }
}

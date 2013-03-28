package ru.relex.education.repeatNumber;

import java.util.*;

/**
 * Класс модификаций массива.
 * @author Vladimir K.
 *
 */
public class ChangesArray {
    /**
     * Метод поиска максимального цедочисленного значения в массиве.
     * @param array массив поиска
     * @return максимальное значение в массиве
     */
    static int getMaxValue(int[] array) {
        /* Инициализация переменной для хранения максимального значения */
        int maxValue = array[0];
        /* Запуск цикла для поиска максимального значения */
        for (int i = 1; i < array.length; i++) {
            /* Если значение элемента массива больше текущего максимального значения -
             *  присвоить его значение текущему максимальному значению */
            if (array[i] > maxValue) maxValue = array[i];
        }
        /* Вывод максимального значения */
        return maxValue;
    }
    /**
     * Метод фильтрации максимальных значений в массиве.
     * @param numRepeatArray исходный массив
     * @param maxValue максимальное значение в массиве
     * @return результирующий массив с максимальными значениями в массиве
     */
    static List<Integer> returnMax(int[] numRepeatArray, int maxValue){
        
        List<Integer> result = new ArrayList<Integer>();
        //listOfIntegers.add(Integer.valueOf(238));
        //List<Integer> listOfIntegers = new List();
        //Logger l = Logger.getLogger("Test");
        //for (Integer i : listOfIntegers) {
          //l.info("Integer value is : " + i);
       // }
        for (int i = 0; i < numRepeatArray.length; i++) {
            /* элементам массива с не максимальным значением присваивается значение 0 */
            if (numRepeatArray[i] == maxValue) result.add(i);
        }
        return result;
    }
}

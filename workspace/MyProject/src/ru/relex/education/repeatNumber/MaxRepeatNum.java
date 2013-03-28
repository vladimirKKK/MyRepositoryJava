package ru.relex.education.repeatNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс рачсета наибольшего колличества повторов чисел, в передаваемой строке.
 * 
 * @author Vladimir K.
 * 
 */
public class MaxRepeatNum {
    public MaxRepeatNum (int maxValue, List<Integer> resultList){}
    
    /* Массив для хранения результатов подсчета */

    /**
     * Метод расчета наибольшего колличества повторов чисел, в передаваемой
     * строке
     * 
     * @param str
     *            исходная строка
     * @return результирующий массив, хранящий наибольшее колличество повторов
     *         чисел, в передаваемой строке
     */
    public static ResultObject consider(String str) {
        List<Integer> resultList = new ArrayList<Integer>();
        /* Переменная для хранения args[0] */
        /* Переменная для хранения текуущего прочитанного символа */
        char ch;
        /* Переменная для хранения максимального значения в массиве */
        int maxValue;
        int numRepeat[] = new int[10];
        /* Чтение символов из args[0] */
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (ch >= '0' && ch <= '9')
                numRepeat[ch - '0']++;
        }
        /* Вызов метода поиска максимального значения в массиве */
        maxValue = ChangesArray.getMaxValue(numRepeat);
        /* Вызов метода обнуления не максимальных значений в массиве */
        resultList = ChangesArray.returnMax(numRepeat, maxValue);
        /*
         * Результирующий массив, содержащий максимальные значения повторов
         * числел в строке
         */
        ResultObject resultObject = new ResultObject(maxValue, resultList);
        return  resultObject;
    }
}

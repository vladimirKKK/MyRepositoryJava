package ru.relex.education.repeatNumber;

import java.util.List;

/**
 * Класс формирования объекта с полями максимального значения повторов и списка
 * чисел с наибольшим колличеством повторов.
 * 
 * @author Vladimir K.
 * 
 */
public class ResultObject {
    private int maxValue;
    private List<Integer> resultList;

    /**
     * Конструктор объекта типа ResultObject.
     * 
     * @param maxValue
     *            максимальное значение повторов
     * @param resultList
     *            список чисел с наибольшим колличеством повторов
     */
    public ResultObject(int maxValue, List<Integer> resultList) {
        this.maxValue = maxValue;
        this.resultList = resultList;
    }

    /**
     * Метод вывода максимального значения повторов
     * 
     * @return максимальное колличество повторов
     */
    public int getmaxValue() {
        return maxValue;
    }

    /**
     * Метод вывода списка чисел с наибольшим колличеством повторов
     * 
     * @return список чисел с наибольшим колличеством повторов
     */
    public List<Integer> getresultList() {
        return resultList;
    }

}

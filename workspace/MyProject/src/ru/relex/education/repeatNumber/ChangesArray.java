package ru.relex.education.repeatNumber;

import java.util.*;

/**
 * ����� ����������� �������.
 * @author Vladimir K.
 *
 */
public class ChangesArray {
    /**
     * ����� ������ ������������� �������������� �������� � �������.
     * @param array ������ ������
     * @return ������������ �������� � �������
     */
    static int getMaxValue(int[] array) {
        /* ������������� ���������� ��� �������� ������������� �������� */
        int maxValue = array[0];
        /* ������ ����� ��� ������ ������������� �������� */
        for (int i = 1; i < array.length; i++) {
            /* ���� �������� �������� ������� ������ �������� ������������� �������� -
             *  ��������� ��� �������� �������� ������������� �������� */
            if (array[i] > maxValue) maxValue = array[i];
        }
        /* ����� ������������� �������� */
        return maxValue;
    }
    /**
     * ����� ���������� ������������ �������� � �������.
     * @param numRepeatArray �������� ������
     * @param maxValue ������������ �������� � �������
     * @return �������������� ������ � ������������� ���������� � �������
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
            /* ��������� ������� � �� ������������ ��������� ������������� �������� 0 */
            if (numRepeatArray[i] == maxValue) result.add(i);
        }
        return result;
    }
}

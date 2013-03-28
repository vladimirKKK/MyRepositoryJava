package ru.relex.education.repeatNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * ����� ������� ����������� ����������� �������� �����, � ������������ ������.
 * 
 * @author Vladimir K.
 * 
 */
public class MaxRepeatNum {
    public MaxRepeatNum (int maxValue, List<Integer> resultList){}
    
    /* ������ ��� �������� ����������� �������� */

    /**
     * ����� ������� ����������� ����������� �������� �����, � ������������
     * ������
     * 
     * @param str
     *            �������� ������
     * @return �������������� ������, �������� ���������� ����������� ��������
     *         �����, � ������������ ������
     */
    public static ResultObject consider(String str) {
        List<Integer> resultList = new ArrayList<Integer>();
        /* ���������� ��� �������� args[0] */
        /* ���������� ��� �������� ��������� ������������ ������� */
        char ch;
        /* ���������� ��� �������� ������������� �������� � ������� */
        int maxValue;
        int numRepeat[] = new int[10];
        /* ������ �������� �� args[0] */
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (ch >= '0' && ch <= '9')
                numRepeat[ch - '0']++;
        }
        /* ����� ������ ������ ������������� �������� � ������� */
        maxValue = ChangesArray.getMaxValue(numRepeat);
        /* ����� ������ ��������� �� ������������ �������� � ������� */
        resultList = ChangesArray.returnMax(numRepeat, maxValue);
        /*
         * �������������� ������, ���������� ������������ �������� ��������
         * ������ � ������
         */
        ResultObject resultObject = new ResultObject(maxValue, resultList);
        return  resultObject;
    }
}

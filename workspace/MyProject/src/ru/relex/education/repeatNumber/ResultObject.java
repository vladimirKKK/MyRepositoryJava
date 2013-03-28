package ru.relex.education.repeatNumber;

import java.util.List;

/**
 * ����� ������������ ������� � ������ ������������� �������� �������� � ������
 * ����� � ���������� ������������ ��������.
 * 
 * @author Vladimir K.
 * 
 */
public class ResultObject {
    private int maxValue;
    private List<Integer> resultList;

    /**
     * ����������� ������� ���� ResultObject.
     * 
     * @param maxValue
     *            ������������ �������� ��������
     * @param resultList
     *            ������ ����� � ���������� ������������ ��������
     */
    public ResultObject(int maxValue, List<Integer> resultList) {
        this.maxValue = maxValue;
        this.resultList = resultList;
    }

    /**
     * ����� ������ ������������� �������� ��������
     * 
     * @return ������������ ����������� ��������
     */
    public int getmaxValue() {
        return maxValue;
    }

    /**
     * ����� ������ ������ ����� � ���������� ������������ ��������
     * 
     * @return ������ ����� � ���������� ������������ ��������
     */
    public List<Integer> getresultList() {
        return resultList;
    }

}

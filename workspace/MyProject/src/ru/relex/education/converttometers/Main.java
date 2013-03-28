package ru.relex.education.converttometers;

import static ru.relex.education.converttometers.Length.*;

/**
 * ����� Main ������� ������ �������������� �������� ��������� ������ ���������
 * ����� � �����.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {

    public static void main(String[] args) {

        Length len = MILLIMETER;
        double amount = 10;
        System.out.println("source length = " + amount + "(" + len +")");
        
        /** ���������� resultate ������������� ��������� ���������� ������ */
        double result = ConversionToMetr.convert(len, amount);
        System.out.println("length in meters = " + result);
    }

}

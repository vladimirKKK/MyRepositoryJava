package ru.relex.education.clocksum;
/**
 * ����� �������� ���������� ���������� ����������� � ����� ��� ���������
 * ������� �� 00:00 �� 23:59 ������� ��������� ��������.
 * 
 * @author Vladimir K.
 */
public class Calculation1 implements  Calculation {
 /**
  * ����� �������� ���������� ���������� ����������� � ����� ��� ���������
  * ������� �� 00:00 �� 23:59 ������� ��������� ��������.
  */
    public  int calculate() {
        int s = 0;// ����������� ����������
        
        for (int i = 0; i < 24; i++) {
            if ((i % 10) < 6)
                ++s;
        }
        
        return s;
      }
}

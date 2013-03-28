package ru.relex.education.clocksum;
import ru.relex.education.time.Time;
/**
 * ����� �������� ���������� ���������� ����������� � ����� ��� ���������
 * ������� �� 00:00 �� 23:59 ������� ��������� �������� ����� � �����.
 * 
 * @author Vladimir K.
 */
public class Calculation2 implements  Calculation {
    
    public int calculate() {
        int s = 0;

        for (int i = 0; i < (24 * 60); i++) {
            Time t = Utils.splite(i);

            if (((t.getMinutes() / 10) == (t.getSeconds() % 10))
                    & (t.getMinutes() % 10 == (t.getSeconds() / 10)))
                ++s;
        }
        return s;
    }
}

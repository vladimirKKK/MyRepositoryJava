package ru.relex.education.clocksum;
import ru.relex.education.time.Time;
/**
 * ����� �������������� ����� ����� � �������� ����� � ����� � ����� ������� ���� Time.
 *
 * @author Vladimir K.
 */
public class Utils {
/**
 * ����� �������������� ����� � ��������: �������� �����, �����, �������� �����, �����.
 * @param minutes
 * @return ������ ���� Time  � ����� ������
 */
    public static Time splite(int minutes) {
        int hour;
        int min;
        
        hour = minutes / 60;
        min = minutes % 60;
        
        Time t = new Time( hour, min );
        return t;
    }
}

package ru.relex.education.time;

/**
 * ����� ������������ �������� ����� � ������.
 * @param ����� ������
 * @author Vladimir K.
 *
 */
public class Utils {

    public static Time splite(int seconds) {
        int min;
        int sec;
        min = (seconds % 3600) / 60;
        sec = (seconds % 3600) % 60;
        Time t = new Time( min, sec );
        return t;
    }
}

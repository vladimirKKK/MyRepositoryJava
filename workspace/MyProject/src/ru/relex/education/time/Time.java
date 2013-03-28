package ru.relex.education.time;
/**
 * ����� ������������ ������� ���� Time � ������ min  � sec.
 * 
 * @author Vladimir K.
 *
 */
public class Time {
    private int minutes;
    private int seconds;

    public Time(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

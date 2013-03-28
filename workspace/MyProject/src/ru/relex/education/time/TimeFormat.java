package ru.relex.education.time;

/**
 * ����� ������������ ������������ ������ �� ��������� ������� ������.
 * @param ������� ������
 * @author Vladimir K.
 *
 */
public class TimeFormat {
    private final String formatString;

    public TimeFormat(String formatString) {
        this.formatString = formatString;
    }

    public String format(Time t) {
        return String.format(formatString, t.getMinutes(), t.getSeconds());
    }

}

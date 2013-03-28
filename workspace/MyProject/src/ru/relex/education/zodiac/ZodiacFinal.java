package ru.relex.education.zodiac;

import static ru.relex.education.zodiac.SignOfZodiac.*;

/**
 * ����� ����� � �������������� ������ �������.
 * 
 * @author Vladimir K.
 * 
 */
public class ZodiacFinal {

    /** ������ �������� DayChange_MaxDay_ZodiacSigns_InMonth, �������� ���� */
    /** ����� ����� ��������, ������������ �������� ���� � ������ � ��� ����� */
    /** ������� � ������ */
    static ZodiacSignsInMonth signZodiacInYear[] = {
            new ZodiacSignsInMonth(21, 31, CAPRICORN),
            new ZodiacSignsInMonth(19, 29, AQUARIUS),
            new ZodiacSignsInMonth(21, 31, PISCES),
            new ZodiacSignsInMonth(21, 30, ARIES),
            new ZodiacSignsInMonth(22, 31, TAURUS),
            new ZodiacSignsInMonth(22, 30, GEMINI),
            new ZodiacSignsInMonth(23, 31, CANCER),
            new ZodiacSignsInMonth(24, 31, LEO),
            new ZodiacSignsInMonth(24, 30, VIRGO),
            new ZodiacSignsInMonth(24, 31, LIBRA),
            new ZodiacSignsInMonth(23, 30, SCORPIO),
            new ZodiacSignsInMonth(22, 31, SAGITTARIUS) };

    /**
     * 
     * @param month
     *            ����������� �����
     * @param day
     *            ����������� ����
     * @return ���������: true - �������� ��� ��������� � ����������� ���������,
     *         false - �������� ��� ��������� � ����������� ��������
     */
    public static boolean check(int month, int day) {

        /** ��������� ���������� ��������� �� ������� ������� */
        try {
            /** �������� � �������������� ������� signZodiacInYear */
            /** ��� ����������� ������ ���������� � ������������ ��������� ��� */
            return (signZodiacInYear[month - 1].getMaxDayInMonth() >= day);
            /** �������� ���������� �� ������� ������� */
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /**
     * ����� ������� �������� ����� ������� �� �������� ���� � �������
     * 
     * @param month
     *            ��������� �����
     * @param day
     *            ��������� ����
     * @return ���� ������� ���� SignOfZodiac
     */
    public static SignOfZodiac determineZodiac(int month, int day) {

        /** ���������� ��� �������� ���������� ���������� - ������������� */
        SignOfZodiac signum;

        /** ����� ������ �������� ���������� ������� ������ */
        if (check(month, day)) {

            /** ��������� ���������� ��������� �� ������� ������� */
            try {
                /**
                 * �������� ����� ������� � ������ - ���������� � ���������
                 * �����
                 */
                /** ����� ����� */
                if (signZodiacInYear[month - 1].getDayChangeSign() <= day)

                    /** ���� �������� ���� ������ ��� ����� ��������� ���� ����� */
                    /** ����� */
                    if (month == 12)
                        signum = signZodiacInYear[month - 12].getSign();
                    else
                        signum = signZodiacInYear[month].getSign();
                else
                    /** ���� �������� ���� ������ ��������� */
                    signum = signZodiacInYear[month - 1].getSign();

                /** �������� ���������� �� ������� ������� */
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }

            return signum;

            /** ��� ���������� ������� ������ */
        } else {
            System.out.print("������� �������������� ����  ");

            return null;
        }

    }

}

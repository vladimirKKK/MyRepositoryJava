package ru.relex.education.zodiac;
/**
 * ����� ��� �������� ���������� ������
 * 
 * @author Vladimir K.
 *
 */
public class ZodiacSignsInMonth {
    // ���������� ��� �������� ������������� ��� � ������
    private int maxDayInMonth;
    
    // ���������� ��� �������� ��� ����� ����� ������� � ������
    private int dayChangeSign;
    
    // ���������� ��� �������� �������� ����� ������� � ������� �������� ������
    private SignOfZodiac sign;
    
/**
 * ����������� �������� ZodiacSignsInMonth
 * @param dayChangeSign ���� ����� ����� ������� � ������
 * @param maxDayInMonth ������������ ���� � ������
 * @param sign1 �������� ����� ������� � ������� �������� ������
 * @param sign2 �������� ����� ������� � ������ �������� ������
 */
    ZodiacSignsInMonth(int dayChangeSign, int maxDayInMonth, SignOfZodiac sign) {
        this.maxDayInMonth = maxDayInMonth;
        this.dayChangeSign = dayChangeSign;
        this.sign = sign;
          }
/**
 * ����� ������ ������������� ��� � ������
 * @return ������������ ���� � ������
 */
    public int getMaxDayInMonth() {
        return maxDayInMonth;
    }
    /**
     * ����� ������ ��� ����� ����� ������� � ������
     * @return ���� ����� ����� ������� � ������
     */
    public int getDayChangeSign() {
        return dayChangeSign;
    }
/**
 * ����� ������ �������� ����� ������� � ������� �������� ������
 * @return �������� ����� ������� � ������� �������� ������
 */
    public SignOfZodiac getSign() {
        return sign;
    }
   
}

package ru.relex.education.zodiac;
/**
 *  ласс дл€ хранени€ информации мес€ца
 * 
 * @author Vladimir K.
 *
 */
public class ZodiacSignsInMonth {
    // переменна€ дл€ хранени€ максимального дн€ в мес€це
    private int maxDayInMonth;
    
    // переменна€ дл€ хранени€ дн€ смены знака зодиака в мес€це
    private int dayChangeSign;
    
    // переменна€ дл€ хранени€ значени€ знака зодиака в перквой половине мес€ца
    private SignOfZodiac sign;
    
/**
 *  онструктор объектов ZodiacSignsInMonth
 * @param dayChangeSign день смены знака зодиака в мес€це
 * @param maxDayInMonth максимальный день в мес€це
 * @param sign1 значени€ знака зодиака в перквой половине мес€ца
 * @param sign2 значени€ знака зодиака в второй половине мес€ца
 */
    ZodiacSignsInMonth(int dayChangeSign, int maxDayInMonth, SignOfZodiac sign) {
        this.maxDayInMonth = maxDayInMonth;
        this.dayChangeSign = dayChangeSign;
        this.sign = sign;
          }
/**
 * ћетод вывода максимального дн€ в мес€це
 * @return максимальный день в мес€це
 */
    public int getMaxDayInMonth() {
        return maxDayInMonth;
    }
    /**
     * ћетод вывода дн€ смены знака зодиака в мес€це
     * @return день смены знака зодиака в мес€це
     */
    public int getDayChangeSign() {
        return dayChangeSign;
    }
/**
 * ћетод вывода значени€ знака зодиака в перквой половине мес€ца
 * @return значени€ знака зодиака в перквой половине мес€ца
 */
    public SignOfZodiac getSign() {
        return sign;
    }
   
}

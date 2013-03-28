package ru.relex.education.time;

/**
 * Класс создания выходной таблицы результатов.
 * 
 * @param firstsec
 *            начало диапазона секунд
 * @param lastsec
 *            окончание диапазона секунд
 * @param numbercolumn
 *            количество столбцов
 * @author Vladimir K.
 */
public class TableOfResults {
    /**@ex1 формат строки: ХХ min XX sec
     * @ex2 формат строки: ХХ : XX 
     */
    public static void formatAsTable(int firstsec, int lastsec, int numbercolumn) {
        
        TimeFormat ex1 = new TimeFormat("%1$02d min %2$02d sec   ");
        TimeFormat ex2 = new TimeFormat("%1$02d : %2$02d   ");

        for (int i = firstsec; i <= lastsec; ++i) {
            Time t = Utils.splite(i);
            int col = (i - firstsec) % numbercolumn;
            String s = (col % 2) == 0 ? ex1.format(t) : ex2.format(t);
            System.out.print(s);
            if (col == numbercolumn - 1) {
                System.out.println();
            }
        }
    }
}

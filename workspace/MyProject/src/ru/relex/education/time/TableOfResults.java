package ru.relex.education.time;

/**
 * ����� �������� �������� ������� �����������.
 * 
 * @param firstsec
 *            ������ ��������� ������
 * @param lastsec
 *            ��������� ��������� ������
 * @param numbercolumn
 *            ���������� ��������
 * @author Vladimir K.
 */
public class TableOfResults {
    /**@ex1 ������ ������: �� min XX sec
     * @ex2 ������ ������: �� : XX 
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

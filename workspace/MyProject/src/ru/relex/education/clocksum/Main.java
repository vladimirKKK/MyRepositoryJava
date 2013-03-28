package ru.relex.education.clocksum;

/**
 * Main класс выполнения задачи - подсчет времени выполнения одной операции двумя
 * методами.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {

    public static void main(String[] args) {
        double mc;// результат вычисления

        final Calculation c1 = new Calculation1();
        final Calculation c2 = new Calculation2();

        Runnable runnable1 = new Runnable() {

            @Override
            public void run() {
                c1.calculate();
            }
        };
        Runnable runnable2 = new Runnable() {

            @Override
            public void run() {
                c2.calculate();
            }
        };
        mc = TimeExecutionOperations.timeExecute(runnable1);
        System.out.println("Одна операция занимает " + mc + " мс");

        mc = TimeExecutionOperations.timeExecute(runnable2);
        System.out.println("Одна операция занимает " + mc + " мс");
    }
    
    
}

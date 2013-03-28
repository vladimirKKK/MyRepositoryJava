package ru.relex.education.clocksum;

/**
 * Класс подсчета времени выполнения одной операции в течении заданного
 * интервала времени.
 * 
 * @author Vladimir K.
 */
public class TimeExecutionOperations {

    /**
     * Метод подсчета времени выполнения одной операции в течении заданного
     * интервала времени.
     * 
     * @param объект исследуемого метода
     */
    public static double timeExecute(Runnable runnable) {
        long differenceTime = 0; // разность времени вычисления операции
        long finalTime = 0; //время после выполнением операции
        long startTime = 0; //время перед выполнением операции
        int numberOfIteration = 10000;

        while (differenceTime < 3000) {
            numberOfIteration = numberOfIteration * 2;
            startTime = System.currentTimeMillis();

            for (int j = 0; j < numberOfIteration; j++) {
                runnable.run();
            }
            finalTime = System.currentTimeMillis();
            differenceTime = finalTime - startTime;
        }
        return (differenceTime + 0d) / numberOfIteration;
    }
}

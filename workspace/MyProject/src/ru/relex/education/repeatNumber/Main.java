package ru.relex.education.repeatNumber;

/**
 * Main класс решения задачи вывод наибольшего колличества повторов числа в
 * передаваемой строке.
 * 
 * @author Vladimir K.
 * 
 */
public class Main {
    public static void main(String[] args) {
        /* Проверка наличия args[0] */
        if (args.length != 0) {
        
         /*
         * Вызов метода расчета колличества повторов чисел от 0 до 9 в строке и
         * загрузка максимальных значений в объект класса ResultObject(int maxValue, List<Integer> resultList)
         */
        ResultObject resultObject = MaxRepeatNum.consider(args[0]);

        /* Вывод результатов */
        printResult(resultObject);
        }
        /* Собщение при запуске программы без исходной строки */
        else System.out.println(" No enter original string ");
        
    }

    private static void printResult(ResultObject resultObject) {
        System.out.print("Max repeat number : " + resultObject.getmaxValue()
                + " Number is : ");
        for (Integer i : resultObject.getresultList()) {
            /* Вывод результатов */
            System.out.print("  " + i + "  ");

        }
    }
}

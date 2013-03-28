package ru.relex.education.matrix;
/**
 * Класс вывода матрицы на консоль.
 * @author Vladimir K.
 *
 */
public class OutputMatrix {
    /**
     * Метод вывода матрицы на консоль.
     * @param matrix матрица для вывода
     */
   static void outputter ( int[][] matrix){
       /* Цикл для вывода по строкам */
        for(int i = 0; i<matrix.length; i++){
            /* Цикл для вывода по столбцам */
            for(int j = 0; j<matrix[i].length; j++){
                /* вывод элемента матрицы */
        System.out.print(matrix[i][j]);
            }
            /*Вывод новой стоки матрицы с новой строки */
            System.out.println();
        }
    }

}

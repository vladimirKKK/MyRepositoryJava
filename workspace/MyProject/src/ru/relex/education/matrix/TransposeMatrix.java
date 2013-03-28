package ru.relex.education.matrix;
/**
 * Класс транспонирования матрицы и пеперачи результата вызывающему методу.
 * @author Vladimir K.
 *
 */
public class TransposeMatrix {
    /**
     * Метод транспонирования матрицы.
     * @param matrix исходная матрица
     * @return транспонированная матрица
     */
    static int[][]  transpose (int[][] matrix){
        /* Создание новой матрицы по размерам исходной матрицы */
        int[][] tranMatrix = new int[matrix[1].length][matrix.length];
        /* Цикл смены строк на сторбцы */
        for(int i = 0; i<matrix.length; i++){
            /* Цикл смены сторбцов  на строки */
            for(int j = 0; j<matrix[i].length; j++){
                /* Заполнение транспонированной матрицы */
                tranMatrix[i][j]=matrix[j][i];
            }
        }
        /* Вывод транспонированной матрицы */
        return tranMatrix;
    }

}

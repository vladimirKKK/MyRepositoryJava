package ru.relex.education.matrix;
/**
 * Main класс решения задачи транспонирования матрицы.
 * @author Vladimir K.
 *
 */
public class MainMatrix {
    /* Исходная матрица */
    static int[][] a = {{1,2,3},{4, 5, 6}, {7,8,9}};
    
    public static void main(String[] args) {
    /* Вызов метода транспонирования матрицы */
       int[][] b = TransposeMatrix.transpose(a);
              
       System.out.println("Построчный вывод исходной матрицы : ");
       /* Вызов метода построчного вывода исходной матрицы */
        OutputMatrix.outputter(a);
        
       System.out.println("Построчный вывод транспонированной матрицы : ");
       /* Вызов метода построчного вывода транспонированной матрицы */
        OutputMatrix.outputter(b);

    }

}

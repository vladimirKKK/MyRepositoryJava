package ru.relex.education.matrix;
/**
 * ����� ������ ������� �� �������.
 * @author Vladimir K.
 *
 */
public class OutputMatrix {
    /**
     * ����� ������ ������� �� �������.
     * @param matrix ������� ��� ������
     */
   static void outputter ( int[][] matrix){
       /* ���� ��� ������ �� ������� */
        for(int i = 0; i<matrix.length; i++){
            /* ���� ��� ������ �� �������� */
            for(int j = 0; j<matrix[i].length; j++){
                /* ����� �������� ������� */
        System.out.print(matrix[i][j]);
            }
            /*����� ����� ����� ������� � ����� ������ */
            System.out.println();
        }
    }

}

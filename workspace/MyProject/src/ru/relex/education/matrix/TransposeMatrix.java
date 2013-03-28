package ru.relex.education.matrix;
/**
 * ����� ���������������� ������� � �������� ���������� ����������� ������.
 * @author Vladimir K.
 *
 */
public class TransposeMatrix {
    /**
     * ����� ���������������� �������.
     * @param matrix �������� �������
     * @return ����������������� �������
     */
    static int[][]  transpose (int[][] matrix){
        /* �������� ����� ������� �� �������� �������� ������� */
        int[][] tranMatrix = new int[matrix[1].length][matrix.length];
        /* ���� ����� ����� �� ������� */
        for(int i = 0; i<matrix.length; i++){
            /* ���� ����� ��������  �� ������ */
            for(int j = 0; j<matrix[i].length; j++){
                /* ���������� ����������������� ������� */
                tranMatrix[i][j]=matrix[j][i];
            }
        }
        /* ����� ����������������� ������� */
        return tranMatrix;
    }

}

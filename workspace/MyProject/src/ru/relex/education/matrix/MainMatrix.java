package ru.relex.education.matrix;
/**
 * Main ����� ������� ������ ���������������� �������.
 * @author Vladimir K.
 *
 */
public class MainMatrix {
    /* �������� ������� */
    static int[][] a = {{1,2,3},{4, 5, 6}, {7,8,9}};
    
    public static void main(String[] args) {
    /* ����� ������ ���������������� ������� */
       int[][] b = TransposeMatrix.transpose(a);
              
       System.out.println("���������� ����� �������� ������� : ");
       /* ����� ������ ����������� ������ �������� ������� */
        OutputMatrix.outputter(a);
        
       System.out.println("���������� ����� ����������������� ������� : ");
       /* ����� ������ ����������� ������ ����������������� ������� */
        OutputMatrix.outputter(b);

    }

}

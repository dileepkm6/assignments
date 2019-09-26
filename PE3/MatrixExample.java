import java.util.Scanner;

public class MatrixExample {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of rows of matrix:");
        int row=scanner.nextInt();
        System.out.println("Input number of columns of matrix:");
        int col=scanner.nextInt();
        System.out.println("Input elements of first matrix:");
        int matrix1[][]=new int[row][col];
        int matrix2[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Input the elements of second matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix2[i][j]=scanner.nextInt();
            }
        }
        int sumOfMatrix[][]=new int[row][col];
        MatrixAddition matrixAddition=new MatrixAddition();
        sumOfMatrix=matrixAddition.additionOfTwoMatrix(matrix1,matrix2,row,col);
        System.out.println("Sum of the matrices:-");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sumOfMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class MatrixAddition
{
    public int[][] additionOfTwoMatrix(int matrix1[][],int matrix2[][],int row,int col)
    {
        int temp[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                temp[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return temp;
    }
}
import java.util.Scanner;
public class MatrixAddition
{
  static Scanner in = new Scanner(System.in);
  
  public static void main(String args[])
  {
    int m, n, c, d;

    System.out.println("Enter the number of rows and columns of matrix");
    m = in.nextInt();
    n = in.nextInt();

    int first[][] = loadMatrix('first', m, n);
    int second[][] = loadMatrix('second', m, n);
    int sum[][] = doMatrixSum(first, second);

    printMatrixSum(sum);   
  }
  
  private static int[][] loadMatrix(String identifier, int rows, int cols) {
    System.out.println("Enter the elements of " + identifier + " matrix: ");
    
    int[][] matrix = new int[rows][cols];

    for (int r = 0; r < rows; r++)
      for (int c = 0; c < cols; c++)
        matrix[r][c] = in.nextInt();
    
    return matrix;
  }
  
  private static int[][] doMatrixSum(int[][] matrixA, int[][] matrixB) {
    int rows = matrixA.length;
    int cols = matrixA[0].length;
    int sum[][] = new int[rows][cols];
    
    for (int r = 0; r < rows; c++)
      for (int c = 0; c < cols; c++)
        sum[r][c] = matrixA[r][c] + matrixB[r][c];
    
    return sum;
  }
  
  private static void printMatrixSum(int[][] sum) {
     int rows = sum.length;
     int cols = sum[0].length;
    
     System.out.println("Sum of the matrices:");

     for (int r = 0; r < rows; r++)
     {
        for (int c = 0; c < cols; c++)
          System.out.print(sum[r][c] + "\t");

        System.out.println();
     }
  }
}

import java.util.Scanner;
 
public class MatrixMultiplication{  
  static Scanner s = new Scanner(System.in);
 
  public static void main(String args[]){   
    int row1, col1, row2, col2;
    System.out.print("Enter number of rows in first matrix:");
    row1 = s.nextInt();
    System.out.print("Enter number of columns in first matrix:");
    col1 = s.nextInt();
    System.out.print("Enter number of rows in second matrix:");
    row2 = s.nextInt();
    System.out.print("Enter number of columns in second matrix:");
    col2 = s.nextInt();
 
    if (col1 != row2) {
        System.out.println("Matrix multiplication is not possible");
    }
    else {
        int a[][] = loadMatrix("A", row1, col1);
        int b[][] = loadMatrix("B", row2, col2);
        int c[][] = new int[row1][col2];
     
        System.out.println("Matrix multiplication is : \n");
        for(int i = 0; i < row1; i++) {    
            for(int j = 0; j < col2; j++){    
              c[i][j]=0;      
              for(int k = 0; k < col1; k++){      
                c[i][j] += a[i][k] * b[k][j];      
              }
              System.out.print(c[i][j] + " ");  
            }
            System.out.println();
        }    
    }
  }
 
  private static int[][] loadMatrix(String identifier, int rows, int cols) {
     System.out.println("Enter values for matrix " + identifier + " : \n");
     int [][] m = new int[rows][cols];
     for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) 
             m[i][j] = s.nextInt();
     }
     
     return m;
  }
}

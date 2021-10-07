
import java.util.Scanner;

class BubbleSort {
  static Scanner input = new Scanner(System.in);
  
  public static void main(String []args) {
    int num, i, j, temp;
 
    System.out.println("Enter the number of integers to sort:");
    num = input.nextInt();
 
    int array[] = loadArray(num);
 
    arraySort(array);
 
    printArray(array);
  }
  
  private static int[] loadArray(int num) {
    System.out.println("Enter " + num + " integers: ");
 
    int[] array;
    
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
    
    return array;
  }
  
  private static void arraySort(int[] array) {
    for (int i = 0; i < ( num - 1 ); i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (i != j && array[j] > array[j+1]) 
        {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
        }
      }
    }
  }
  
  private static void printArray(int[] array) {
    System.out.println("Sorted list of integers:");
 
    for (int i = 0; i < num; i++) 
      System.out.println(array[i]);
  }
}

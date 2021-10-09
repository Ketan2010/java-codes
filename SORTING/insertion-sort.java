
import java.util.Scanner;

class InsertionSort {
  public static void main(String []args) {
    int num, i, j, temp;
    Scanner input = new Scanner(System.in);
 
    System.out.println("Enter the number of integers to sort:");
    num = input.nextInt();
 
    int array[] = new int[num];
 
    System.out.println("Enter " + num + " integers: ");
 
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
 
    for (i = 0; i < array.length; i++) {
        // min is the index of the smallest element with an index greater or equal to i
        int min = i;
        for (j = i + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        // Swapping i-th and min-th elements
        int swap = array[i];
        array[i] = array[min];
        array[min] = swap;
    }
 
    System.out.println("Sorted list of integers:");
 
    for (i = 0; i < num; i++) 
      System.out.println(array[i]);
  }
}

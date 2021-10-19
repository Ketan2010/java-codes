// Java program that implements Quick sort algorithm for sorting a list of names in ascending order.

import java.io.*;
public class quick_sort
{
    //Function to display the list of names
    void display(String arr[], int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //Function to partition the array
    int partition(String arr[], int lb, int ub)
    {
        String pivot,temp;
        int up,down;

        pivot=arr[lb]; //first element is taken as the pivot
        up=ub;
        down=lb;

        while(down<up)
        {
            while((arr[down].compareToIgnoreCase(pivot)<=0)&&down<ub)
                down++; //moving the down pointer
            while(arr[up].compareToIgnoreCase(pivot)>0)
                up--; //moving the up pointer
                
            if(down<up)
            {
                //swapping arr[down] and arr[up]
                temp=arr[down];
                arr[down]=arr[up];
                arr[up]=temp;
            }
        }

        //swapping pivot(in position lb) and arr[up]
        arr[lb]=arr[up];
        arr[up]=pivot;

        return up;
    }

    //Function to sort the elements of the array in ascending order
    void sort(String arr[], int lb, int ub)
    {
        int j;

        if(lb>=ub)
            return;

        j=partition(arr,lb,ub);
        
        sort(arr,lb,j-1); //sorting the array to the left of pivot
        sort(arr,j+1,ub); //sorting the array to the right of pivot
    }

    public static void main(String args[]) throws IOException
    {
        quick_sort obj=new quick_sort();
        int n;

        //create a BufferedReader using System.in
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the number of elements in the list: ");
        n=Integer.valueOf(br.readLine()); 

        String arr[]= new String[n];

        //Accepting the array of strings
        System.out.println("\nEnter the list of names:");
        for(int i=0;i<n;i++)
        {
            arr[i]=br.readLine();
        }

        System.out.println("\nInput array:");
        obj.display(arr,n);

        obj.sort(arr,0,n-1);

        System.out.println("\nArray sorted in ascending order:");
        obj.display(arr,n);

    }
}
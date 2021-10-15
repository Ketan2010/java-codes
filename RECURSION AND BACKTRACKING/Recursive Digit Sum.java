import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String N, int k) {
        long sum=0;
        System.out.println(N.length());
        if(N.length()==1)
        {
            sum=Long.parseLong(String.valueOf(N.charAt(0)));
            sum=sum*k;
            N=Long.toString(sum);
        }
        while(N.length()>1)
        {
            
            sum=0;
            int j=0;
             for(int i=0;i<N.length();i++)
            {
                sum+=Integer.parseInt(String.valueOf(N.charAt(i)));
                j++;
           //    System.out.println(i+" "+sum);
            }
            System.out.println(j+" "+sum+" "+k);
            sum*=k;
            k=1;
            System.out.println(j+" "+sum+" "+k);
            N=Long.toString(sum);
            System.out.println("N:"+N);
         }
         
         return (int)sum;
    } 
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

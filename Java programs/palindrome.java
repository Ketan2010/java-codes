import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int j=0;
        int l = A.length();
       
        char[] ch = A.toCharArray();
        for(int i=0;i<=l/2;i++)
        {
            if(ch[i]!=ch[l-i-1]){
                j=1;
                break;
            }
        }
        if(j==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}




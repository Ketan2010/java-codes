import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
    public boolean check(int x){
        int t=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                t++;
            }
        }
        if(t==2){
            return true;
        }
        else{
            return false;
        }
    }
    void checkPrime(int... parameters){
        int k=0;
        for(int parameter : parameters){
            if(check(parameter)){
                System.out.print(parameter+" ");
                k++;
            }
        }
        if(k!=0){
            System.out.print(" ");
        }
        System.out.println();
        
    }
    
}

public class Solution {

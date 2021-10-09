//Two strings, a and b , are called anagrams if they contain all the same characters in the same frequencies.
import java.util.Scanner;

public class Solution {
    //check frequency of letter
    static int freq(int z, char[] arr,int l ){
        int f=0;
        for(int i=0;i<l;i++){
            if(arr[i]==z){
                f++;
            }
        }
        return f;
    }
    static boolean isAnagram(String a, String b) {
        // flag
        int k=0;
        int la = a.length();
        int lb = b.length();
        char [] A = a.toLowerCase().toCharArray();
        char [] B = b.toLowerCase().toCharArray();
        if(la==lb){
            for(int i=0;i<la;i++){
                //take letter one by one and check freq
                char letter = A[i];
                if(freq(letter,A,la)==freq(letter,B,la)){
                    k=1;
                }else{
                    k=0;
                    break;
                }
                
            }
        }else{
            k=0;
        }
        if(k==0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

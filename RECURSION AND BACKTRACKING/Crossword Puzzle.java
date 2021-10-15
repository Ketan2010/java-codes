import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words) {
            int index=0;
            String[] wordsArray=words.split(";");
            solvepuzzle(crossword,wordsArray,index);
            return crossword;

    }
    static boolean solvepuzzle(String[] crossword,String[] wordsArray,int index)
    {
        if(index<wordsArray.length)
        {
            char[] charArray=wordsArray[index].toCharArray();
            int maxlen=10-charArray.length;
            for(int i=0;i<=maxlen;i++)
            {
                for(int j=0;j<10;j++)
                {
                    if(crossword[i].charAt(j)=='+') continue;
                    else{
                    if(isVertical(crossword,charArray,i,j,index))
                    {
                        for(int k=0;k<charArray.length;k++)
                        {
                        System.out.println(charArray[k]+":"+i+":"+j+":"+k);
                             StringBuilder string = new StringBuilder( crossword[i+k]); 
        string.setCharAt(j, charArray[k]); 
        crossword[i+k]=string.toString();
                          //  crossword[i+k].charAt(j)=charArray[k];
                        }
                        
                         System.out.println(crossword[i]+":"+i+":"+j);
                       if(solvepuzzle(crossword,wordsArray,index+1))
                        {return true;}
                        else {
                            for(int k=0;k<charArray.length;k++)
                            {
                              StringBuilder string = new StringBuilder( crossword[i+k]); 
        string.setCharAt(j, '-'); 
        crossword[i+k]=string.toString();  
                            }
                        }
                    }
                    }
                }
            }

            for(int i=0;i<10;i++)
            {
                for(int j=0;j<=maxlen;j++)
                {
                    if(isHorizontal(crossword,charArray,i,j,index))
                    {
                        for(int k=0;k<charArray.length;k++)
                        {
                            System.out.println(charArray[k]+":"+i+":"+j+"in");
                            System.out.println(k+":"+charArray[k]);
                             StringBuilder string = new StringBuilder( crossword[i]); 
        string.setCharAt(j+k, charArray[k]); 
         crossword[i]=string.toString();
                           // crossword[i].charAt(j+k)=charArray[k];
                        }
                       
                        System.out.println(crossword[i]+":"+i+":"+j);
                        if(solvepuzzle(crossword,wordsArray,index+1))
                        {return true;}
                        else {
                            for(int k=0;k<charArray.length;k++)
                            {
                                StringBuilder string = new StringBuilder( crossword[i]); 
        string.setCharAt(j+k, '-'); 
         crossword[i]=string.toString();
                            }
                        }
                    }
                }
            }
            return false;
        }
        else return true;
    }
    static boolean isVertical(String [] crossword,char[]charArray,int i,int j,int index)
    {
        String[] temp=crossword.clone();
        for(int k=0;k<charArray.length;k++)
        {
            if(temp[i+k].charAt(j)=='-' || temp[i+k].charAt(j)==charArray[k])
            {
                StringBuilder string = new StringBuilder(temp[i+k]); 
        string.setCharAt(j, charArray[k]); 
         temp[i+k]=string.toString();
               // crossword[i+k].charAt(j)=charArray[k];
            }
           
            else return false;
        }
        return true;
    }

    static boolean isHorizontal(String [] crossword,char[]charArray,int i,int j,int index)
    {
        String[] temp=crossword.clone();
        for(int k=0;k<charArray.length;k++)
        {
            if(temp[i].charAt(j+k)=='-' || temp[i].charAt(j+k)==charArray[k])
            {
                 StringBuilder string = new StringBuilder( temp[i]); 
        string.setCharAt(j+k, charArray[k]); 
        temp[i]=string.toString();
               // crossword[i].charAt(j+k)=charArray[k];
            }
            else return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] crossword = new String[10];

        for (int i = 0; i < 10; i++) {
            String crosswordItem = scanner.nextLine();
            crossword[i] = crosswordItem;
        }

        String words = scanner.nextLine();

        String[] result = crosswordPuzzle(crossword, words);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

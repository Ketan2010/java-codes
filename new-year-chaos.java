import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    
   

    public static void minimumBribes(List<Integer> q) 
    {


int n=q.size();
int total=0;
for(int i=n-1;i>=0;i--)
{
    if(q.get(i)-(i+1)>2)
    {
        System.out.println("Too chaotic");
        return;
    }
    
    for(int j=Math.max(0,q.get(i)-2);j<i;j++)
    {
        if(q.get(j)>q.get(i)) total++;
    }

}
System.out.println(total);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Result.minimumBribes(q);
        }

        bufferedReader.close();
    }
}


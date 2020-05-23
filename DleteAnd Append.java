import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
                                                            
    { 
        // Case A (i) 
        if ((s.length() + t.length()) < k) 
            return "Yes"; 
      
        // finding common length of both string 
        int commonLength = 0; 
        for (int i = 0; i < Math.min(s.length(),  
                                t.length()); i++) 
        { 
            if (s.charAt(i) == t.charAt(i)) 
                commonLength++; 
            else
                break; 
        } 
      
        // Case A (ii)- 
        if (Math.abs(k - s.length() - t.length() +  
                     2 * commonLength) % 2 == 0 && (k-s.length()-t.length()+2*commonLength)/2>=0) 
            return "Yes"; 
      
        // Case B 
        return "No"; 
    } 
      
      
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

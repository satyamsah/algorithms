// Java program to find smallest window containing
// all characters of a pattern.
 
package abc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GFG 
{
    static final int no_of_chars = 256;
     
    // Function to find smallest window containing
    // all characters of 'pat'
    static String findSubString(int[] arr)
    {
    	
    	Map<Integer, Integer> pat = new HashMap<>();
    	for( int i : arr){
    		pat.put(i, 1);
    	}
        int len1 = arr.length;
        int len2 = pat.size();
      
        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (len1 < len2)
        {
            System.out.println("No such window exists");
            return "";
        }
      
        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];
      
     
      
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
      
        // start traversing the string
        int count = 0;  // count of characters
        for (int j = 0; j < len1 ; j++)
        {
            // count occurrence of characters of string
            hash_str[str.charAt(j)]++;
      
            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[str.charAt(j)] != 0 &&
                hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] )
                count++;
      
            // if all the characters are matched
            if (count == len2)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence  in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
                       || hash_pat[str.charAt(start)] == 0)
                {
      
                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }
      
                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
      
        // If no window found
        if (start_index == -1)
        {
           System.out.println("No such window exists");
           return "";
        }
      
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }
     
    // Driver Method
    public static void main(String[] args)
    {
        int[] arr = {7, 5, 2, 7, 2, 7, 4, 7};
       
      
       System.out.print("Smallest window is :  n" +
                        findSubString(arr));
    }
}
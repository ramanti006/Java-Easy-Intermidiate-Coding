//Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.
//
//Example
//
//This is a valid string because frequencies are .
//
//
//This is a valid string because we can remove one  and have  of each character in the remaining string.
//
//
//This string is not valid as we can only remove  occurrence of . That leaves character frequencies of .

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidString {
	public static void main(String[] args) {
		
		String str = "abcdefghhgfedecba";
		
		char[] arr = str.toCharArray();
		
		List<Integer> li = new ArrayList<Integer>();
		
		Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(freqMap);
        for(int i : freqMap.values())
        {
        	li.add(i);
        }
        
        int i = Collections.min(li);
        int c = 0;
        int p = 0 ;
        
       for(int j : li)
       {
    	   if( j > i)
    	   {
    		   c += 1;
    		   p = j;
    		   if( c  > 1)
    		   {
    			   System.out.println("NO");
    		   }
    		   else
    		   {
    			   p = p-1;
    		   }
    	   }
       }
        
       System.out.println("value of p"+p);
       if(p != i)
       {
    	   System.out.println("NO");
       }
       else
       {
    	   System.out.println("YES");
       }
        System.out.println(li);
	
	}

}

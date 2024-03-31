//negative and positive will be one side
import java.util.*;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NegativePositiveOneSide {

	public static void main(String[] args) {
		
    int[] arr = {-1,5,-5,-8,2,-9,0,-7};
    
    int j  = 0;
    int f  = 0;
    
    int n = arr.length;
    
   //for(int j = 0 ; j < n ; j++)
    while( j < n)
    {
    	if(arr[j] < 0)
    	{
    		int temp = arr[f];
    		arr[f] = arr[j];
    		arr[j] = temp;
    		f++;
    		
    	}
    	j++;
    }
    	
    	
    	
    
    
    for(int i : arr)
    {
    	System.out.println(i);
    }
	
    
     
		
		
	}
}

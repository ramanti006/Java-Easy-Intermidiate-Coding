import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ZeroandOneAtSide {

	public static void main(String[] args) {
		
      int[] arr = {1,0,1,0,1,0,0,0,1};
      int i = 0;
      int j = arr.length-1;
      
      while(i <j)
      {
    	  if(arr[i] == 1 && arr[j] == 1)
    	  {
    		  j--;
    	  }
    	  else if(arr[i] == 1 && arr[j] == 0)
    	  {
    		  int temp = arr[i];
    		  arr[i] = arr[j];
    		  arr[j] = temp;
    		  i++;
    		  j--;
    	  }
    	  else if(arr[i] == 0 && arr[j] == 0)
    	  {
    		  i++;
    	  }
       	  else
    	  {
    		  j--;
    		  
    	  }
    	  
      }
      
      for(int a : arr)
      {
    	  System.out.println(a);
    	  
      }
		
		
	}
}

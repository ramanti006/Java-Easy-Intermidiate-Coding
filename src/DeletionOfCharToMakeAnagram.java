import java.util.HashMap;
import java.util.Map;

public class DeletionOfCharToMakeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc";
		String b = "dca";
		
		Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : a.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(freqMap);
        
        for (char c : b.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
        }
         int deletion = 0;
         for(int f : freqMap.values() )
         {
             deletion += Math.abs(f);
             
         }
         System.out.println(freqMap);

    System.out.println(deletion);

	}

}

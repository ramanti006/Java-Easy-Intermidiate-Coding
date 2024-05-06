//given a array of String ..make a ;larger number from it

import java.util.Arrays;
import java.util.Comparator;
public class LargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {30,9,12,1,3};
		
		String[] arr = {"30", "9", "12", "1", "3"};

        // Custom sorting based on the comparison of concatenated strings
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // Reverse order to get descending order
            }
        });

        // Construct the largest number by concatenating sorted strings


StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }

        System.out.println("The largest number is -> " + res.toString());

	}

}

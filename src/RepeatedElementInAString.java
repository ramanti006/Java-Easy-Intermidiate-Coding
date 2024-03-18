/*There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, find and print the number of letter a's in the first  letters of the infinite string.

Example
The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.*/

public class RepeatedElementInAString {
	public int repeatedelement(String s , int n)
	{
		int a = s.length()-1;
		int j = 0;
		int c  = 0;
		
		for(int i = 0 ; i < n; i++)
		{
			if(s.charAt(j) == 'a')
			{
			c = c+1;	
			}
			if( j == a)
			{
				j = 0;
			}
			else
			{
				j ++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedElementInAString ob = new RepeatedElementInAString();
		System.out.println("Total a number->"+ob.repeatedelement("abcac", 10));
		System.out.println("Total a number->"+ob.repeatedelement("abaabaabaa", 10));
		System.out.println("Total a number->"+ob.repeatedelement("abc", 9));

	}

}

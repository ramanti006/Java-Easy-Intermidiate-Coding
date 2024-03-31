
public class LeftRotation {
	public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,5};
	
	int rot = 4;
	int n = arr.length - 1;
	int f = 0,l = 0;
	
	for(int i = 0 ; i < 4; i++)
	{
		f = arr[0];
		for(int j = 0 ; j  < n ;j ++)
		{
			arr[j] = arr[j+1];
			
		}
		arr[n] = f;
	}
	 
	for(int ele : arr)
	{
		System.out.println(ele);
	}

}
}

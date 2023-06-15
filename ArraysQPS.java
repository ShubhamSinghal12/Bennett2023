import java.util.Arrays;

public class ArraysQPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		display(arr);
//		System.out.println(Arrays.toString(arr));
		reverseByParts(arr,3,8);
//		System.out.println(Arrays.toString(arr));
		display(arr);
		

	}
	
	public static int maxA(int[] arr)
	{
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if( max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void display(int[] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			
//		}
		for(int val : arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		
	}
	public static void reverse(int[] arr)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si < ei)
		{
			swap2(si,ei,arr);
			si++;
			ei--;
		}
		
	}
	
	public static void reverseByParts(int[] arr,int si,int ei)
	{
		while(si < ei)
		{
			swap2(si,ei,arr);
			si++;
			ei--;
		}
	}
	public static void swap2(int a,int b,int[] arr)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	
	
	
	

}

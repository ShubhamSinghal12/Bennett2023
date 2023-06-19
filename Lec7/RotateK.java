package Lec7;
import java.util.Arrays;

public class RotateK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		rotateK2(arr,400);
		System.out.println(Arrays.toString(arr));

	}
	public static void rotate1(int[] arr)
	{
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public static void rotateK(int[] arr,int k)
	{
		k = k%arr.length;
		if( k < 0)
		{
			k += arr.length;
		}
		
		for(int i = 0; i < k; i++)
		{
			rotate1(arr);
		}
	}
	
	public static void rotateK2(int[] arr,int k)
	{
		k = k%arr.length;
		if( k < 0)
		{
			k += arr.length;
		}
		
		reverseByParts(arr, 0, arr.length-1);
		reverseByParts(arr, 0, k-1);
		reverseByParts(arr, k, arr.length-1);
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

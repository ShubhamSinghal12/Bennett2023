package Lec7;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[5];
//		System.out.println(arr);
//		System.out.println(arr[2]);
//		arr[2]= 1000;
//		System.out.println(arr[2]);
//		
//		System.out.println(arr.length);
//		System.out.println(arr[1]);
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i < arr.length; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
		
		int[] arr;
		arr = new int[]{10,20,30,40,50};
		
//		int[] brr= new int[5];
//		System.out.println(brr==arr);
		
		display(arr);

	}
	
	public static void display(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}

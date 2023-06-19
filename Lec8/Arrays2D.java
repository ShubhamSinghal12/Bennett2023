package Lec8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		int[][] arr = takeInput(m, n);
		
//		int[][] arr = new int[4][];
//		arr[0] = new int[]{1,2,3};
//		arr[1] = new int[]{3,4};
//		arr[2] = new int[]{5,6,7,8};
//		arr[3] = new int[]{9};
		
//		int[][] arr = {{1,2,3},{3,4},{5,6,7,8},{9}};
		
		int[][] arr;
		arr = new int[][] {{1,2,3},{3,4},{5,6,7,8},{9}};
		
		System.out.println("--------------------");
		display(arr);
		
	}
	public static int[][] takeInput(int m,int n)
	{
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int[] i:arr)
		{
//			for(int j: i)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
			System.out.println(Arrays.toString(i));
		}
	}

}

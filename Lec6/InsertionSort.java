package Lec6;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,0};
		insert(arr, 4);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insert(int[] arr,int i)
	{
		int temp = arr[i];
		int j = i-1;
		while(j >= 0 && temp < arr[j])
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = temp;
	}
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			insert(arr, i);
		}
	}

}

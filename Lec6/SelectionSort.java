package Lec6;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,5,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int minI = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[minI] > arr[j])
				{
					minI = j;
				}
			}
			
			int t = arr[i];
			arr[i] = arr[minI];
			arr[minI] = t;
		}
	}

}

package Lec6;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,4};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = 1; j < arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					swap++;
					int t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
			if(swap == 0)
			{
				//break;
				return;
			}
		}
	}
	

}

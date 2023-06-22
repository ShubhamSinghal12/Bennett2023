package Lec9;

import java.util.Arrays;

public class TransPoseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19},
        };
		transpose(matrix);
		for(int[] v: matrix)
		{
			System.out.println(Arrays.toString(v));
		}

	}
	
	public static void transpose(int[][] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}

}

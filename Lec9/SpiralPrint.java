package Lec9;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19},
                {21, 22, 23, 24}
        };
		
		spiralPrint(matrix);


	}
	
	public static void spiralPrint(int[][] arr)
	{
		int minr = 0,minc = 0,maxr = arr.length-1,maxc = arr[0].length-1;
		int te = arr.length*arr[0].length;
		int count = 0;
		while(count < te)
		{
			for(int j = minc ; j <= maxc && count < te; j++)
			{
				System.out.print(arr[minr][j]+" ");
				count++;
			}
			minr++;
			
			for(int i = minr; i <= maxr && count < te; i++)
			{
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			
			for(int j = maxc; j >= minc && count < te; j--)
			{
				System.out.print(arr[maxr][j]+" ");
				count++;
			}
			maxr--;
			
			for(int i = maxr; i >= minr && count < te; i--)
			{
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;	
		}
	}

}

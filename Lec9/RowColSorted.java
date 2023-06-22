package Lec9;

public class RowColSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,3,7,10},{4,5,11,12},{8,9,14,18},{12,13,15,20}};
		search(matrix, 16);

	}
	
	public static void search(int[][] arr,int ele)
	{
		int row = 0;
		int col = arr[0].length-1;
		while(col >= 0 && row < arr.length)
		{
			if(arr[row][col] == ele)
			{
				System.out.println(row+" "+col);
				return;
			}
			else if(arr[row][col] > ele)
			{
				col--;
			}
			else
			{
				row++;
			}
		}
		System.out.println("-1");
	}
	

}

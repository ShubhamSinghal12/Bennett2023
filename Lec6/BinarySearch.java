package Lec6;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,};
		System.out.println(lowerBound(arr, 3));

	}
	
	public static int binary_search(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] == ele)
			{
				return mid;
			}
			else if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else
			{
				si = mid+1;
			}
		}
		return -1;
		
		
	}
	
	
	public static int lowerBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] == ele)
			{
				ans = mid;
				ei = mid-1;
			}
			else if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else
			{
				si = mid+1;
			}
		}
		return ans;
		
		
	}

}

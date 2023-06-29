package Lec13;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,4};
		System.out.println(search(arr, 4, 0));

	}
	
	public static int search(int[] arr,int ele,int i)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[i] == ele)
			{
				return i;
			}
			else
			{
				return search(arr, ele, i+1);
			}
		}
	}
	
	public static int lastO(int[] arr,int ele,int i,int ans)
	{
		if(i == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[i] == ele)
			{
				return lastO(arr, ele, i+1, i);
			}
			else
			{
				return lastO(arr, ele, i+1, ans);
			}
		}
	}
	
	public static int lastO(int[] arr,int ele,int i)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			int ans = lastO(arr, ele, i+1);
			if(ans == -1 && arr[i] == ele)
			{
				ans = i;
			}
			return ans;
			
		}
	}

}

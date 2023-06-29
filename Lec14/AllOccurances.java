package Lec14;

import java.util.ArrayList;

public class AllOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,2,4,2};
		ArrayList<Integer> al = new ArrayList<>();
		allOcc(arr, 2, 0,al);
		System.out.println(al);

	}
	public static void allOcc(int[] arr,int ele,int i,ArrayList<Integer> ans)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
				ans.add(i);
			}
			
			allOcc(arr, ele, i+1,ans);
		}
	}
	
	
	public static int[] allOcc(int[] arr,int ele,int i,int cnt)
	{
		if(i == arr.length)
		{
			return new int[cnt];
		}
		else
		{
			if(arr[i] == ele)
			{
				cnt = cnt+1;
			}
			
			int[] ans = allOcc(arr, ele, i+1,cnt);
			
			if(arr[i] == ele)
			{
				ans[cnt-1] = i;
			}
			return ans;	
		}
	}
}

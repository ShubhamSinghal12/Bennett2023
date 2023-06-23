package Lec11;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stalls = {1,2,4,8,9};
		int noc = 3;
		for(int i = 1; i <= stalls[stalls.length-1]; i++)
		{
			if(!isItPossible(stalls, noc, i))
			{
				System.out.println(i-1);
				break;
			}
//			System.out.println(i+" "+isItPossible(stalls, noc, i));
		}
		
		

	}
	
	public static boolean isItPossible(int[] stalls,int noc,int min)
	{
		int count = 1;
		int place = stalls[0];
		for(int i = 1;i < stalls.length; i++)
		{
			if(stalls[i]-place >= min)
			{
				count++;
				place = stalls[i];
			}
			
		}
		if(count >= noc)
		{
			return true;
		}
		else
			return false;
	}
	
	public static int searchAGC(int[] stalls,int noc)
	{
		Arrays.sort(stalls);
		int si = 1;
		int ei = stalls[stalls.length-1];
		int ans = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(stalls, noc, mid))
			{
				ans = mid;
				si = mid+1;
			}
			else
			{
				ei = mid-1;
			}
		}
		return ans;
	}

}

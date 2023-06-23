package Lec11;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Sqrt(100));

	}
	
	public static boolean isItPossible(int i,int n)
	{
		return i*i <= n;
	}
	public static int Sqrt(int n)
	{
		int si = 1;
		int ei = n;
		int ans = 1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(mid, n))
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

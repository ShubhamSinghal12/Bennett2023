package Lec13;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int power(int a,int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return power(a, n-1)*a;
		}
	}
	
	public static int powerTail(int a,int n,int ans)
	{
		if(n == 0)
		{
			return ans;
		}
		else
		{
			return powerTail(a, n-1,ans*a);
		}
	}

}

package Lec13;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factTail(5, 1));
	}
	
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return fact(n-1)*n;
		}
	}
	
	public static int factTail(int n,int ans)
	{
		if(n == 0)
		{
			return ans;
		}
		else
		{
			return factTail(n-1,ans*n);
		}
	}
	
}

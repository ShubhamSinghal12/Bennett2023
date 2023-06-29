package Lec13;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fib(9));
		System.out.println(fib(9,0,1));

	}
	
	
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static int fib(int n,int a,int b)
	{
		if(n == 0)
		{
			return a;
		}
		else
		{
			return fib(n-1,b,a+b);
		}
	}
	
	
	
	
}

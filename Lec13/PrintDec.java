package Lec13;

public class PrintDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pd2(50,100);
		
	}
	public static void pd(int n)
	{
		if(n == 0)
		{
//			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			pd(n-1);
		}
	}
	
	public static void pd1(int i , int n)
	{
		if(n == i)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(n);
			pd1(i,n-1);
		}
	}
	
	
	public static void pd2(int i , int n)
	{
		if(n == i)
		{
			System.out.println(i);
		}
		else
		{
			pd2(i+1,n);
			System.out.println(i);
		}
	}

}

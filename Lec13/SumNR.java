package Lec13;

public class SumNR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4));

	}
	
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return sum(n-1)+n;
		}
	}

}

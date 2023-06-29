package Lec13;

public class PrintDecInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(5);

	}
	
	public static void pdi(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			pdi(n-1);
			System.out.println(n);
		}
	}
	
}
package Lec2;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 24;
		int i = 2;
		boolean flag = true;
//		int srt = (int)Math.sqrt(n);
//		while(i <= srt)
//		{
//			if(n%i == 0)
//			{
//				flag = false;
//			}
//			
//			i++;
//		}
		
		while(i*i <= n)
		{
			if(n%i == 0)
			{
				flag = false;
			}
			
			i++;
		}
		
		if(flag)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}

	}

}

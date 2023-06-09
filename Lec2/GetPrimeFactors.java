package Lec2;

public class GetPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 24;
		
		int i = 2;
//		while(n!=1)
//		{
//			if(n%i == 0)
//			{
//				System.out.println(i);
//				n = n/i;
//			}
//			else
//			{
//				i++;
//			}
//		}
		
		while(n!=1)
		{
			while(n%i == 0)
			{
				System.out.println(i);
				n = n/i;
			}
			i++;
		}
		
		
	}

}

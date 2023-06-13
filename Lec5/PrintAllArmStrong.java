package Lec5;

public class PrintAllArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isArmstrong(153));
		printAllArm(1, 100000);

	}
	
	public static int noOfDigits(int num)
	{
		return (int)Math.log10(num)+1;
	}
	
	public static boolean isArmstrong(int num)
	{
		int nod = noOfDigits(num);
		int sum = 0;
		int t = num;
		while(num != 0)
		{
			int rem = num%10;
			sum += Math.pow(rem, nod);
			
			num /= 10;
		}
		return sum == t;
	}
	
	public static void printAllArm(int start,int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
	

}

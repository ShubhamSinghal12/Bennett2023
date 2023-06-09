package Lec2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		int a = 0;
		int b = 1;
		
		int i = 1;
		while(i < n)
		{
//			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
			
			i++;
		}
		System.out.println(b);
	}

}

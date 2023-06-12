package Lec4;

public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 12345;
//		System.out.println(Math.log10(n));
//		int cnt = (int)Math.log10(n) + 1;
		int cnt = 0;
		while(n!=0)
		{
			System.out.print(n%10);
			cnt++;
			n = n/10;
		}
		System.out.println();
		System.out.println(cnt);

	}

}

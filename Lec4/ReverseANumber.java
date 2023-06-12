package Lec4;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int ans = 0;
		while(n!=0)
		{
			int rem = n%10;
			ans = ans*10+rem;
			
			n = n/10;
		}
		System.out.println(ans);

	}

}

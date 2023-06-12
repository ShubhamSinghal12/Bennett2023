package Lec4;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 49;
		int multi = 1;
		int ans = 0;
		int base = 8;
		while(n != 0)
		{
			int rem = n%base;
			ans += rem*multi;
			
			multi *= 10;
			n /= base;
		}
		System.out.println(ans);
		

	}

}

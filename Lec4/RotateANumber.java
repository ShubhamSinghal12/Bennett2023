package Lec4;

public class RotateANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		int k = -1;
		int nod = (int)Math.log10(n)+1;
		k = k%nod;
		if(k < 0)
			k += nod;
		
//		System.out.println(k);
//		for(int i = 1; i <= k; i++)
//		{
//			int rem = n%10;
//			n = rem*(int)Math.pow(10, nod-1) + n/10;
//		}
//		System.out.println(n);
		
		int rem = n%(int)Math.pow(10, k);
		int ans = rem*(int)Math.pow(10, nod-k)+n/(int)Math.pow(10, k);
		
		System.out.println(ans);

	}

}

package Lec5;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte b = 1;
		short s = 10;
		int i = 100;
		long l = 1000_000_0000l;
		
//		b = s;
//		b = i;
//		b = l;
		
		s = b;
		s = (short)i;
//		s = l;

		
		double d = 3.14;
		float f = 3.14f;
		
		char ch = 97;
		
		ch = (char)(ch+ch);
		
		System.out.println(ch);
		
		
		String st = "Hello";
		st = st + 3.14;
		System.out.println(st);
		
		System.out.println(10+6f/10*2);
		
		
	}

}

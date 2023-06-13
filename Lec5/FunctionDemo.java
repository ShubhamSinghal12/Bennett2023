package Lec5;

public class FunctionDemo {
	static int globe = 2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		System.out.println(globe);
		int a = 10;
		int b = 20;
		int c = add(a,b);
//		System.out.println(c);
		sub(a, b);
		System.out.println(globe);
		System.out.println("Bye");
	}
	public static int add(int a,int b)
	{
		int globe = 100;
		a = 100;
		b = 100;
		sub(a, b);
		int c = a+b;
		return c;
	
	}
	public static void sub(int a,int b)
	{
		
		a = 40;
		int c = a-b;
		globe += c;
		System.out.println("Globe: " + globe); 
//		System.out.println(c);
	}
}

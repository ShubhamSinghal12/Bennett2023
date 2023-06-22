package Lec10;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String st = "Hello";
//		String st1 = "Hello";
//		String st2 = new String("Hello");
//		String st3 = new String("hello");
//		
//		System.out.println(st == st1);
//		System.out.println(st3.compareTo(st2));
		
//		System.out.println(st2 == st3);
//		
//		st1 += st;
//		System.out.println(st1);
//		System.out.println(st);
		
		
//		Scanner sc = new Scanner(System.in);
//		char st = sc.next().charAt(0);
//		System.out.println(st);
		
		
//		String st = "Helloll";
//		System.out.println(st.charAt(1));
//		st = st+123;
//		System.out.println(st);
//		System.out.println(st.length());
//		
//		String st2 = st.substring(2,6);
//		
//		System.out.println(st2);
//		System.out.println(st.substring(2));
//		
//		
//		System.out.println(st.indexOf("lll"));
//		System.out.println(st.lastIndexOf("ll"));
//		
//		System.out.println(st.startsWith("Hel"));
//		System.out.println(st.endsWith("123"));
//		
//		String st3 = st.concat(st2);
//		System.out.println(st3);
		
		String st = "Hello";
//		System.out.println(st.replace("ll", "r"));
		
		long start = System.currentTimeMillis();
		for(int i = 0;i < 1000000; i++)
		{
			st = st+"a";
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}

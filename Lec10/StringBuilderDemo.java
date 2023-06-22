package Lec10;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hello123");
		System.out.println(sb);
		
//		System.out.println(sb.length());
//		System.out.println(sb.charAt(0));
//		String st = sb.substring(2,6);
//		System.out.println(st);
		sb.append(12);
		System.out.println(sb);
//		sb.insert(2, false);
		sb.setCharAt(2, 'X');
		sb.replace(2, 6,"ABC");
		System.out.println(sb);
		
		sb.delete(0,5);
		System.out.println(sb);
		sb.deleteCharAt(0);
		String st = sb.toString();
		System.out.println(st);
		
		long start = System.currentTimeMillis();
		for(int i = 0;i < 1000000; i++)
		{
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
	}

}

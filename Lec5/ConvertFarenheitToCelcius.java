package Lec5;

import java.util.Scanner;

public class ConvertFarenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int stop = sc.nextInt();
		int step = sc.nextInt();
		
		for(int f = start; f<= stop; f += step)
		{
//			int c =(int)(5f/9*(f-32));
			int c = 5*(f-32)/9;
			System.out.println(f+" -> "+c);
		}
		
		
	}

}

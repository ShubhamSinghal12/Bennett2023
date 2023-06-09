package Lec2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		int p = sc.nextInt();
		System.out.println("Enter Rate: ");
		int r = sc.nextInt();
		System.out.println("Enter time: ");
		int t = sc.nextInt();
		
		int si = p*r*t/100;
		
		System.out.println("Simple Interest: " + si);
		

	}

}

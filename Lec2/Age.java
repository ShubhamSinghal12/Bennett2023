package Lec2;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Not an Adult");
		}
		System.out.println("Bye Bye");
	}

}

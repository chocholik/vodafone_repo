package com;
import java.util.Scanner;

public class TakingValueTroughKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("Sum of two number is "+ (a+b) );
		sc.close();
	}
}

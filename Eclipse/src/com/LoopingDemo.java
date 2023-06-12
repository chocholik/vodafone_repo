package com;

public class LoopingDemo {

	public static void main(String[] args) {
		System.out.println("While loop");
		int  i=1, n=3;
		while (i<=n) {
			System.out.println("hello " + i);
			i++;
		}
		System.out.printf("While loop");
		i=1;
		n=5;
		do {
			System.out.println("hello " + i);
			i++;
		} while (i<=n);
	}

}

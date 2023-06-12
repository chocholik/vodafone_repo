package com;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 100;
		if(age<=21) {
			System.out.println("You can't drink");
		} else if(21<age & age<100) {System.out.println("Drinking is OK");}
		else {System.out.println("Too old to drink!");}
		System.out.println("Finish!");
	}

}
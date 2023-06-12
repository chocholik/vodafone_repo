package com;
import java.util.Scanner;
public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int choice = 10;
//		switch(choice) {
//		case 1:System.out.println("1st block");
//			break;
//		case 2:System.out.println("2st block");
//			break;
//		case 3:System.out.println("3st block");
//			break;
//		case 4:System.out.println("4st block");
//			break;
//		default:System.out.println("Wrong block");
//			break;
//		}
		
//		int choice = 2;		// we can take the value through keyboard. 

		Scanner sc = new Scanner(System.in);
		String choice;
		System.out.println("Enter value of a");
		float a=sc.nextInt();
		System.out.println("Enter value of b");
		float b=sc.nextInt();
		System.out.println("+:Add -: Sub *:Mul, /:Div");
		choice = sc.next();
		float add, sub,mul,div;
		switch(choice) {
		case "+" :add = a+b;
			    System.out.println("Addition of two number is "+add);
			    break;
		case "-" :sub = a-b;
			    System.out.println("Sub of two number is "+sub);
			    break;
		case "*" :mul = a*b;
			    System.out.println("Mul of two number is "+mul);
			    break;
		case "/" :div = a/b;
			    System.out.println("div of two number is "+div);
			    break;
		default:System.out.println("Wrong choice");
			    break;
		}
		sc.close();
		System.out.println("Finish");
	}

}

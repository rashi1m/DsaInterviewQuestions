package com.coreconcept.practiceJava;

import java.util.Scanner;

public class PracticeCalculator {

	static int add(int num1,int num2) {
		
		int sum1= num1+num2;
		return sum1;
	}
	
	
	static int multiply(int num1,int num2) {
		
		int mul = num1*num2;
		return mul;
		 
	}
	
	static int subtract(int num1,int num2) {
		
		int sub = num1-num2;
		return sub;

	}
	
	static int division(int num1,int num2) {
		
		if(num2 == 0) {
		System.out.println("Cannot Divide! Please take  another number which is greater then zero ");
		return num2;
		}else {
			int divide = num1/num2;
			return divide;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operator");
		char ch = sc.next().trim().charAt(0);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		if(ch == '+')
		{
			System.out.println(add(num1,num2));
		}
		else if(ch == '*') {
		System.out.println(multiply(num1,num2));
		}
		else if(ch == '-') {
		System.out.println(subtract(num1,num2));
		}
		else if(ch == '/') {
		System.out.println(division(num1,num2));
		}else {
			System.out.println("Invalid Operator");
		}
		
	}
}


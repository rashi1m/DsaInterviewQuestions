package com.coreconcept.java;

import java.util.Scanner;


public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the operator");
char ch = sc.next().trim().charAt(0);

if (ch == '+'|| ch =='-'||ch=='*'||ch == '/' || ch =='%')
{
	System.out.println("Enter first number");
	int num1 = sc.nextInt();
	System.out.println("Enter second number");
	int num2 = sc.nextInt();
	
	if(ch == '+') {
		System.out.println("The Sum is "+num1 + num2);
		
	}
	if(ch == '-') {
		System.out.println("The difference is "+(num1 - num2));
		
	}
	if(ch == '*') {
		System.out.println("The multiplication is "+num1 * num2);
		
	}
	if(ch == '/') {
		if(num2 != 0) {
			System.out.println("The Division value is "+num1 / num2);
		}
		
	}
	if(ch == '%') {
		System.out.println("The modulus value is"+num1 % num2);
		
	}
	
}
    sc.close();
}
}

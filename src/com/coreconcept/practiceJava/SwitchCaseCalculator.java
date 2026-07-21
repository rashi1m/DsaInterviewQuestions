package com.coreconcept.practiceJava;
import java.util.Scanner;
public class SwitchCaseCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the operator ");
			char operator = sc.next().trim().charAt(0);
			if (operator == 'x' || operator == 'X') {
				System.out.println("Calculator Closed");
				break;
			}
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				System.out.println("Enter the first Number");
				int num1 = sc.nextInt();
				System.out.println("Enter the second Number");
				int num2 = sc.nextInt();
				switch (operator) {
				case '+':
					System.out.println("The Sum is " + (num1 + num2));
					break;
				case '-':
					System.out.println("The difference is" + (num1 - num2));
					break;
				case '*':
					System.out.println("The muliplication is " +( num1 * num2));
					break;
				case '/':
					if (num2 != 0) {
						System.out.println("The division is " + (num1 / num2));
					} else {
						System.out.println("Cannot Divide by Zero!");
					}
					break;
				}
			} else {
				System.out.println("Invalid Operator! Please enter +, -, *, / or X");
			}

		}
		sc.close();
	}}
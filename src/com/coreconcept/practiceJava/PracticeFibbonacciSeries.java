package com.coreconcept.practiceJava;

import java.util.Scanner;

public class PracticeFibbonacciSeries {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the number ");
	 int n = in.nextInt(); // kitne numbers chahiye total 
	 int firstNumber=0,secondNumber=1,nextnum;
	 for(int j=1; j<= n;j++) {
		 System.out.print(firstNumber+ ", ");
		 int nextNum = firstNumber+secondNumber;
		 firstNumber = secondNumber;
		 secondNumber = nextNum;
		 
	 }
		
	}
}

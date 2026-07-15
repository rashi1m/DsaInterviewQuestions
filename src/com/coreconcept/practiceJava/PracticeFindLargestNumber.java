package com.coreconcept.practiceJava;

import java.util.Scanner;

public class PracticeFindLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 ");
		int number1 = sc.nextInt();
		System.out.println("Enter the number 2 ");
		int number2 = sc.nextInt();
		System.out.println("Enter the number 3 ");
		int number3 = sc.nextInt();
		System.out.println("Enter the number 4 ");
		int number4 = sc.nextInt();
		
		//Find largest Number
		int max = number1;
		if(number2 > max) {
			max = number2;
		}if(number3 > max) {
           max = number3;   
		}if(number4 > max) {
			max = number4;
		}
		
		System.out.println("The largest number is "+max);
		
		//find smaller number
		int min = number1;
		if(number2 <min) {
			min = number2;
		}if(number3 <min) {
			min = number3;
		}if(number4 < min) {
			min = number4;
		}
		System.out.println("The Smallest number is "+min);
		
		//int y = Math.min(number4,Math.min(number3,Math.min(number1, number2)));
//		int x = Math.max(number4,Math.max(number3, Math.max(number1, number2)));
//		System.out.println(x);
//		
	//	System.out.println(y);
		
		
		sc.close(); // isse memory leak nhi hoti 
		
	}
	
}

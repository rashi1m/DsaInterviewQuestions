package com.coreconcept.java;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	int answer =0;
	 while(number > 0) {
		int remainder  = number % 10;
		number /= 10;
		answer = answer * 10 + remainder;
		 
	 }
	System.out.println(answer);
	
}
}

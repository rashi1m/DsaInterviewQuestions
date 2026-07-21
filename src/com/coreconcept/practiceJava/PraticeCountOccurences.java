package com.coreconcept.practiceJava;

import java.util.Scanner;

public class PraticeCountOccurences {
public static void main(String[] ars) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	System.out.println("Enter the digit");
	int digit = sc.nextInt();
	int count=0 ;
	
	while(num > 0 )
	{
		int rem = num % 10;
		
		if(rem == digit) {
			count++;
			
		}
		
		num =num/10;
		
	}

	System.out.println("The digit is "+digit+ " and the count is "+count);
	
	sc.close();
	
	
}	
}

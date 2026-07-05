package com.coreconcept.java;

public class PrimeNumber {

public static void main(String[] args) {
	
//	int salary = 2500;
//	
//	if(salary>10000) {
//		salary = salary +1000;
//		System.out.println("It is greater than 10,000 "+salary);
//		
//	}else {
//		salary=salary+2000;
//		System.out.println("It is not greater than 10,000 "+salary);
//	}
	
	//check prime number 
	
	int n=5;
	if(n<=1 ) {
		
		System.out.println("netiher prime nor composite");
	}
	
	int num=2;
	while(num*num<=n) {
		if(n%num ==0) {
			System.out.println("Its not a prime number");
		}else {
			System.out.println("Its a prime number");
		}
		
		num=num+1;
		
	}
	
	
	
}
	
	
	
	
}

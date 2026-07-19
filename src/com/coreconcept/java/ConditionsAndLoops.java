package com.coreconcept.java;

import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormatImpl;


public class ConditionsAndLoops {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the temprature in celcius : ");
		System.out.println("Enter the number ");
		int name = sc.nextInt();
//		 float name1 =(name * 9/5)+32;
//		System.out.println("Celcius converts into F : "+name1);
//		
//		int a = 4;
//		while(a!= 45) {
//		System.out.println(a);
//	     a++;
//	   }  
	
		int firstNum =0, secondNum =1,nextNumber;
		int count =1;
		while(count <= name) {
			System.out.println(firstNum+", ");
			nextNumber = firstNum + secondNum;
			firstNum =secondNum;
			secondNum = nextNumber;
			count++;
			
		}
		
		
		}
	
	}



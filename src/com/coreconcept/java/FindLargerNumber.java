package com.coreconcept.java;

import java.util.Scanner;
public class FindLargerNumber{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number ");
int num1 = sc.nextInt();
System.out.print("Enter the second number ");
int num2 = sc.nextInt();
System.out.println("Enter the third number ");
int num3 = sc.nextInt();
System.out.println("Enter the fourth number ");
int num4 = sc.nextInt();

int large = num1;
if(num2 > large){
 large = num2;
}
if (num3 > large) {
 large = num3;
}
if (num4 > large){
 large = num4;  
}
System.out.println(large);

}

}


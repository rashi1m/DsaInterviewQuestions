package com.coreconcept.practiceJava;
import java.util.Scanner;

public class AlphabetCaseCheck {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the word : ");
	 char word = sc.next().trim().charAt(0);
	 
	 if(word >= 'a' && word <='z' ) {
		 System.out.println("LowerCase");
		 
	 }else {
		 System.out.println("UpperCase");
	 }
		 
	 }
	 
	 
 
}

package com.coreconcept.java;
import java.util.Scanner;
public class CaseChekc {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word ");
	char gc = sc.next().trim().charAt(1);
	
	if(gc >= 'a' && gc <= 'z') {
		System.out.println("Lowercase");
	}else {
		System.out.println("Uppercase");
	}
}

}

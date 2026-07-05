package com.coreconcept.java;
import java.util.Scanner;
 
public class NewClass {
 public static void main(String[] arss) {
	 Scanner dc= new Scanner(System.in);
	 System.out.println("Enter the first name here" );
	 String name = dc.nextLine();
	 System.out.println("Enter the fathers name here ");
	 String fname= dc.nextLine();
	 System.out.println("Enter the roll no ");
	 int rollNo = dc.nextInt();
	 System.out.println("Enter the phone no ");
	 long phone = dc.nextLong();
	 System.out.println("Enter the overall percentage ");
	 float percent = dc.nextFloat();
	 
	 
	 
	 System.out.println("--------------------------+--------------------------------------+-------------------");
	 System.out.println("Application details ");
	 
	 System.out.println("The name is "+name);
	 System.out.println("The father's name is " +fname);
	 System.out.println("Roll No is "+rollNo);
	 System.out.println("The Phone no is "+phone);
	 System.out.println("The overall percentage is "+percent);
 }
}

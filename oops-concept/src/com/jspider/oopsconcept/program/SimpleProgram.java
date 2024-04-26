package com.jspider.oopsconcept.program;

import java.util.Scanner;

public class SimpleProgram {
public static void main(String[] args) {
	int product=1;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the limit number");
	 int limit=scanner.nextInt();
	for (int i = 1; i <=limit; i++) {
		product=product*i;
	}
	System.out.println("the product of first  numbers is "+product );
    scanner.close();
}
}

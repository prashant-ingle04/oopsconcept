package com.jsider.programming.batch;


import java.util.Scanner;

public class PowerOfNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a base number");
	int base=scanner.nextInt();
	System.out.println("enter a exponant");
	int exponant=scanner.nextInt();
	
	powerOfNumber(base,exponant);
	scanner.close();
}
public static void powerOfNumber(int base,int exponant) {
	int pow=1;
	for (int i =1; i<=exponant; i++) {
		pow=pow*base;
	}
	System.out.println("the power of given number is "+pow);
}
}

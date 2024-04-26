package com.jsider.programming.batch;

import java.util.Scanner;

public class DigitOfProduct {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	
	System.out.println(productOfDigit(num));
	scanner.close();
}
public static int productOfDigit(int num) {
	int product=1;
	for (int i =num; i!=0; i=i/10) {
		int digit=i%10;
		product=product*digit;
	}
	return product;
}
}

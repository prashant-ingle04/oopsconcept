package com.jsider.programming.batch;


import java.util.Scanner;

public class DigitOfSum {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	
	sumOfDigit(num);
	scanner.close();
}
public static void sumOfDigit(int num) {
	int sum=0;
	for (int i =num; i!=0; i=i/10) {
		int digit=i%10;
		sum=sum+digit;
	}
	System.out.println("the sum of digit is "+sum);
}
}

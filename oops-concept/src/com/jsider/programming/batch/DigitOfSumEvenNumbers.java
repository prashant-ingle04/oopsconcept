package com.jsider.programming.batch;

import java.util.Scanner;

public class DigitOfSumEvenNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	
	System.out.println("the sum of the even number is "+sumEvenNumbers(num));
	scanner.close();
}
public static int sumEvenNumbers(int num) {
	int sum=0;
	for (int i =num; i!=0; i=i/10) {
		int digit=i%10;
		if (digit%2==0) {
			sum=sum+digit;
		}
	}
	return sum;
}
}

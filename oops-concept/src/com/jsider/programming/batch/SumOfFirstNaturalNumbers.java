package com.jsider.programming.batch;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number ");;
	int num=scanner.nextInt();
	int sum=0;
	for (int i =1; i <=num; i++) {
		sum=sum+i;
		
	}
	System.out.println("the summation is "+sum);
	scanner.close();
}
}

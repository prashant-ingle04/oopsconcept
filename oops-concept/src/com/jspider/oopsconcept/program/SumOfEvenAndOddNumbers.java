package com.jspider.oopsconcept.program;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the range of number");
	int range=scanner.nextInt();
	int sum=0;
	int sum1=0;
	for (int i=0; i<=range;i++) {
		if(i%2==0) {
			sum=sum+i;
			
		}else if (i%2==1) {
			sum1=sum1+i;

		}
	}
	System.out.println("the even number addition is "+sum);
	System.out.println("the odd number addition is "+sum1);
	scanner.close();
}
}

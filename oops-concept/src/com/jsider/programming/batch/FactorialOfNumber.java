package com.jsider.programming.batch;

import java.util.Scanner;

public class FactorialOfNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	int facorial=1;
	for (int i =1; i <=num; i++) {
		facorial=facorial*i;
	}
	System.out.println("the given number of factorial is "+facorial);
	scanner.close();
}
}

package com.jsider.programming.batch;

import java.util.Scanner;

public class FactorialUsingRecursion {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	
	System.out.println("the factorial of given number is "+methodUsingRecursion(num));
    scanner.close();
}
public static int methodUsingRecursion(int num) {
	if (num>1) {
		return num*methodUsingRecursion(num-1);
	} else {
		return 1;
	}
}
}

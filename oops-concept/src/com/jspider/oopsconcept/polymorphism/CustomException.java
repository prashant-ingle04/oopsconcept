package com.jspider.oopsconcept.polymorphism;

import java.util.Scanner;

public class CustomException {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double balance=1000;
		System.out.println("Enter the withdraw amount");
		int amt=scanner.nextInt();
		
		if (amt>balance) {
			throw new Insufficientfund(); 
		}else {
			balance=balance-amt;
			System.out.println("the withdraw amount is " + amt);
			System.out.println("the remaining balance is " + balance);
		}
		
	}

}

class Insufficientfund extends ArithmeticException{
	
	public  String  getMessage() {
		return "insufficient balance";
	}
}

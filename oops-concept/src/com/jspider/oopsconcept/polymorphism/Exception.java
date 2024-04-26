package com.jspider.oopsconcept.polymorphism;

public class Exception {
	
	public static void main(String[] args) {
		
		try {
			int a=10/0;
		} catch (NumberFormatException e) {
            System.out.println("Exception is handled from caller");
		}
		
	}
	
	public static void m1() {
		
		int a=10/0;
	}

}

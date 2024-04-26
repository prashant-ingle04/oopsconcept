package com.jspider.oopsconcept.polymorphism;

public class Wrapper1 {
	public static void main(String[] args) {
		
//		Integer i=40;
//		
//		int i1=i.intValue();
//		System.out.println(i1);
		
		String string="12";
		System.out.println(string+10);
		
		int i=Integer.parseInt(string);
		System.out.println(i);
		
		byte b=Byte.parseByte(string);
		System.out.println(b);
		
	}

}

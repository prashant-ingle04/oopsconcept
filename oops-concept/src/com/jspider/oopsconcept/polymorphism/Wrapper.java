package com.jspider.oopsconcept.polymorphism;

public class Wrapper {
	public static void main(String[] args) {
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50f;
		double d=60;
		char c='a';
		boolean o=true;
		
		Byte byte1=Byte.valueOf(b);
		Short short1=Short.valueOf(s);
		Integer integer=Integer.valueOf(i);
		Long long1=Long.valueOf(l);
		Float float1=Float.valueOf(f);
		Double double1=Double.valueOf(d);
		Character character=Character.valueOf(c);
		Boolean boolean1=Boolean.valueOf(o);
		
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(integer);
		System.out.println(long1);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(character);
		System.out.println(boolean1);
		
	}

}

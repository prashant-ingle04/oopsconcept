package com.jspider.oopsconcept.program;

public class Driver2 {
	
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		
		A a=b;
		System.out.println(a.i);
//		System.out.println(a.j);
	}

}

class A{
	
	int i=44;
}

class B extends A{
	int j=48;
}
package com.jspider.oopsconcept.polymorphism;

public class VariableShadowing {
	public static void main(String[] args) {
		
		P parent=new P();
		System.out.println(parent.i);
		
		C child=new C();
		System.out.println(child.i);
		
		P parent2=child;
		System.out.println(parent2.i);
		
		C child2=(C)parent2;
		System.out.println(child2.i);
	}

}

class P {
	static int i=44;
}

class C extends P{
	static int i=40;
}

package com.jspider.oopsconcept.program;

public class Driver3 {
	public static void main(String[] args) {
		
		Parent a=new Child();
		
		Child b=(Child)a;
		
		System.out.println("after the downcasting");
		System.out.println(b.i);
		System.out.println(b.j);
	}

}

class  Parent{
	int i=44;
}
class Child extends Parent{
	
	int j=84;
}
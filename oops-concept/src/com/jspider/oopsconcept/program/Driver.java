package com.jspider.oopsconcept.program;

public class Driver {
public static void main(String[] args) {
		
		Inheritance2 inheritance2=new Inheritance2();
		System.out.println(inheritance2.i);
		System.out.println(inheritance2.j);
	}

}


 class Inheritance {

	int i=10;
	
	Inheritance(){
		
		super();
		System.out.println("From parent gets exicuted");
	}
}

class Inheritance2 extends Inheritance{
	
	int j=20;
	Inheritance2(){
		super();
		System.out.println("from child gets executed");
		
	}
}
 

package com.jspider.oopsconcept.polymorphism;

public class ToString {
	String name;
	int id;
	
	ToString(String name,int id){
		
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		
		return "employee name is " + name + " employee id is " + id;
	}
	
	public static void main(String[] args) {
		
		ToString toString=new ToString("Ram",44);
		System.out.println(toString);
	}

}

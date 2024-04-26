package com.jspider.oopsconcept.polymorphism;

public class MethodOverriding {
public static void main(String[] args) {
	Parent p=new Parent();
	p.m1();
	Child c=new Child();
	c.m1();
	Parent p1=c;
	p1.m1();
	Child c1=(Child)p1;
	c1.m1();
}
}
 class Parent{
	public void m1() {
		System.out.println("this is m1 method from parent");
	}
}
 class Child extends Parent{
	 public void m1() {
		 System.out.println("this m1 method from child");
	 }
 }

package com.jspider.oopsconcept.polymorphism;

public class MethodShadowing {
public static void main(String[] args) {
     A p=new A();
     p.m1(10,10);
     
     B c=new B();
     c.m1(10,10);
     
     A p1=c;
     p1.m1(10, 10);
     
     B c1=(B)p1;
     c1.m1(10, 10);
     
     
}
}
class A{
	public static void m1(int a,int b) {
		System.out.println("the addition is "+(a+b));
	}
}
class B extends A{
	public static void m1(int a,int b) {
		System.out.println("the multiplication is "+a*b);
	}
}

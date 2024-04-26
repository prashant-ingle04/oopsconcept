package com.jspider.oopsconcept.polymorphism;

public class MethodOverloading2 {
public static void main(String[] args) {
	MethodOverloading2 methodOverloading2=new MethodOverloading2();
	methodOverloading2.add(10, 10);
	methodOverloading2.add(12, 34.56f);
	methodOverloading2.add(57.56, 40);
}
public void add(int a,int b) {
	System.out.println("this is add method int,int");
}
public void add(int a,float b) {
	System.out.println("this is add method int,float");
}
public void add(double a,int b) {
	System.out.println("this is add method double,int");
}
}

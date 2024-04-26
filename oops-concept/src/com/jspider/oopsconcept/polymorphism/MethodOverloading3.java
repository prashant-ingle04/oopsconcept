package com.jspider.oopsconcept.polymorphism;

public class MethodOverloading3 {
public static void main(String[] args) {
	MethodOverloading3 methodOverloading3=new MethodOverloading3();
	methodOverloading3.add(10, 12.44);
}
public void add(int a,int b) {
	System.out.println("this is add method from int ,int");
}
public void add(double a,double b) {
	System.out.println("this is add method from double ,double");
}
}

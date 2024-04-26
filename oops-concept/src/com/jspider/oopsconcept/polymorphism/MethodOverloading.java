package com.jspider.oopsconcept.polymorphism;

public class MethodOverloading {
public static void main(String[] args) {
	add();
	add(10);
	add(30,30);
}
public static void add() {
	System.out.println("This is add method from no argument");
}
public static void add(int a) {
	System.out.println("this is add method from argument int ");
}
public static void add(int a,int b) {
	System.out.println("this is add method from argument int,int");
}
}

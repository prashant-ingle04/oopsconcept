package com.jspider.oopsconcept.polymorphism;

public class Book {
	
	String bname;
	
	public Book(String bname) {
		this.bname=bname;
	}
	
	public static void main(String[] args) {
		
		Book b1=new Book("Java");
		Book b2=new Book("Java");
		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}

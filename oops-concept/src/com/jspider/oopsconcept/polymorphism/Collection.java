package com.jspider.oopsconcept.polymorphism;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
		
//		ArrayList arrayList=new ArrayList<>();
//		arrayList.isEmpty();
//		arrayList.add("Ram");
//		arrayList.add(10);
//		arrayList.add(null);
//		
//		arrayList.add(2, "patil");
//		arrayList.add(1,0);
//		System.out.println(arrayList);

		//	difference between add and addAll Method
		
//		ArrayList a=new ArrayList<>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		
//		System.out.println("the first array element is " +a);
//		
//		ArrayList a1=new ArrayList<>();
//		a1.add(40);
//		a1.add(50);
//		a1.add(60);
		
		//System.out.println("the second array element is " +a1);
		
//		a.add(a1);
//		System.out.println("after adding method");
//		
//		System.out.println(a);
//		System.out.println(a1);
		
//		a.addAll(a1);
//		System.out.println("after adding all method");
//		System.out.println(a);
//		System.out.println(a1);
		
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		System.out.println("the first collection is " +a);
		
		ArrayList a1=new ArrayList<>();
		a1.add(2);
		a1.add(5);
		a1.add(9);
		a1.add(10);
		
		System.out.println("the second collection is " +a1);
		
//		a.removeAll(a1);
//		System.out.println("the first collection is " +a);
//		System.out.println("the second collection is " +a1);
		
		a.retainAll(a1);
		System.out.println("the first collection is " +a);
		System.out.println("the second collection is " +a1);
	}

}

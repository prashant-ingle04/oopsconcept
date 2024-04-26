package com.jspider.oopsconcept.polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {
	
	public static void main(String[] args) {
		
//	ArrayList a=new ArrayList<>();
//	a.add(10);
//	a.add(20);
//	a.add(30);
//	a.add(40);
//	
//	
//	for (int i = 0; i <= a.size()-1; i++) {
//		System.out.println(a.get(i));
//	}
		
//		ArrayList a=new ArrayList<>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		
//		for (Object object : a) {
//			System.out.println(object);
//		}
		
//		ArrayList a=new ArrayList<>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(4);
//		
//		Iterator it=a.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ArrayList a=new ArrayList<>();
		a.add(44);
		a.add(45);
		a.add(48);
		a.add(84);
		
		
		ListIterator li=a.listIterator(2);
		System.out.println(a);
		System.out.println(li.hasNext());
		System.out.println(li.next());
		
		li.add(35);
		
		li.add(50);
		
		System.out.println(a);
		
		System.out.println(li.next());
		li.remove();
		System.out.println(a);
		
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		
		System.out.println(li.hasNext());
		System.out.println(li.next());
		
		System.out.println(li.hasNext());
		System.out.println(li.next());
		
	}

}

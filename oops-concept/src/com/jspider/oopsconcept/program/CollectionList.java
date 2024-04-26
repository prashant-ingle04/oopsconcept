package com.jspider.oopsconcept.program;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionList {
public static void main(String[] args) {
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	arrayList.add(10);
	arrayList.add(30);
	arrayList.add(44);
	arrayList.add(48);
	
	for (Integer integer : arrayList) {
		System.out.println(integer);
	}
}
}

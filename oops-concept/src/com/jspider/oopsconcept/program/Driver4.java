package com.jspider.oopsconcept.program;

public class Driver4 {

	public static void main(String[] args) {
		
		W w=new Y();
		System.out.println(w.i);
		//System.out.println(w.j);
		System.out.println(w instanceof X);
		
		X x=(X)w;
		System.out.println(x.i);
		System.out.println(x.j);
//		System.out.println(x.k);
		
		System.out.println(x instanceof Y);
		Y y=(Y)x;
		System.out.println(y.i);
		System.out.println(y.j);
		System.out.println(y.k);
//		System.out.println(y.l);
		
		System.out.println(y instanceof Z);
		
	}
	
}

class W{
	int i=44;
}

class X extends W{
	int j=88;
}

class Y extends X{
	int k=40;
} 
class Z extends Y{
	int l=16;
}
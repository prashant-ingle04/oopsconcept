package com.jspider.oopsconcept.program;

public class ToString {
public static void main(String[] args) {
	ToString toString=new ToString("prashant", 44);
	System.out.println(toString);
}
String sname;
int id;
public ToString(String sname,int id) {
	this.sname=sname;
	this.id=id;
}
public String  toString() {
	return "student name "+sname+
			" student id "+id;	
	
}
}

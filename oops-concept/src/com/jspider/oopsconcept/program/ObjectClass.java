package com.jspider.oopsconcept.program;

public class ObjectClass {
public static void main(String[] args) {
	ObjectClass objectClass=new ObjectClass("Prashant",44,25000);
	ObjectClass objectClass2=new ObjectClass("Ingle",66,5676);
	System.out.println(objectClass.toString());
	System.out.println(objectClass2.toString());
	System.out.println(objectClass.equals(objectClass2));
	System.out.println(objectClass.hashCode());
	System.out.println(objectClass2.hashCode());
}
String ename;
int empid;
double esal;
public ObjectClass(String ename, int empid, double esal) {
	this.ename = ename;
	this.empid = empid;
	this.esal = esal;
}
public String toString() {
	return "the employee name is "+ename+" the employee id is "+empid+
			" the employee salary is "+esal;
}
public boolean equals(Object o) {
	ObjectClass objectClass=(ObjectClass)o;
	if (this.empid==objectClass.empid) {
		return true;
	} else {
        return false;
	}
}
public int hashCode() {
	int a=ename.hashCode();
	int b=empid;
	int c=(int)esal;
	return a+b+c;
}
}

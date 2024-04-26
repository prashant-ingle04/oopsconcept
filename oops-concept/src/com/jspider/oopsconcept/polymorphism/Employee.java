package com.jspider.oopsconcept.polymorphism;

public class Employee {
	
	String name;
	int id;
	double sal;
	
	public Employee(String name,int id,double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		return "Employee name is " + name + 
				" employee id is " + id + 
				" employee sal is "+ sal;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		if (this.id==e.id) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int a=name.hashCode();
		int b=id;
		int c=(int)sal;
		return a+b+c;
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee("Ram", 4, 4545);
		Employee e2=new Employee("Laxman", 4, 5557);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}

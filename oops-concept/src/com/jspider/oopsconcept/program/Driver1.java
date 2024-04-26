package com.jspider.oopsconcept.program;

public class Driver1 {

	public static void main(String[] args) {
		
		Bike bike=new Bike("Nanded", "Pune", 300);
		System.out.println("starting point is " +bike.start);
		System.out.println("destination point is "+ bike.destination);
		System.out.println("charges will be "+ bike.cost);
		
		Car car=new Car("Mukhed", "Rajura", 200);
		System.out.println("starting point is " +car.start);
		System.out.println("destination point is "+ car.destination);
		System.out.println("charges will be "+ car.cost);
	}
}

class Ola{
	String start;
	String destination;
	
	public Ola(String start,String destination) {
     this.start=start;
     this.destination=destination;	
	}
}

class Bike extends Ola{
	double cost;
	public Bike(String start,String destination,double cost) {
	super(start, destination);
	this.cost=cost;
	}
}

class Car extends Ola{
	double cost;
	
	public Car(String start,String destination,double cost) {
		super(start, destination);
		this.cost=cost;
	}
}

package com.jspider.oopsconcept.program;

public class Abstraction {
public static void main(String[] args) {
Mobile mobile=new SS2();
mobile.mp3();
mobile.camera();
mobile.browser();
}
}

 abstract class Mobile{
	 abstract public void camera();
	 abstract public void mp3();
	 abstract public void browser();
}
   abstract class Samsung extends Mobile {
	  public void camera() {
		  System.out.println("This is camera from samsung");
	  }
  }
  
  class SS2 extends Samsung{
	  public void mp3() {
		System.out.println("This is mp3 from  SS2");
	}
	  public void browser() {
		System.out.println("This is browser from SS2");
	}
  }

package com.visible;

class Poly1{
	void disp1() {
		System.out.println("Inside parent disp1");
	}
	
	void disp2() {
		System.out.println("Inside parent disp2");
	}
}		

class Poly2 extends Poly1 {
//	@override
	void disp2() {
		System.out.println("Inside child method");
	}
	void disp3() {
		System.out.println("Inside child 2 method");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Poly1 P= new Poly2();
		  P.disp1();
		  P.disp2();
		  ((Poly2)(P)).disp3(); 
//		  here is downcasting is getting.

	}

}

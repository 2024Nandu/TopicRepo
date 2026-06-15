package com.visible;

class TempRanger {
	public void print1(String lastName) {
		System.out.println(lastName);
	}
//	public void print2(String secondName) {
//		
//	}
//	public void print3(String address) {
//		
//	}
}

public class Ranger {

	public static void main(String[] args) {
		
		Ranger r = new Ranger();
		TempRanger r1 = new TempRanger();
		r.operate(r1);
		
	}
	
	public void operate(TempRanger ranger) {
		ranger.print1("Mohan");
		ranger.print1("Nandu");
		ranger.print1("Govind");
		
	}
}

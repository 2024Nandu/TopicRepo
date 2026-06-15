package com.visible;

 class Outer {
		int a = 10;
		
		class Inner {
			int b = 20;
			void disp2() {
				System.out.println(a);
				System.out.println(b);    
			}
		}
		
		void disp1() {
			System.out.println(a);
		}
}

class InnerClass {
	public static void main(String[] args) {
		Outer outer  = new Outer();
		outer.disp1();
		
		Outer.Inner I = outer.new Inner();
		I.disp2();
	}
}


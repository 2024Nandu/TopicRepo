package com.visible;

class Developer{
	
	public void work() {
		System.out.println("Developer is working");
	}
}

class JavaDeveloper extends Developer{
	
	public void javaWork() {
		System.out.println("Java Developer is working");
	}
}

class PythonDeveloper extends  Developer{
	public void PythonWork() {
		System.out.println("Python is working");
	}
}

public class Learning {

	public static void main(String[] args) {
		
		//PythonDeveloper py = new PythonDeveloper();
		
		//py.PythonWork();
		
		Developer dev = new PythonDeveloper();
		PythonDeveloper a=(PythonDeveloper) dev;
		
		
		
		
		
		
		dev.work();
		
		
		
	}

}


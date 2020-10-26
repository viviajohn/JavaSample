
public class methods {

	public static void myMethod() {
		System.out.println("Calling Method");
	}
	
	public static void myMethodName(String fname) {
		System.out.println("Printing " + fname);
	}
	
	public static void myMethodAge(String fname, int age) {
		System.out.println(fname + " is " + age + " years old.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();
		myMethod();
		myMethod();
		
		myMethodName("Liam");
		myMethodName("Jenny");
		myMethodName("Anja");
		
		myMethodAge("Liam", 10);
		myMethodAge("Jenny", 20);
		myMethodAge("Anja", 30);
	}

}


public class ReturnStatements {
	
	static int myMethodOne(int x) {
		return 5 + x;
	}
	
	static int myMethodTwo(int x, int y) {
		return x + y;
	}
	
	static void checkAge(int x) {
		if (x<=19)
			System.out.println("You are a teenager!");
		else
			System.out.println("You are old enough!");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myMethodOne(3));	
		System.out.println(myMethodTwo(5, 3));	
		
		int z = myMethodTwo(4, 6);
		System.out.println(z);
		
		checkAge(10);
	}

}


public class MethOver {
	
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = plusMethod(5, 3);
		double myDouble = plusMethod(6.73, 5.23);
		
		System.out.println(myInt);
		System.out.println(myDouble);

	}

}


public class Recursion {
	
	public static int sumDouble(int varOne, int varTwo) {
		if(varTwo > varOne) {
			return varTwo + sumDouble(varOne, varTwo-1);
		}
		else {
			return varOne;
		}
	}
	
	public static int sumSingle(int var) {
		if(var > 0) {
			return var + sumSingle(var-1);
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum (1-10)= " + sumSingle(10));
		System.out.println("Sum (1-4)= " + sumSingle(4));
		System.out.println("Sum (5-10)= " + sumDouble(5, 10));
		}

}

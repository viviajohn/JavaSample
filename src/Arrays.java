
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Volvo", "BMW", "Mazda", "Mercedes"};
		System.out.println("Value of 0th position: " + cars[0]);
		
		cars[0] = "Opel";
		System.out.println("Value of 0th position: " + cars[0]);
		
		System.out.println("Length of cars array: " + cars.length);
		
		int i;
		System.out.println("The cars in the array are: ");
		for(i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("The cars in the array are: ");
		for(String a: cars) {
			System.out.println(a);
		}
		
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		int j;
		
		for(i = 0; i < myNumbers.length; i++)
			for(j = 0; j < myNumbers[i].length;j++)
				System.out.println(myNumbers[i][j]);
		

	}

}

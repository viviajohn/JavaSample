
public class Strings {
	public static void main(String[] args)
	{
		String myString = "Hello World";
		String oneString = "Jane";
		String twoString = "Doe";
		String x = "10";
		int y = 20;
		String z = x+y;
		
		System.out.println("Length of myString: " + myString.length());
		System.out.println("Upper Case: " + myString.toUpperCase());
		System.out.println("Lower Case: " + myString.toLowerCase());
		System.out.println("Location of World: " + myString.indexOf("World"));
		System.out.println(oneString + " " + twoString);
		System.out.println(oneString.concat(twoString));
		System.out.println("My name is \"Jane Doe\"");
		System.out.println("z = " + z);
	}
	

}

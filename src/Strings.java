
public class Strings {
	public static void main(String[] args)
	{
		String myString = "Hello World";
		String oneString = "Jane";
		String twoString = "Doe";
		
		System.out.println("Length of myString: " + myString.length());
		System.out.println("Upper Case: " + myString.toUpperCase());
		System.out.println("Lower Case: " + myString.toLowerCase());
		System.out.println("Location of World: " + myString.indexOf("World"));
		System.out.println(oneString + " " + twoString);
		
		System.out.println("My name is \"Jane Doe\"");
	}
	

}
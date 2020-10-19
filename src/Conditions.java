
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y=9;
		
		if(x>y) {
			System.out.println("x is greater than y");
		}
		
		int time = 20;
		
		if(time < 18) {
			System.out.println("Good Day!");
		}
		else {
			System.out.println("Good Evening");
		}
		
		int oTime = 22;
		
		if(oTime < 10) {
			System.out.println("Good Morning");
		}
		else if (oTime < 20) {
			System.out.println("Good Afternoon");
		}
		else {
			System.out.println("Good Evening");
		}
		
		int atime = 20;
		
		String result = (atime < 18)? "Good Day" : "Good Evening";
		System.out.println(result);
	}

}

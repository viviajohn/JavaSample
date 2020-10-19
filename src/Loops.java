
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(i < 5) {
			System.out.println(i);
			i++;
		}
			
		int j = 0;
		
		do {
			System.out.println(j);
			j++;
		}while(j < 5);
		
		int k=0;
		
		for(k = 0; k < 5; k++) {
			System.out.println(k);
		}
		
		String[] cars = {"Volvo", "BMW", "Nissan", "Ford", "Mazda"};
		
		for( String e: cars) {
			System.out.println(e);
		}
		
		int a;
		for(a = 0; a <=10; a++) {
			if(a == 5)
				break;
			System.out.println(a);
		}
		
		for(a = 0; a <=10; a++) {
			if(a == 5)
				continue;
			System.out.println(a);
		}
		
	}

}

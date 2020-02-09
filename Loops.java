
public class Loops {

	public static void main(String[] args) {
	
		int i = 0;
		while (i <= 100) {
			 if (i % 2 == 0) {
				System.out.println(i);
			} i++;
		}
	

		int x = 100;
		while (x >= 0) {
			 if (x % 3 == 0) {
				System.out.println(x);
			} x--;
		}
		
		
		for (int y = 1; y <= 100; y++) {
			if (y % 2 != 0)
				System.out.println(y);
		}
		
		
		for (int n = 0; n <= 100; n++) {
			if ((n % 3 == 0) && (n % 5 == 0)) {
				System.out.println("HelloWorld");
			} else if (n % 3 == 0 && n % 5 != 0) {
				System.out.println("Hello");
			} else if (n % 5 == 0 && n % 3 != 0) {
				System.out.println("World");
			} else {
				System.out.println(n);
			}
		}
		
		
	}	
}


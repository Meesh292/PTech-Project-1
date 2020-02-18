
public class Arrays {
	public static void main(String[] args) {
		int age[] = {3, 9, 23, 64, 2, 8, 28, 93};
		int firstNum = age[0];
		int lastNum = age[age.length-1];
		int difference = lastNum - firstNum;
		System.out.println(difference);
	
//average age
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		} int average = sum / age.length;
		System.out.println(average);
	
//letters per name
 		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
		int total = 0;
		for (String name : names) {
		name.length();
		total += name.length();
		} int average1 = total / names.length;
		System.out.println(average1);

// concatenate names		
		String name2[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		String names2 = "";
		for (int i = 0; i < name2.length; i++) {
		names2 += name2[i] + " ";
		} System.out.println(names2);
		

// name lengths
		
		int[] nameLengths = new int[names.length];
		for (int i= 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		} for (int length : nameLengths) {
		System.out.println(length);
		}
	
//sum of elements
		int total2 = 0;
		for (String name3 : names) {
		name3.length();
		total2 += name3.length();
		} int letters = total2;
		System.out.println(total2);
		
		
	}

}	




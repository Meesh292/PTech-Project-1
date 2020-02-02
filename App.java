
public class App {

	public static void main(String[] args) {

		int itemPrice1 = 24;
		System.out.println("Price for item 1 is $" + itemPrice1);
		
		double itemPrice2 = 23.85;
		System.out.println("Price for item 2 is $" + itemPrice2);
		
		int wallet1 = 100;
		System.out.println("Money in wallet 1 is $" + wallet1);
		
		double wallet2 = 50.27;
		System.out.println("Money in wallet 2 is $" + wallet2);
		
		int totalNumberOfFriends1 = 100;
		System.out.println("Number of friends for person 1 is " + totalNumberOfFriends1);
		
		int totalNumberOfFriends2 = 50;
		System.out.println("Number of friends for person 2 is " + totalNumberOfFriends2);
		
		int age1 = 20;
		System.out.println("Age of person 1 is " + age1);
		
		int age2 = 50;
		System.out.println("Age of person 2 is " + age2);
		
		String firstName1 = "Joe";
		System.out.println("First name of person 1 is " + firstName1);
		
		String firstName2 = "Marco";
		System.out.println("First name of person 2 is " + firstName2);
		
		String lastName1 = "Schmo";
		System.out.println("Last name of person 1 is " + lastName1);
		
		String lastName2 = "Polo";
		System.out.println("Last name of person 2 is " + lastName2);
		
		char middleInitial1 = 'P';
		System.out.println("Middle initial of person 1 is " + middleInitial1);
		
		char middleInitial2 = 'C';
		System.out.println("Middle initial of person 2 is " + middleInitial2);
		
		int newAmountOfMoney1 = wallet1 - itemPrice1;
		
		double newAmountOfMoney2 = wallet2 - itemPrice2;
		
		int friendsPerYear1 = totalNumberOfFriends1 / age1;
		
		int friendsPerYear2 = totalNumberOfFriends2 / age2;
		
		String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
		
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;

		System.out.println("New amount of money for person 1 is $" + newAmountOfMoney1);
		
		System.out.println("New amount of money for person 2 is $" + newAmountOfMoney2);
		
		System.out.println("Number of friends per year of person 1 is " + friendsPerYear1);
		
		System.out.println("Number of friends per year of person 2 is " + friendsPerYear2);
		
		System.out.println("Person 1's full name is " + fullName1);
		
		System.out.println("Person 2's full name is " + fullName2);

	}

}

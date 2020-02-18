
public class newArray {
	
	public static void main(String[] args) {

	}
	//Hello
	public static String line(String word, int n) {
		String sentence = "";
		for (int i = 0; i < n; i++) {
		sentence += word;
		} return sentence;()

	}
	//Full Name
	public static String fullName(String firstName, String lastName) {
		String name = firstName + " " + lastName;
		return name;
	}
	//>100
	public static boolean myArray(int [] array) {
		int sum = 0;
		for (int number : array) {
		sum += number;
		} return sum > 100;
	}
	public static double array2(double[] arr) {
		double add = 0;
		for (double element : arr) {
		add += element;
		} return add / arr.length;
	}
	//Averages
	public static boolean average(double[] one, double[] two) {
		return array2(one) > array2(two);
	}
	// willBuyDrink
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);	
	}
	//If myMoney is more than cost, it will print "true".
	public static boolean more(double myMoney, double cost) {
		return myMoney > cost;
	
	}
}
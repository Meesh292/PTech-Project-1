
public class week2 {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 1.99;
		int moneyInWallet = 50;
		int thirstLevel = 2;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
			System.out.println(shouldBuyIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday;
			System.out.println(willGoSwimming);
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
			System.out.println(isAGoodDay);
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
			System.out.println(willBuyMilk);
		
			
				

	}

}

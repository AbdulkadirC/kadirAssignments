package assignment3_ArithmeticOperators;

public class question7 {

	public static void main(String[] args) {
		
		int price, change, bill, quarter, dimes, nickles;
		price = 95;
        change = 100 - price;

        quarter = change/25;
        dimes = (change%25) / 10;
        nickles = (change%25)%10 / 5;
		
		
		
		
		
		
		System.out.println("Your change is " + quarter + " quarters " + dimes + " dimes " + nickles + " nickles");
	}

}

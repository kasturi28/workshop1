import java.util.Random;

public class GamblerProgram {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * defining the variable stake , bet display the welcome message display the
		 * amount & bet statement for the gambler
		 */

		int amount = 100;
		int bet = 1;
		int amountafterbetting;

		System.out.println("Welcome to the Gambler programme....");
		System.out.println("total amount of the gambler = " + amount);
		System.out.println("The gambler start with the amount = " + bet);

		Random random = new Random();
		int betting = random.nextInt(1);

		if (betting <= 0.5) {

			System.out.println("Gambler won the bet...");
			amountafterbetting = amount + bet;
			System.out.println("Gambler's total amount = " + amountafterbetting);

		} else {

			System.out.println("Gambler lost the bet...");
			amountafterbetting = amount - bet;
			System.out.println("Gambler's total amount = " + amountafterbetting);

		}

		for (amount = 100; amount < 150; amount++) {
			amountafterbetting = amount + bet;
			System.out.println("Gambler won the bet...");
			System.out.println("Gambler's total amount = " + amountafterbetting);
		}
		for (amount = 100; amount > 50; amount--) {
			amountafterbetting = amount - bet;
			System.out.println("Gambler lost the bet...");
			System.out.println("Gambler's total amount = " + amountafterbetting);
		}

	}

}

import java.util.Random;

public class GamblerProgram {
	/**
	 * 
	 * @param args
	 */

	static int amount = 100;
	static final int BET = 1;
	static int amountafterbetting;
	static int upper = 0;
	static int lower = 0;

	public static void main(String[] args) {
		/*
		 * defining the variable stake , bet display the welcome message display the
		 * amount & bet statement for the gambler
		 */

		System.out.println("Welcome to the Gambler programme....");
		System.out.println("total amount of the gambler = " + amount);
		System.out.println("The gambler start with the amount = " + BET);

		Random random = new Random();
		int betting = random.nextInt(2);

		if (betting == 0) {

			// System.out.println("Gambler won the bet...");
			amount++;
			// System.out.println("Gambler's total amount = " + amountafterbetting);

		} else {

			// System.out.println("Gambler lost the bet...");
			amount--;
			// System.out.println("Gambler's total amount = " + amountafterbetting);

		}

		upper = (int) (amount * 1.5);
		lower = (int) (amount * 0.5);

		while (amountafterbetting < upper && amountafterbetting < lower) {

			if (betting == 0) {
				amount++;
			} else {
				amount--;
			}
			System.out.println("Gambler's total amount = " + amount);
		}

	}

}

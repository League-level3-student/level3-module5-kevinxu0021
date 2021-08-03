package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// If times is 1
		// Return number
		if (times == 1) {
			return number;
		} else {
			// Else return number + recursionMultiplication(number, times-1)
			return (number + recursiveMultiplication(number, times - 1));
		}
	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	static int answer = 0;

	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (numberToDivideBy > number) {
			return 0;
		} else {
			return (1 + recursiveDivision(number - numberToDivideBy, numberToDivideBy));
		}
	}

	// Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 0) {
			return 1;
		} else {
			return (number * recursivePower(number, power - 1));
		}
	}
}

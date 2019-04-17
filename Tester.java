import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);

		Temperature onlyTemperature = new Temperature(45);
		Temperature onlyScale = new Temperature('C');
		Temperature celsiusInput = new Temperature(61, 'C');
		Temperature fahrenheitInput = new Temperature(65, 'F');
		Temperature defaultTemperature = new Temperature();

		// printing the input given to celsiusInput()
		System.out.print("Given Input: " + celsiusInput.toString());
		// converting celsiusInput Objects to Fahrenheit
		celsiusInput.convertToFahrenheit();
		System.out.println("To Fahrenheit: " + celsiusInput.toString());
		// converting fahrenheitInput variables to Celsius
		System.out.print("Given Input: " + fahrenheitInput.toString());
		fahrenheitInput.convertToCelsius();
		System.out.println("To Celsius: " + fahrenheitInput.toString());

		// Changing temperature and scale using setters
		System.out.println("Setting Scale(F)");
		System.out.print("Before setting: " + onlyScale.toString());
		onlyScale.setScale('F');
		System.out.println("After setting: " + onlyScale.toString());
		System.out.println("Setting Temperature(90)");
		System.out.print("Before setting: " + onlyTemperature.toString());
		onlyTemperature.setTemperature(90);
		System.out.println("After setting: " + onlyTemperature.toString());
		System.out.println("Setting both temperature(56) and scale(F)");
		System.out.print("Before setting: " + onlyTemperature.toString());
		onlyTemperature.setBoth(56, 'F');
		System.out.println("After setting: " + onlyTemperature.toString());

		// onlyScale object has Temperature == 0, so must be less than onlyTemperature's
		// temperature
		System.out.println("\nTesting for isLess:");
		System.out.println("Is " + onlyScale.toString() + "less than " + onlyTemperature.toString() + "?");
		if (onlyScale.isLess(onlyTemperature)) {
			System.out.println("Yes, the temperature is less than the given temperature.");
		} else {
			System.out.println("No, the temperature is not less than the given temperature.");
		}

		// false case for isLess
		System.out.println("\nIs " + fahrenheitInput.toString() + "less than " + onlyTemperature.toString() + "?");
		if (fahrenheitInput.isLess(onlyTemperature)) {
			System.out.println("Yes, the temperature is less than the given temperature.");
		} else {
			System.out.println("No, the temperature is not less than the given temperature.");
		}

		// True case for isGreater
		System.out.println("\nTwo cases for isGreater:");
		System.out.println("Is " + onlyTemperature.toString() + "greater than " + onlyScale.toString() + "?");
		if (onlyTemperature.isGreater(onlyScale)) {
			System.out.println("Yes, the temperature is greater than the given temperature.");
		} else {
			System.out.println("No, the temperature is not greater than the given temperature.");

		}

		// False case for isGreater
		System.out.println("\nIs " + onlyTemperature.toString() + "greater than " + celsiusInput.toString() + "?");
		if (onlyTemperature.isGreater(celsiusInput)) {
			System.out.println("Yes, the temperature is greater than the given temperature.");
		} else {
			System.out.println("No, the temperature is not greater than the given temperature.");

		}

		// A condition where we get, 'The temperatures are equal.'

		// Testing whether they are greater than, less than or equal to an object
		System.out.println("\nTesting for isEqual");
		System.out.println("Are " + onlyTemperature.toString() + "& " + onlyScale.toString() + "equal?");
		if (onlyTemperature.isEqual(onlyScale)) {
			System.out.println("Yes, the temperatures are equal.");
		} else {
			System.out.println("No, the temperatures are not equal.");
		}

		// testing for 32.0 degree F and 0.0 degree C
		onlyScale.setTemperature(32);// setting fahrenheit value
		System.out.print("\nCurrent Values..\nonlyScale.toString: " + onlyScale.toString());
		System.out.print("defaultTemperature.toString: " + defaultTemperature.toString());
		if (defaultTemperature.isEqual(onlyScale)) {
			System.out.println("The temperatures are equal.");
		} else {
			System.out.println("The temperatures are not equal.");
		}

		// Testing for -40C and -40F
		System.out.println("\nTesting for -40C and -40F");
		Temperature testing1 = new Temperature(-40, 'C');
		Temperature testing2 = new Temperature(-40, 'F');
		if (testing1.isEqual(testing2)) {
			System.out.println("The temperatures are equal");
		} else {
			System.out.println("The temperatures are not equal");
		}

		// Testing for 100C and 212F
		System.out.println("\nTesting for 100C and 212F");
		Temperature testing3 = new Temperature(100, 'C');
		Temperature testing4 = new Temperature(212, 'F');
		if (testing4.isEqual(testing3)) {
			System.out.println("The temperatures are equal");
		} else {
			System.out.println("The temperatures are not equal");
		}

		keyb.close();
	}

}

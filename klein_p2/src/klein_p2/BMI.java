package klein_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type 1 if you want to give weight in POUNDS, type 2 if you want to give weight in KILOGRAMS");
		int choice = in.nextInt();
		
		if (choice == 1) {
			
			System.out.println("Enter your weight in POUNDS");
			double weightInPounds = in.nextDouble();
			System.out.println("Enter your height in INCHES");
			double heightInInches = in.nextDouble();
			double formula_BMI = (703 * weightInPounds) / (heightInInches * heightInInches);
			
			System.out.printf("Your BMI is %.2f\n", formula_BMI);
		}
		if(choice == 2) {
			System.out.println("Enter your weight in KILOGRAMS");
			double weightInKilograms = in.nextDouble();
			System.out.println("Enter your height in METERS");
			double heightInMeters = in.nextDouble();
			double formula_BMI = weightInKilograms / (heightInMeters * heightInMeters);
			
			System.out.printf("Your BMI is %.2f\n", formula_BMI);
		}
		
		
		System.out.println("--------------------------------\n");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");

		
		in.close();
	}

}

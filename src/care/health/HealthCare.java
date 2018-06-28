package care.health;

import java.util.InputMismatchException;
import java.util.Scanner;

import bmi.BMI;
import bmr.BMR;

public class HealthCare {
	Scanner sc = new Scanner(System.in);

	public void homePage() {
		System.out.println();
		BMR bmr = new BMR();
		BMI bmi = new BMI();
		int choice = 0;
		System.out.println("Welcome to HealthCare");
		System.out.println("Check your BMR and BMI of your body");
		System.out.println("1.Check BMR");
		System.out.println("2.Check BMI");
		System.out.println("Enter your choice 1 or 2");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Give valid input");
			sc.nextLine();
			homePage();
		}

		if (choice == 1) {
			bmr.about();
		} else if (choice == 2) {
			bmi.about();
		} else {
			System.out.println("choose appropriate option");
			homePage();
		}
	}

	public static void main(String[] args) {
		HealthCare h = new HealthCare();
		h.homePage();
	}
}

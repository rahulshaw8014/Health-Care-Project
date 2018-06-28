package bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

import bmr.BMR;
import care.health.HealthCare;
import tips.health.WeightModification;

public class BMI extends BMR {
	Double bmi;

	public void about() {
		System.out.println();
		System.out.println(
				"BMI is used as a screening tool to indicate whether a person is underweight, overweight, obese or a healthy weight for their height.\r\n"
						+ "\r\n"
						+ "If a person's BMI is out of the healthy BMI range, their health risks may increase significantly.3\r\n"
						+ "\r\n"
						+ "BMI values are age-independent and the same for both sexes. However, BMI may not correspond to the same degree of fatness in different populations due to different body proportions.");

		System.out.println("A Normal BMI range is: 18.5kg/m^2 - 25kg/m^2");
		System.out.println("Know your BMI by giving us some detalis about your body");
		getAge();
	}

	public void goToCureUnderWeight() {
		System.out.println();
		WeightModification wm = new WeightModification();
		HealthCare hc = new HealthCare();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("1.You want tips to cure this");
		System.out.println("2.Go to HomePage");
		System.out.println("enter 1 or 2");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("choose appropriate option");
			sc.nextLine();
			calculate();
		}
		if (choice == 1) {
			wm.tipsForUnderWeight();
		}

		else if (choice == 2) {
			hc.homePage();
		} else {
			System.out.println("Choose appropriate option");
			calculate();
		}
	}

	public void goToCureOverWeightAndObese() {
		System.out.println();
		WeightModification wm = new WeightModification();
		HealthCare hc = new HealthCare();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("1.You want tips to cure this");
		System.out.println("2.Go to HomePage");
		System.out.println("enter 1 or 2");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("choose appropriate option");
			sc.nextLine();
			calculate();
		}
		if (choice == 1) {
			wm.tipsForOverWeightAndObese();
		}

		else if (choice == 2) {
			hc.homePage();
		} else {
			System.out.println("Choose appropriate option");
			calculate();
		}

	}

	public void calculate() {
		WeightModification wm = new WeightModification();
		System.out.println();
		height /= 100;
		bmi = weight / (Math.pow(height, 2));
		System.out.println("Your BMI is " + bmi + "kg/m^2");
		if (bmi < 16) {
			System.out.println("You have Severe Thinness");
			goToCureUnderWeight();
		}

		else if (bmi == 16) {
			System.out.println("you have Moderate Thinness");
			goToCureUnderWeight();
		}

		else if (bmi >= 17 && bmi < 18.5) {
			System.out.println("You have Mild Thinness");
			goToCureUnderWeight();
		}

		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("You are Normal");
			wm.goToHome();
		}

		else if (bmi >= 25 && bmi < 30) {
			System.out.println("You are OverWeight");
			goToCureOverWeightAndObese();
		}

		else if (bmi >= 30 && bmi < 35) {
			System.out.println("You are in Obese Class I");
			goToCureOverWeightAndObese();
		}

		else if (bmi >= 35 && bmi < 40) {
			System.out.println("You are in Obese Class II");
			goToCureOverWeightAndObese();
		}

		else {
			System.out.println("You are in Obese Class III");
			goToCureOverWeightAndObese();
		}
	}

}

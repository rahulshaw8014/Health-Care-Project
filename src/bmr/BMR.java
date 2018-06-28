package bmr;

import java.util.InputMismatchException;
import java.util.Scanner;

import care.health.HealthCare;
import tips.health.WeightModification;

public class BMR {
	Scanner sc = new Scanner(System.in);
	Double bmr;
	protected int age;
	protected int gender;
	protected Double height;
	protected Double weight;

	public void about() {
		System.out.println(
				"The basal metabolic rate (BMR) is the amount of energy needed while resting in a temperate environment when the digestive system is inactive. It is the equivalent of figuring out how much gas an idle car consumes while parked. In such a state, energy will be used only to maintain vital organs, which include the heart, lungs, kidneys, nervous system, intestines, liver, lungs, sex organs, muscles, and skin. For most people, upwards of ~70% of total energy (calories) burned each day is due to upkeep. Physical activity makes up ~20% of expenditure and ~10% is used for the digestion of food, also known as thermogenesis.\r\n"
						+ "\r\n"
						+ "The BMR is measured under very restrictive circumstances while awake. An accurate BMR measurement requires that a person's sympathetic nervous system is inactive, which means the person must be completely rested. Basal metabolism is usually the largest component of a person's total caloric needs. The daily caloric need is the BMR value multiplied by a factor with a value between 1.2 and 1.9, depending on activity level.");

		System.out.println("Know your BMR by giving us some detalis about your body");
		getAge();
	}

	public void getAge() {
		System.out.println();
		System.out.println("Enter your age...");
		try {
			age = sc.nextInt();
			getGender();
		} catch (InputMismatchException e) {
			System.out.println("enter valid detail");
			sc.nextLine();
			getAge();
		}
	}

	public void getGender() {
		System.out.println();
		System.out.println("Select your gender...");
		System.out.println("1.Male");
		System.out.println("2.Female");
		System.out.println("Enter 1 or 2");
		try {
			gender = sc.nextInt();
			getHeight();
		} catch (InputMismatchException e) {
			System.out.println("enter valid choice");
			sc.nextLine();
			getGender();
		}
	}

	public void getHeight() {
		System.out.println();
		System.out.println("Enter height in centimetre...");
		try {
			height = sc.nextDouble();
			getWeight();
		} catch (InputMismatchException e) {
			System.out.println("enter valid detail");
			sc.nextLine();
			getHeight();
		}
	}

	public void getWeight() {
		System.out.println();
		System.out.println("Enter weight in kilogram...");
		try {
			weight = sc.nextDouble();
			calculate();
		} catch (InputMismatchException e) {
			System.out.println("enter valid detail");
			sc.nextLine();
			getWeight();
		}
	}

	public void calculate() {
		System.out.println();
		if (gender == 1) {
			bmr = 10 * weight + 6.25 * height - 5 * age + 5;
			System.out.println("Your BMR is : " + bmr + " calories");
		} else {
			bmr = 10 * weight + 6.25 * height - 5 * age - 161;
			System.out.println("Your BMR is : " + bmr + " calories");
		}
		findDailyCaloricReqOrNot();
	}

	public void findDailyCaloricReqOrNot() {
		System.out.println();
		DailyCaloricReq dcr = new DailyCaloricReq();
		HealthCare hc = new HealthCare();
		System.out.println("What you want to do now");
		System.out.println("1.Find out your total daily caloric requirement");
		System.out.println("2.Go to homePage");
		int choice = 0;
		System.out.println("enter your choice 1 or 2");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("give appropriate input");
			sc.nextLine();
			findDailyCaloricReqOrNot();
		}

		if (choice == 1) {
			dcr.dailyCaloricReq(bmr);
		}

		else if (choice == 2) {
			hc.homePage();
		} else {
			System.out.println("choose appropriate option");
			findDailyCaloricReqOrNot();
		}
	}

}

class DailyCaloricReq {
	Scanner sc = new Scanner(System.in);

	public void dailyCaloricReq(Double bmr) {
		System.out.println();
		int activityDay = 0;
		System.out.println("Choose an option");
		System.out.println("1.You excercise rarely");
		System.out.println("2.You excercise on 1 to 3 days per week");
		System.out.println("3.You excercise on 3 to 5 days per week");
		System.out.println("4.You excercise on 6 to 7 days per week");
		System.out.println("5.You excercise on daily basis or You have physical job");
		System.out.println("enter appropriate option 1 or 2 or 3 or 4 or 5");
		try {
			activityDay = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("enter appropriate option");
			sc.nextLine();
			dailyCaloricReq(bmr);
		}

		if (activityDay == 1) {
			bmr *= 1.2;
			System.out.println("Your daily caloric requirement is " + bmr + " calories");
		}

		else if (activityDay == 2) {
			bmr *= 1.375;
			System.out.println("Your daily caloric requirement is " + bmr + " calories");
		}

		else if (activityDay == 3) {
			bmr *= 1.55;
			System.out.println("Your daily caloric requirement is " + bmr + " calories");
		}

		else if (activityDay == 4) {
			bmr *= 1.725;
			System.out.println("Your daily caloric requirement is " + bmr + " calories");
		}

		else if (activityDay == 5) {
			bmr *= 1.9;
			System.out.println("Your daily caloric requirement is " + bmr + " calories");
		}

		else {
			System.out.println("choose appropriate option");
			dailyCaloricReq(bmr);
		}

		System.out.println("Now you know that your body burn " + bmr + " calories"
				+ "in one day at your current level of activity, this is the number of calories it takes to stay at the weight you are if you don't change anything");
		looseGainNothing();
	}

	public void looseGainNothing() {
		System.out.println();
		WeightModification wm = new WeightModification();
		HealthCare hc = new HealthCare();
		System.out.println("What you want now");
		System.out.println("1.Wanna loose your weight");
		System.out.println("2.Wanna gain more weight");
		System.out.println("3.Go to HomePage");
		int selection = 0;
		System.out.println("Enter choice 1 or 2 or 3");
		try {
			selection = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("enter valid option");
			sc.nextLine();
			looseGainNothing();
		}

		if (selection == 1) {
			wm.looseWeight();
		}

		else if (selection == 2) {
			wm.gainWeight();
		}

		else if (selection == 3) {
			hc.homePage();
		}

		else {
			System.out.println("Select appropriate option");
			looseGainNothing();
		}
	}
}

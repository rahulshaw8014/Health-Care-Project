package tips.health;

import java.util.InputMismatchException;
import java.util.Scanner;

import care.health.HealthCare;

public class WeightModification {
	Scanner sc = new Scanner(System.in);
	HealthCare hc = new HealthCare();

	public void goToHome() {
		System.out.println();
		int choice = 0;
		System.out.println();
		System.out.println("press 1 if u want to go to HomePage");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("enter valid choice");
			sc.nextLine();
			goToHome();
		}
		if (choice == 1)
			hc.homePage();
	}

	public void looseWeight() {
		System.out.println();
		System.out.println(
				"As you know your BMR, you can determine how to reduce your caloric intake, and weight loss will naturally follow.");
		System.out.println("Applying Your BMR Calculation to Weight Loss\r\n" + "\r\n"
				+ "Once you know your BMR and the number of calories you burn for your activity level, you can improve your weight-loss efforts by setting a lower daily caloric-intake limit and crafting a plan for increasing your physical activity. Here’s how:\r\n"
				+ "\r\n"
				+ "Set your daily calorie limit. To lose weight, you need to reduce your caloric intake below your total daily calorie requirement indicated by your BMR + activity level. Putting yourself in a 500-calorie deficit every day should result in the loss of one pound every week, Greaves says.\r\n"
				+ "\r\n"
				+ "Adjust your exercise output. Calculators ask for your level of physical activity for a very good reason. You can influence your BMR through exercise, spurring your body to burn more calories even when you are just lounging about.\r\n"
				+ "\r\n"
				+ "Aerobic exercise provides a temporary boost to your BMR, an effect sometimes referred to as after-burn or excess post-exercise oxygen consumption, says Noelle Lusardi, a certified personal fitness trainer who also works at the Step Ahead Weight Loss Center in Bedminster, N.J. This boost drops dramatically following an aerobic workout, with your BMR returning back to its normal level within 15 minutes to 48 hours.\r\n"
				+ "Strength training provides a more lasting boost to BMR by altering your body's composition. Muscle at rest burns more calories than fat at rest. That's why men naturally enjoy a higher BMR than women, as they tend to have more muscle mass, Greaves explains.\r\n"
				+ "Increase the calorie deficit by adding more exercise. If you increase the amount of calories you burn off by 250 each day, you’ll lose a half-pound more on top of the calorie cuts made in your diet. You can also increase the intensity of your workouts to burn more calories, and you will increase your calorie deficit and aid your efforts at weight loss.");
		goToHome();

	}

	public void gainWeight() {
		System.out.println();
		System.out.println(
				"If you want to increase your weight then you have to eat more than 300 calories a day in addition to your daily calorie intake. ");
		goToHome();
	}

	public void tipsForUnderWeight() {
		System.out.println();
		System.out.println(
				"Eat regularly. Eating five or six meals smaller meals per day when you are underweight can be more manageable compared with the standard three. This is because you typically feel full faster than a person at a healthy weight.\r\n"
						+ "Don’t drink before meals. Fluids before meals can affect your appetite. Try limiting drinking until 30 minutes after you’ve eaten.\r\n"
						+ "Add nutritious drinks to your diet. Avoid soft drinks and caffeine-heavy coffee that adds little nutritional value to your diet. Try milk, fruit juices, healthy shakes and fruit smoothies instead. The will help increase the energy in your diet and also add important nutrients for your health too.\r\n"
						+ "Eat nutritious foods. When underweight, sticking to a healthy diet can help you safely gain weight. Choose fruits, vegetables, nuts, seeds, whole grain cereals, bread and pastas, lean meats and dairy products.\r\n"
						+ "Snack healthy. Snacking on avocados, nuts, cheese, peanut butter or dried fruits between mealtimes can be a good way to gain weight.\r\n"
						+ "Treat yourself. Even when underweight it’s fine to have an unhealthy treat every now and then. But be mindful of excess fat and sugar - try to keep most treats nutritious and healthy.\r\n"
						+ "Work out. Strength training (building muscle) can help you gain weight. Exercise may also help you get your appetite back.");
		goToHome();
	}

	public void tipsForOverWeightAndObese() {
		System.out.println();
		System.out.println(
				"Adopting a healthy diet will enable you to lower your BMI (Body Mass Index), as simply increasing your level of activity might not be enough to lose weight.\r\n"
						+ "\r\n" + "Calorie deficit\r\n"
						+ "Reducing how many calories you eat will assist in your weight loss, as the calories in foods people eat can quickly add up.\r\n"
						+ "\r\n"
						+ "Entering a calorie deficit, where you eat fewer calories than you burn in a day will prevent you consuming excess fat that serves to increase your BMI.\r\n"
						+ "\r\n"
						+ "Starting to cook for yourself more can help you monitor your food portions and subsequent calorie intake.\r\n"
						+ "\r\n"
						+ "Check food labels to be sure you are eating the smallest amount of saturated fat possible, and so you can avoid the fats that come from fried and baked foods.\r\n"
						+ "\r\n" + "Change your shopping list\r\n" + "Fruit and vegetables\r\n"
						+ "Adding five servings of fruit and vegetables a day can add nutrition to your diet, which will also serve to fill you up.\r\n"
						+ "\r\n"
						+ "Vegetables, especially, are packed with the nutrition our bodies need to feel satisfied and they’re generally low in calories.\r\n"
						+ "\r\n"
						+ "Using dressings, herbs and spices can make vegetables more appealing if they do not normally make your shopping list on a regular basis.\r\n"
						+ "\r\n" + "Whole grain replacements\r\n"
						+ "High sugar foods such as sweetened cereal, chocolate and pastries should be avoided, as well as sugary soda drinks.\r\n"
						+ "Replace starchy version of foods such as bread, flour and rice with whole grain foods. Whole grain foods are less heavily processed than their white counterparts and contain significantly more fibre and natural nutrition.\r\n"
						+ "\r\n" + "Attack snacks\r\n"
						+ "It can be quite tempting to buy snacks when shopping, but snacks such as crisps and chocolate can contain excess calories. Buy some chewing gum to replace these snacks when hunger strikes, while drinking a large glass of water can also fight off hunger pangs.\r\n"
						+ "\r\n" + "Change your diet\r\n" + "Ditch highly processed foods \r\n"
						+ "Processed food should be avoided as part of your diet, with a generally reliable rule being the more processed a choice of food is, the worse it is for your health. Very processed foods tend to include:\r\n"
						+ "\r\n" + "Highly refined carbohydrate - which sharply raise blood sugar levels\r\n"
						+ "Man made fats\r\n" + "Added glucose, sugar and salt\r\n" + "High levels of preservatives\r\n"
						+ "Very little fibre\r\n" + "Fibre intake\r\n"
						+ "Increasing your fibre intake will not only give you more energy, but it will also help you regulate your body’s systems.\r\n"
						+ "Your BMR (Basal Metabolic Rate), which is the number of calories required to keep your body functioning at rest, will increase following enhanced fibre. This can also speed up your weight loss in the process.\r\n"
						+ "\r\n"
						+ "Whole grain ingredients and products will also assist you in your fibre increase, while whole wheat flour and oatmeal are other good fibre sources.\r\n"
						+ "\r\n" + "Make use of protein\r\n"
						+ "Protein has a number of distinct benefits because it provides fewer calories per gram than carbohydrate or fat and keeps you feeling full for long periods of time.\r\n"
						+ "\r\n"
						+ "If you need to be strict on calorie content, opt for lean meat such as chicken breast and cuts of red meat with the fat trimmed off.\r\n"
						+ "\r\n"
						+ "Eggs are a strong and versatile choice and beans are lentils are a great choice, particularly for people following vegetarian or vegan diets.\r\n"
						+ "\r\n" + "Lean meat\r\n"
						+ "Eating lean meat can assist with weight loss as it contains significantly more protein and has less fat and carbohydrate content.\r\n"
						+ "\r\n"
						+ "Chicken generally tends to be very lean, with the white of the meat containing less fat than the meat found on the thighs or wings.\r\n"
						+ "\r\n"
						+ "Red meats such as beef and pork are also beneficial, with the leanest cuts available containing more beneficial materials such as vitamin B, iron and zinc.");
		goToHome();
	}
}

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String userName = input.next();
		System.out.println("The name you entered is: " + userName);
		
		System.out.println("Enter Date of Birth: (mm/dd/yyyy) ");
		String dob = input.next();
		System.out.println("The Date of Birth you entered is: " +dob);
		
		System.out.println("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in feet: ");
		int feet = input.nextInt();
		
		System.out.println("Enter inches: ");
		int inches = input.nextInt();
		
		double weightInKilos = weight * 0.453592;
		double heightInMeters = ((feet * 12) + inches) * 0.0254;
		double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
		
		System.out.println("Your BMI is: " + bmi);
		
		
		if (bmi<18.5) {
			System.out.println(userName + ", Your BMI is considered Underweight.");
		}
		
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println(userName + ", Your BMI is considered Normal.");
		}
		
		else if (bmi >= 25 && bmi < 30) {
			System.out.println(userName + ", Your BMI is considered Overweight.");
		}
		
		else {
			System.out.println(userName + ", Your BMI is considered Obese.");
		}
		
		input.close();
	}

}

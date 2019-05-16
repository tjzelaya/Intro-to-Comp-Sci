import java.util.Scanner;

public class pythagorastheorus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your A value");
		double avalue = userInput.nextDouble();
		System.out.println("Please enter your B value");
		double bvalue = userInput.nextDouble();
		double cvalue = Math.sqrt(Math.pow(avalue,2) + (Math.pow(bvalue, 2)));
		System.out.println("Square root of " + avalue + " squared + " + bvalue + " squared = " + cvalue);

	}

}

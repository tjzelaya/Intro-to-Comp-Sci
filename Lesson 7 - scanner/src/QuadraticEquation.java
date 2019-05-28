import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter the A value.");
		double avalue = userInput.nextDouble();
		System.out.println("Please enter the B value.");
		double bvalue = userInput.nextDouble();
		System.out.println("Please enter the C value.");
		double cvalue = userInput.nextDouble();
		double d = (-bvalue + Math.sqrt(Math.pow(bvalue,2) - 4*(avalue)*(cvalue)));
		double e = (d /2*(avalue));
		System.out.println("Plus = " + e);
		double f = (-bvalue - Math.sqrt(Math.pow(bvalue,2) - 4*(avalue)*(cvalue)));
		double g = (f/2*(avalue));
		System.out.println("Minus = " + g); 
		
		Scanner userInput2 = new Scanner (System.in);
		System.out.println("Please enter a sentence.");
		String x = userInput2.nextLine();
		System.out.println("What letter shall I find?");
		String c = userInput2.nextLine();
		System.out.println("Your letter occurs at index " + x.indexOf(c));
		
		
		
		

	}

}

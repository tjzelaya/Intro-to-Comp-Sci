import java.util.Scanner;


public class ScanMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan;
		inputScan = new Scanner(System.in);
		System.out.println("what is your age?");
		int age = inputScan.nextInt();
		System.out.println("You are " + age + " years old!");
		System.out.println("Next year you will be " + age++ + " years old");
		inputScan.close();
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scanNum = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("How old are you?");
	
		System.out.println(name + " is " + age + " years old!");

	}

}

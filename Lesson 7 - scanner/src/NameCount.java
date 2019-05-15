import java.util.Scanner;

public class NameCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String wname; int wname2; String wname3;
		System.out.println("Please enter your whole name.");
		wname = userInput.nextLine();
		System.out.println("Your name has " + wname.length() + " characters in it, how many would you like me to print?");
		wname2 = userInput.nextInt();
		wname3 = (wname.substring(0,wname2));
		System.out.println(wname3);
		
		

	}

}

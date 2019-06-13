import java.util.Scanner;
public class ifstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter a number.");
		int a = Num.nextInt();
		System.out.println("Enter another number.");
		int b = Num.nextInt();
		if (a>=2*b) {
		System.out.println("Your face smells like peppermint!");
		}else{
		if (a==b/2) {
		System.out.println("That's so fetch.");
		}
		}

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a word.");
		String s1 = userInput.nextLine();
		System.out.println("Enter another word.");
		String s2 = userInput.nextLine();
		if (s1.equals(s2)) {
		System.out.println("Equal - case sensitive");
		}else if ((s1.equalsIgnoreCase(s2))) {
		System.out.println("Equal - not case sensitive.");
		}

		Scanner Cool = new Scanner(System.in);
		System.out.println("Enter a number.");
		int x = Cool.nextInt()%5;
		if (x==0) {
		System.out.println("\"The dude abides\"");
		}else if (x==1) {
		System.out.println("\"The road to success is always under construction\"");
		}else if (x==2) {
		System.out.println("\"Has Anyone Really Been Far Even as Decided to Use Even Go Want to do Look More Like?");
		}else if (x==3) {
		System.out.println("\"I can lick my elbows");
		}else if (x==4) {
		System.out.println("\"Shrek is love, Shrek is life\"");
		}

		Scanner Words = new Scanner(System.in);
		System.out.println("Enter a word.");
		String q1 = Words.nextLine();
		if (q1.equals("yes")) {
		System.out.println("Of course");
		}else if (q1.equals("no")) {
		System.out.println("indubitably");
		}else{
		System.out.println("hhhhhwwwhhaatttt?!?!");
		}
		



	}

}

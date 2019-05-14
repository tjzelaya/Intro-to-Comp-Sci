import java.util.Scanner;

public class averageprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputScan;
		inputScan = new Scanner(System.in);
		int t1; int t3; int t2;
		System.out.println("Test 1 grade?");
		t1 = inputScan.nextInt();
		System.out.println("Test 3 grade?");
		t3 = inputScan.nextInt();
		System.out.println("Test 2 grade?");
		t2 = inputScan.nextInt();
		System.out.println("Test1 grade : " + t1);
		System.out.println("Test2 grade : " + t2);
		System.out.println("Test3 grade : " + t3);
		double average = ((t1 + t2 + t3)/3.0);
		System.out.println("average : " + average);
		
		

	}

}

import java.util.Scanner;

public class chapter7back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan;
		inputScan = new Scanner(System.in);
		double radius;
		radius = inputScan.nextDouble();
		System.out.println("A = " + (Math.PI)*(Math.pow(radius,2)));
		
		double area;
		area = inputScan.nextDouble();
		radius = Math.sqrt((area/(Math.PI)));
		System.out.println("Radius = " + radius);

	}

}

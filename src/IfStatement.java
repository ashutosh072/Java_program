import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

//		System.out.println("enter you hight");
//		Scanner scan = new Scanner(System.in);
//		int height =scan.nextInt();
//		if (height<170&& height>50) {
//			System.out.println("Congratulation!you are  shortlisted ");
//		}
//		else if (height>200) {
//			System.out.println("you are too long ");
//		}
//		else if (height<50) {
//		System.out.println("you are too short ");
//		}
//		else {
//			System.out.println("sorry! you are not shortlisted ");
//		}
//
		
		
		
		Scanner scan1 = new  Scanner(System.in);
		System.out.println("enter your bike name = ");
		String bike = scan1.next();
		
		if (bike == "splender") {
			System.out.println("milage should be 60 to 80");
		
		}
		else if (bike.equalsIgnoreCase("pulser")) {
			System.out.println("milage should be 40 -45");
			
		}
		else if (bike.equalsIgnoreCase("harley")) {
			System.out.println("milage  should be 25 to 20");
		}
		
		else {
			System.out.println("no any bike found ");
		}
	}
		
		

}

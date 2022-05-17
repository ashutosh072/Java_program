import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

		System.out.println("enter you hight");
		Scanner scan = new Scanner(System.in);
		int height =scan.nextInt();
		if (height<170&& height>50) {
			System.out.println("Congratulation!you are  shortlisted ");
		}
		else if (height>200) {
			System.out.println("you are too long ");
		}
		else if (height<50) {
		System.out.println("you are too short ");
		}
		else {
			System.out.println("sorry! you are not shortlisted ");
		}

	}

}

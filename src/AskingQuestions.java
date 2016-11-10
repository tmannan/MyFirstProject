import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		System.out.println("asking questions class");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1st temperature");
		num1 = keyboard.nextInt();
		
		System.out.println("Enter 2st temperature");
		num2 = keyboard.nextInt();
		
		System.out.println("The MAX temerature entered is " + Math.max(num1, num2));
		System.out.println("The MIN temerature entered is " + Math.min(num1, num2));
		System.out.println("The AVG temerature entered is " + (num1 + num2)/2);
		System.out.println("You are done\n");
	}

}

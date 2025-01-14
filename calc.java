import java.util.Scanner;

public class javaCalc {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = reader.nextInt();

		System.out.println("\nOperation: ");
		char op = reader.next().charAt(0);

		System.out.println("\nEnter the second number: ");
		int num2 = reader.nextInt();

		reader.close();

		int result = 0;

		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else {
			System.out.println("You entered an incorrect operation. Bailing out...");
			System.exit(0);
		}

		System.out.println("\nResult: " + result);
		return;

	}
}

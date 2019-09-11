import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println("Hello, this is a calculator. We will do the selected operation on the two numbers");

		// Scanner Created to get Input from user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an Operation (add,sub,mul(Default),div): ");
		String operation = scanner.nextLine();

		System.out.print("Enter the first Number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second Number: ");
		double num2 = scanner.nextDouble();

		scanner.close();

		// Declare the Operation Interface
		Operation op;

		// Depending on the users selected Operation, assign the Specific Operation
		switch (operation) {
		case "mul":
			op = new MultiplyOperation();
			break;
		//TODO Add other Operations here
		// Follow style of MultiplyOperation.java
		case "div":
			op = new DivisionOperation();
			break;
		default:
			op = new MultiplyOperation();
		}

		double answer = op.compute(num1, num2);

		System.out.println("Calculator has decided the answer is: " + answer);
	}
}

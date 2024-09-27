import java.util.Scanner;

class SumOfTwoNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number");
		int numOne = scanner.nextInt();

		System.out.print("Enter the second number");
		int numTwo = scanner.nextInt();

		int sum = numOne + numTwo;

		System.out.println(sum);
	}
}
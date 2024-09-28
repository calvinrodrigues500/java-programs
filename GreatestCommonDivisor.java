import java.util.Scanner;

class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		int numOne = scanner.nextInt();

		System.out.println("Enter second number");
		int numTwo = scanner.nextInt();

		int a = numOne;
		int b = numTwo;

		while (numTwo != 0) {
			int temp = numTwo;
			numTwo = numOne % temp;
			numOne = temp;
		}

		System.out.println(numOne);
	}
}
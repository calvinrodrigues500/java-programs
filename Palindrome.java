import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = scanner.nextInt();

		int originalNum = num;
		int reverse = 0;

		while (num != 0) {

			int last = num % 10;
			reverse = reverse * 10 + last;

			num /= 10;
		}

		if (reverse == originalNum) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindrome");
		}
	}
}
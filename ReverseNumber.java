import java.util.Scanner;

class ReverseNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int reverse = 0;

		while (num != 0) {

			int last = num % 10;

			reverse = reverse * 10 + last;

			num = num / 10;
		}
		
		System.out.println(reverse );
	}
}
import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number ");
		int num = scanner.nextInt();

		if (num <= 1) {
			System.out.println("Given number is a prime number");
		} else {

			boolean isPrime = true;
			
			for (int i = 2; i * i < num; i++) {
	
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println("Given number is a prime number");
			} else {
				System.out.println("Given number is not a prime number");
			}
		}
	}
}
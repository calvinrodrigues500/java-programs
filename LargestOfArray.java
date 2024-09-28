import java.util.Scanner;
import java.util.Arrays;

class LargestOfArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");

		int n = scanner.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++ ) {
			System.out.println("Enter the array element");
			nums[i] = scanner.nextInt();
		}

		int largest = nums[0];

		for (int i = 1; i < n; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}

		System.out.println("Largest element is " + largest);
	}
}
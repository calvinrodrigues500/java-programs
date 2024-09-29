import java.util.Scanner;
import java.util.Arrays;

class InsertAtPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = sc.nextInt();

		int[] arr = new int[n+1];

		for ( int i = 0; i < n; i++) {
			System.out.println("Enter the array element");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to insert");
		int num = sc.nextInt();

		System.out.println("Enter the position to insert");
		int position = sc.nextInt();

		if (position >=0 && position <= n -1) {

			for (int i = n - 1; i >= position; i--) {
				arr[i+1] = arr[i];
			}

			arr[position] = num;

			System.out.println("Array after insert " + Arrays.toString(arr));

		} else {
			System.out.println("Position is out of bound");
		}

	}
}
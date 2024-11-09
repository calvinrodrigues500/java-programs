import java.util.Scanner;
import java.util.Arrays;

class DeleteAtPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = {10, 15, 4, 2, 22, 40};

		System.out.println("Enter the element position to delete");
		int position = sc.nextInt();	

		System.out.println("Array before deletion: " + Arrays.toString(arr));

		if (position > (arr.length - 1)) {
			System.out.println("Given position is out of bound");
		} else {

			for (int i = position; i < arr.length -1; i++) {
				System.out.println(arr[i]);
				arr[i] = arr[i+1];
			}

			// Replacing empty array space with zero.
			arr[arr.length - 1] = 0;

			System.out.println("Array after deletion: " + Arrays.toString(arr));
		}

	}
}
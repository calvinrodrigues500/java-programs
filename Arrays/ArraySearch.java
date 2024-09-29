import java.util.Scanner;

class ArraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i ++) {
			System.out.println("Enter the array element");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search");
		int element = sc.nextInt();

		int index = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position: " + index);
		}
	}
}
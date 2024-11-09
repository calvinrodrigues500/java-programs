import java.util.Scanner;
import java.util.Arrays;

class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");

		String a = sc.nextLine();

		System.out.println("Enter another string");
		String b = sc.nextLine();

		int lenA = a.length();
		int lenB = b.length();

		if (lenA != lenB) {
			System.out.println("Given strings are not anagrams");
			return;
		}

		System.out.println("out " + Arrays.toString(buiildFrequencyMap(a, lenA)));
	}

	static int[] buiildFrequencyMap(String str, int length) {

		int[] freq = new int[26];

		for (int i = 0; i < length; i++) {
			freq[str.charAt(i) - 'a']++;
		}

		return freq;
	}
}
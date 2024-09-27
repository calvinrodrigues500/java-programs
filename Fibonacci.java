class Fibonacci {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int len = 10;

		System.out.print(a + ", " + b);

		for(int i = 2; i < len; i++) {
			int fib = a + b;
			System.out.print(", " + fib);
			a = b;
			b = fib;
		}

	}
}
class Car {
	String make;
	String model;
	private int year;

	int getYear() {
		return this.year;
	}

	void setYear(int year) {
		if (year >= 1990 ) {
			this.year = year;
		}
	}

	void displayInfo() {
		System.out.println("The car is of " + make + " make.\nModel: " + model + "\nYear: "+ year);
	}

	boolean isNew() {
		return year > 2020;	
	}

	void honk() {
		System.out.println("Beep");
	}
}
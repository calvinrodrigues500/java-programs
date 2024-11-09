class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.make = "BMW";
		car.model = "X1";
		car.setYear(2021);
		car.displayInfo();
		System.out.println("Is the car new ? " + car.isNew());
		car.honk();

		ElectricCar eCar = new ElectricCar();
		eCar.make = "Vega";
		eCar.model = "P22";
		eCar.setYear(1980);
		eCar.displayInfo();
		System.out.println("Is the eCar new ? " + eCar.isNew());
		eCar.honk();
	}
}
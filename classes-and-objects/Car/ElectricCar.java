class ElectricCar extends Car {
	int batteryCapacity;

	void displayBatteryCapacity() {
		System.out.println("Battery capacity is: " + this.batteryCapacity);
	}

	void honk() {
		System.out.println("Electric beep");
	}
}
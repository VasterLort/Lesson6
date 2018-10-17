package by.it_academy.cars;

import by.it_academy.detail.Engine;
import by.it_academy.types_transports.Car;

public class PassengerCar extends Car{
	private int amountPassenger;
	
	public PassengerCar(String model, String marka, int cost, int maxSpeed, int size, int run, Engine engine, int amountPassenger) {
		super(model, marka, cost, maxSpeed, size, run, engine);
		this.amountPassenger = amountPassenger;
	}

	public int getAmountPassenger() {
		return amountPassenger;
	}

	public void setAmountPassenger(int amountPassenger) {
		this.amountPassenger = amountPassenger;
	}
	
	public void display() {
		super.display();
		System.out.println("Количество пассажиров: " + getAmountPassenger());
		System.out.println();
	}
	
}

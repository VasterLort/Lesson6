package by.it_academy.airplane;

import by.it_academy.detail.Engine;
import by.it_academy.types_transports.Airplane;

public class PassengerAirplane extends Airplane {
	private int amountPassenger;
	
	public PassengerAirplane(String model, String marka, int cost, int maxSpeed, int size, int capacity, int wingLength,
			boolean canSwimm, int amountPassenger) {
		super(model, marka, cost, maxSpeed, size, capacity, wingLength, canSwimm);
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

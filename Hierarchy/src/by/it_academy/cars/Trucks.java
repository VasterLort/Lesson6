package by.it_academy.cars;

import by.it_academy.detail.Engine;
import by.it_academy.types_transports.Car;

public class Trucks extends Car{
	private int amountÑargo;

	public Trucks(String model, String marka, int cost, int maxSpeed, int size, int run, Engine engine, int amountÑargo) {
		super(model, marka, cost, maxSpeed, size, run, engine);
		this.amountÑargo = amountÑargo;
	}

	public int getAmountÑargo() {
		return amountÑargo;
	}
	public void setAmountÑargo(int amountÑargo) {
		this.amountÑargo = amountÑargo;
	}
	
	public void display() {
		super.display();
		System.out.println("Êîëè÷åñòâî ïåğåâîçèìîãî ãğóçà (êã): " + getAmountÑargo());
		System.out.println();
	}
	
}

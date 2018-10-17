package by.it_academy.cars;

import by.it_academy.detail.Engine;
import by.it_academy.types_transports.Car;

public class Trucks extends Car{
	private int amount�argo;

	public Trucks(String model, String marka, int cost, int maxSpeed, int size, int run, Engine engine, int amount�argo) {
		super(model, marka, cost, maxSpeed, size, run, engine);
		this.amount�argo = amount�argo;
	}

	public int getAmount�argo() {
		return amount�argo;
	}
	public void setAmount�argo(int amount�argo) {
		this.amount�argo = amount�argo;
	}
	
	public void display() {
		super.display();
		System.out.println("���������� ������������ ����� (��): " + getAmount�argo());
		System.out.println();
	}
	
}

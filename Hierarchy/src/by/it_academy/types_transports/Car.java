package by.it_academy.types_transports;

import by.it_academy.detail.Engine;
import by.it_academy.transports.Transport;

public abstract class Car extends Transport {
	private int run;
	private Engine engine;
	
	public Car(String model, String marka, int cost, int maxSpeed, int size, int run, Engine engine) {
		super(model, marka, cost, maxSpeed, size);
		this.run = run;
		this.engine = engine;
		
	}
	
	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void display() {
		super.display();
		System.out.println("Пробег авто (км): " + getRun());
		System.out.println("Двигатель авто: " + engine);
	}

}

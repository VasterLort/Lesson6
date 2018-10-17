package by.it_academy.types_transports;

import by.it_academy.transports.Transport;

public abstract class Airplane extends Transport {
	private int capacity;
	private int wingLength;
	private boolean canSwimm;
	
	public Airplane(String model, String marka, int cost, int maxSpeed, int size, int capacity, 
			int wingLength, boolean canSwimm) {
		super(model, marka, cost, maxSpeed, size);
		this.capacity = capacity;
		this.wingLength = wingLength;
		this.canSwimm = canSwimm;
				
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getWingLength() {
		return wingLength;
	}

	public void setWingLength(int wingLength) {
		this.wingLength = wingLength;
	}

	public boolean isCanSwimm() {
		return canSwimm;
	}

	public void setCanSwimm(boolean canSwimm) {
		this.canSwimm = canSwimm;
	}
	

	public void display() {
		super.display();
		System.out.println("Мощность двигателя (ватт): " + getCapacity());
		System.out.println("Длина крыльев (км): " + getWingLength());
		System.out.println("Имеет возможность плавать: " + isCanSwimm());
	}
}

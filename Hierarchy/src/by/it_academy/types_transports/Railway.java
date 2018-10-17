package by.it_academy.types_transports;

import by.it_academy.transports.Transport;

public abstract class Railway extends Transport {
	private int amountCarriage;
	private int amountSitPlace;
	
	public Railway(String model, String marka, int cost, int maxSpeed, int size, int amountCarriage, 
			int amountSitPlace) {
		super(model, marka, cost, maxSpeed, size);
		this.amountCarriage = amountCarriage;
		this.amountSitPlace = amountSitPlace;
	}

	public int getAmountCarriage() {
		return amountCarriage;
	}

	public void setAmountCarriage(int amountCarriage) {
		this.amountCarriage = amountCarriage;
	}

	public int getAmountSitPlace() {
		return amountSitPlace;
	}

	public void setAmountSitPlace(int amountSitPlace) {
		this.amountSitPlace = amountSitPlace;
	}
	
	public void display() {
		super.display();
		System.out.println("Количество вагонов: " + getAmountCarriage());
		System.out.println("Количество сидячих мест: " + getAmountSitPlace());
	}
	
	public abstract void subway();
}

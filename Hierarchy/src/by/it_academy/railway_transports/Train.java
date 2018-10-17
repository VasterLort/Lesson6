package by.it_academy.railway_transports;

import by.it_academy.types_transports.Railway;

public class Train extends Railway {
	public Train(String model, String marka, int cost, int maxSpeed, int size, int amountCarriage, int amountSitPlace) {
		super(model, marka, cost, maxSpeed, size, amountCarriage, amountSitPlace);
	}

	@Override
	public void subway()  {
		System.out.println("Поезд не может ездить в метро");
		System.out.println();
	}
}

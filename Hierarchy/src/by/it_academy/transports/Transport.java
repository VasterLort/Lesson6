package by.it_academy.transports;

public abstract class Transport {
	private String model;
	private String marka;
	private int cost;
	private int maxSpeed;
	private int size;
	
	public Transport(String model, String marka, int cost, int maxSpeed, int size) {
		this.model = model;
		this.marka = marka;
		this.cost = cost;
		this.maxSpeed = maxSpeed;
		this.size = size;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display() {
		System.out.println("Марка транспорта: " + getMarka());
		System.out.println("Модель транспорта: " + getModel());
		System.out.println("Размер транспорта (кг): " + getSize());
		System.out.println("Максимальная скорость транспорта (км/ч): " + getMaxSpeed());
		System.out.println("Цена транспорта ($): " + getCost());
	}
}

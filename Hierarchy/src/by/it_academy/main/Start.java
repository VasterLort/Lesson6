package by.it_academy.main;

import by.it_academy.airplane.PassengerAirplane;
import by.it_academy.cars.PassengerCar;
import by.it_academy.cars.Trucks;
import by.it_academy.detail.Engine;
import by.it_academy.railway_transports.Train;
import by.it_academy.railway_transports.Underground;

public class Start {

	public static void main(String[] args) {
		System.out.println("�����");
		Train tr = new Train("260", "������-�����", 50000, 200, 10000, 10, 30);
		tr.display();
		tr.subway();
		
		System.out.println("�����");
		Underground un = new Underground("13-401�1", "������������", 30000, 150, 5000, 8, 24);
		un.display();
		un.subway();
		
		System.out.println("��������");
		Engine engine = null;
		Trucks truc = new Trucks("��� 56", "�����", 7000, 250, 5000, 20000, engine.Diesel, 2000);
		truc.display();
		
		System.out.println("�������� ������");
		PassengerCar pc = new PassengerCar("Mustang", "Ford", 2000, 300, 20000, 20000, engine.Diesel, 6);
		pc.display();
		
		System.out.println("������������ �������");
		PassengerAirplane pa = new PassengerAirplane("Adam M-309", "CarbonAero", 30000, 500, 30000, 200, 1, true, 2000);
		pa.display();
	}

}

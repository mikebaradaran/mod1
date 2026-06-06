package exercise6;


import java.util.*;

public class RaceCars {
	private static final String ArrayList = null;

	public static void main(String[] args) throws Exception {
		
		try {
			for (int i = 1; i <= 14; i++)
				cars.add(new Vehicle("model" + i));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		for(var car : cars) {
			System.out.println(car.model + ", reg:" + car.registratioPlate.number);
		}
		
	}
}

class Vehicle {
	int speed;
	String model;
	RegistrationPlate registratioPlate;

	public Vehicle(String model) throws Exception {
		this.model = model;
		registratioPlate = RegistrationPlateFactory.getNextRegistrationPlate();
	}
}

class RegistrationPlate {
	String number;

	public RegistrationPlate(String no) {
		this.number = no;
	}
}

class RegistrationPlateFactory {
	private static int count = 0;

	private static String[] regPlates = { "MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007" };

	private RegistrationPlateFactory() {
	}

	public static RegistrationPlate getNextRegistrationPlate() throws Exception {
		if (count < regPlates.length)
			return new RegistrationPlate(regPlates[count++]);

		throw new Exception("No more registration plate numbers!");
	}
}

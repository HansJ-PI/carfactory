package nl.programit;

public class Main {

	public static void main(String[] args) {
		 Car c = CarFactory.getInstance("Peugeot");
		 c.drive();
	}

}

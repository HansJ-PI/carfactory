package nl.programit;

public final class CarFactory {

	public static Car getInstance(String type) {
		Car auto;
		switch (type) {
		case "Kia":
			auto = new Kia();
			break;

		case "Peugeot":
			auto = new Peugeot();
			break;

		case "Wartburg":
		default:
			auto = new Wartburg();

		}
		return auto;
	}
}

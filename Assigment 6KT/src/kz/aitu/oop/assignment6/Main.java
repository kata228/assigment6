package kz.aitu.oop.assignment6;

public class Main {

	public static void main(String[] args) {
		Logistics example = createLogistics("Plane");
		Transport transport = example.createTransport();
		example.planDelivery();
		transport.deliver();
	}
	public static Logistics createLogistics(String transport){
		if (transport.equals("Truck")) {
			return new RoadLogistics();
		}
		if (transport.equals("Ship")) {
			return new Sealogistics();
		}
		if (transport.equals("Plane")) {
			return new Airlogistics();
		}
		else
			return null;
		
	};

}

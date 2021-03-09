package kz.aitu.oop.assignment6;

public class RoadLogistics extends Logistics {
	public Transport createTransport() {
		return new Truck();
		};
	public void planDelivery () {
		System.out.println("in this case the best way is delivery by truck, cause it is on one continent");
		};
}

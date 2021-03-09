package kz.aitu.oop.assignment6;

public class Airlogistics extends Logistics {
	public Transport createTransport() {
		return new Plane();
		};
	public void planDelivery () {
		System.out.println("Air delivery is the best way for this case, because it should be delivereved faster");
		};
}

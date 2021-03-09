package kz.aitu.oop.assignment6;

public class Sealogistics extends Logistics {
	public Transport createTransport() {
		return new Ship();
		};
	public void planDelivery () {
		System.out.println("The delivery address is remote and fenced off by the sea. I choose sea delivery");
		};
}

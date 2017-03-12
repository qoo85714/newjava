package tw.org.iii;

public class Jason031207 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		//b1.speed = 10;
		System.out.println(b1.getSpeed());

	}

}

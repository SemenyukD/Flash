
public class JamsBondCar extends Car {

	public int drive (int howlong) {
	int distance = 0;
	distance = howlong*180;
	System.out.println ("Рухаюсь на протязі " + howlong + " год");
	System.out.println ("Я на відстані " + distance + " км");
	return distance;
	}
	public void stop () {
		System.out.println ("Середня швидкість руху складала 180 км/год");
		System.out.println ("Стоп авто");
	}
		
}

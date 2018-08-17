
public class Car {

		public void start () {
		System.out.println("Старт шляху");
	}
	
	public void stop (){
		System.out.println ("Середня швидкість руху складала 60 км/год");
		System.out.println ("Стоп авто");
	}
		public int drive (int howlong) {
		int distance = 0;
		distance = howlong*60;
		System.out.println ("Рухаюсь на протязі " + howlong + " год");
		System.out.println ("Я на відстані " + distance + " км");
		return distance;
	}
}


public class Car {

		public void start () {
		System.out.println("����� �����");
	}
	
	public void stop (){
		System.out.println ("������� �������� ���� �������� 60 ��/���");
		System.out.println ("���� ����");
	}
		public int drive (int howlong) {
		int distance = 0;
		distance = howlong*60;
		System.out.println ("������� �� ������ " + howlong + " ���");
		System.out.println ("� �� ������ " + distance + " ��");
		return distance;
	}
}


public class JamsBondCar extends Car {

	public int drive (int howlong) {
	int distance = 0;
	distance = howlong*180;
	System.out.println ("������� �� ������ " + howlong + " ���");
	System.out.println ("� �� ������ " + distance + " ��");
	return distance;
	}
	public void stop () {
		System.out.println ("������� �������� ���� �������� 180 ��/���");
		System.out.println ("���� ����");
	}
		
}

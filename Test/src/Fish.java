
public class Fish extends Pet {

	int currentDepth; // ������� ������ (member variable) int currentDepth=0
public int dive (int HowDeep){
	currentDepth=currentDepth + HowDeep;
	System.out.println("����� �� ������� " + HowDeep + " �������");
	if (currentDepth>100) {
		System.out.println("� ��������� ����� � �� ���� ������� ������ 100 �");
		//currentDepth = currentDepth - HowDeep; ?????????
	} else {
	//System.out.println("����� �� ������� " + HowDeep + " �������");
	System.out.println("� �� ������� " + currentDepth + " ����� ���� ������ ����");
	}
	return currentDepth;
}

public String say(String something) {
	//String fishresponse = something + "����� �� ��������";
	//return fishresponse;
	return something + "����� �� ��������";
	}

}

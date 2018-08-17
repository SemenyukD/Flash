
public class Fish extends Pet {

	int currentDepth; // атрибут класса (member variable) int currentDepth=0
public int dive (int HowDeep){
	currentDepth=currentDepth + HowDeep;
	System.out.println("Ќыр€ю на глубину " + HowDeep + " футовов");
	if (currentDepth>100) {
		System.out.println("я маленька€ рыбка и не могу плавать глубже 100 м");
		//currentDepth = currentDepth - HowDeep; ?????????
	} else {
	//System.out.println("Ќыр€ю на глубину " + HowDeep + " футовов");
	System.out.println("я на глубине " + currentDepth + " футов ниже уровн€ мор€");
	}
	return currentDepth;
}

public String say(String something) {
	//String fishresponse = something + "–ибка не говорить";
	//return fishresponse;
	return something + "–ибка не говорить";
	}

}

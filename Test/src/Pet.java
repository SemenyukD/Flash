
public class Pet {
	int age;
	
	int price;
	float weight;
	float height;
	String color;

public void sleep () {
	System.out.println ("Спокойной ночи! До завтра");
}

public void eat () {
	System.out.println ("Я очень голоден, давай перекусим чипсами?");
}

public String say (String aword) {
	//String petresponse = "Ну ладно! " + aword;
	//return petresponse;
	return "Ну ладно! " + aword;
}

}


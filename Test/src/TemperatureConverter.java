
public class TemperatureConverter {

	public static String convertTemp (float temperature, char convertTo) {
		//String result = null;
		float convertTemp = 0;
		//if (convertTo=='F') {
		//convertTemp = temperature*9/5+32;
	//}else if (convertTo=='C'){
		//convertTemp = (temperature-32)*5/9;
		switch (convertTo) {
	case 'F':
			convertTemp=temperature*9/5+32;
				break;
	case 'C':
			convertTemp=(temperature-32)*5/9;
		break;
		}
	//result = "" + convertTemp;
	return "" + convertTemp;
}

	public static void main(String[] args) {
		
		String yourTemp = convertTemp(32, 'F');
				System.out.println("Ваша температура " + yourTemp);
	}
	
}

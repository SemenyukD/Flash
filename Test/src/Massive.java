
public class Massive {

	public static void main(String[] args) {
		
		// String players [];
		//String [] players = new String [4];
		//players[0] = "David"; 
		//players[1] = "Daniel"; 
		//players[2] = "Anna"; 
		//players[3] = "Gregory";
		
		String [] players = {"David", "Daniel", "Anna", "Gregory"};
			
			//String Thewinner = players [1];
			//System.out.println("Поздровляем победителя " + Thewinner);
		
		int totalplayers = players.length;
		//int counter;
		//for (counter = 0; counter < totalplayers; counter++){
		//String theplayers = players[counter];
		//System.out.println("Вітаємо переможця " + theplayers + "!");
		
		int counter = 0;
		while (counter<totalplayers) {
			// if (counter == 3) {
				//break;
		String theplayers = players[counter];
			counter++;
		if (theplayers.equals("Daniel")) {
			continue;
						
		}
		System.out.println("Вітаємо переможця " + theplayers + "!");
		//counter++;
		
	}
	
  }
	
}

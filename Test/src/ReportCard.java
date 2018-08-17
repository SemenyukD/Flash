
public class ReportCard {
	//char grade;
	public static void main (String [] args) {
		
		ReportCard2 rc = new ReportCard2 ();
		
		rc.Scan();
		rc.i = convertGrade (rc.i);
	}
	/** 
	 Ìåòîä ConvertGrades ïðèíèìàåò îäèí öåëüíî÷èñåëüííûé àãðóìåíò
	 - ðåçóëüòàò òåñòà è ðåçóëüòàò òåñòà è âîçâðàùàåò ñèìâîë A, B, C or D â
	 çàâèñèìîñòè îò ýòîãî àðãóìåíòà.
	 */
public static char convertGrade (int testResults) {
	
	char grade; // локальна змінна
	
	if (testResults>=90) {
	grade = 'A';
	//System.out.println("Ваша оцінка " + grade + "\n" + "Чудова оцінка!");
} else if (testResults>=80 && testResults<90) {
	grade = 'B';
	//System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");
} else if (testResults>=70 && testResults<80) {
	grade = 'C';
	//System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!"); 
} else {
	grade = '0';
}
	//if (Character.isLetter(grade));{
	
	switch (grade){     
	case 'A':  {      
	System.out.println("Ваша оцінка " + grade + "\n" + "Чудова робота!");        
	break;     
	}case 'B': {        
	System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");        
	}break;     
	case 'C': {       
	System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!");        
	}break; 
}
	return grade;
}
}

//public static void main (String [] args) {
	
	//ReportCard2 rc = new ReportCard2 ();
	
		//char yourGrade = rc.convertGrade (88);
		//System.out.println("Ваша перша оцінка" + yourGrade);
		
		//yourGrade = rc.convertGrade(79);
		//System.out.println("Ваша друга оцінка " + yourGrade);
		






public class ReportCard {

	public static void main(String[] args) {

		ReportCard2 rc = new ReportCard2();

		rc.scan();
		rc.i = convertGrade(rc.i);
	}

	/**
	 * Метод ConvertGrades принимает один цельночисельнный агрумент - результат
	 * теста и результат теста и возвращает символ A, B, C or D в зависимости от
	 * этого аргумента.
	 */
	public static char convertGrade(int testResults) {

		char grade;// локальна змінна

		if (testResults >= 90) {
			grade = 'A';
			//System.out.println("Ваша оцінка " + grade + "\n" + "Чудова оцінка!");
		} else if (testResults >= 80 && testResults < 90) {
			grade = 'B';
			//System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");
		} else if (testResults >= 70 && testResults < 80) {
			grade = 'C';
			//System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!");
		} else {
			grade = '0';
		}

		if (Character.isLetter(grade))
			;
		{

			switch (grade) {
			case 'A': {
				System.out.println("Ваша оцінка " + grade + "\n" + "Чудова робота!");
			}
				break;
			case 'B': {
				System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");
			}
				break;
			case 'C': {
				System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!");
			}
				break;
			}
			return grade;
		}
	}
}





//public static void main (String [] args) {

// ReportCard2 rc = new ReportCard2 ();

// char yourGrade = rc.convertGrade (88);
// System.out.println("Ваша перша оцінка" + yourGrade);

// yourGrade = rc.convertGrade(79);
// System.out.println("Ваша друга оцінка " + yourGrade);



//switch (grade) {

//case 0:
	//if (testResults >= 90) {
		//grade = 'A';
		//System.out.println("Ваша оцінка " + grade + "\n" + "Чудова робота!");
		//break;
	//} else if (testResults >= 80 && testResults < 90) {
		//grade = 'B';
		//System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");
		//break;
	//}else if (testResults >= 70 && testResults < 80) {
		//grade = 'C';
		//System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!");
		//break;
	//}
//case 1:
	//break;
//}
//return grade;
//}
//}

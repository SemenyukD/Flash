
public class ReportCard {
	//char grade;
	public static void main (String [] args) {
		
		ReportCard2 rc = new ReportCard2 ();
		
		rc.Scan();
		rc.i = convertGrade (rc.i);
	}
	/** 
	 ����� ConvertGrades ��������� ���� ���������������� ��������
	 - ��������� ����� � ��������� ����� � ���������� ������ A, B, C or D �
	 ����������� �� ����� ���������.
	 */
public static char convertGrade (int testResults) {
	
	char grade; // �������� �����
	
	if (testResults>=90) {
	grade = 'A';
	//System.out.println("���� ������ " + grade + "\n" + "������ ������!");
} else if (testResults>=80 && testResults<90) {
	grade = 'B';
	//System.out.println("���� ������ " + grade + "\n" + "������ ������!");
} else if (testResults>=70 && testResults<80) {
	grade = 'C';
	//System.out.println("���� ������ " + grade + "\n" + "������� ��������� ������!"); 
} else {
	grade = '0';
}
	//if (Character.isLetter(grade));{
	
	switch (grade){     
	case 'A':  {      
	System.out.println("���� ������ " + grade + "\n" + "������ ������!");        
	break;     
	}case 'B': {        
	System.out.println("���� ������ " + grade + "\n" + "������ ������!");        
	}break;     
	case 'C': {       
	System.out.println("���� ������ " + grade + "\n" + "������� ��������� ������!");        
	break; 
}
	}
	return grade;
}
}
//}

//public static void main (String [] args) {
	
	//ReportCard2 rc = new ReportCard2 ();
	
		//char yourGrade = rc.convertGrade (88);
		//System.out.println("���� ����� ������ " + yourGrade);
		
		//yourGrade = rc.convertGrade(79);
		//System.out.println("���� ����� ������ " + yourGrade);
		





import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class CalculatorEngine implements ActionListener {

	Calculator parent; // ����� �� ���� ������������
	
	char selectedAction = ' ' ; // +, -, /, �� *
	double currentResult = 0;
	
	//����������� ������ ������ �� ���� ������������
	//� ��������� ���������� �����
	
	CalculatorEngine (Calculator parent) {
		this.parent = parent;
}

	public void actionPerformed (ActionEvent e) {
		// �������� ������� 䳿
		
		JButton clickedButton = (JButton) e.getSource ();
		String dispFieldText=parent.displayField.getText();
		double displayValue = 0;
		
		 //�������� ����� �� ������� ������������,
		// ���� �� �� ������.
		// ���� ������  - �� �������� ������
		
		if (!"".equals(dispFieldText)) {
			
			//displayValue = Double.parseDouble(dispFieldText);
			displayValue= Double.valueOf(dispFieldText);
			
		}

		Object src = e.getSource ();
		/* ��� ����� ������ ���������� 䳿
		 * ���������� ����: +, -, /, �� *, �������� ���� �����
		 * � ������ currentResult, � �������� �������
		 * ��� ������ ������ �����
		 */
		
		if (src==parent.buttonPlus) {
			selectedAction = '+';
			currentResult=displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMinus) {
			selectedAction ='-';
			currentResult=displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonDivide) {
			selectedAction = '/';
			currentResult=displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMultiply) {
			selectedAction = '*';
			currentResult=displayValue;
			parent.displayField.setText("");
		} else if (src==parent.buttonEqual) {
			
	// �������� ����������� ��, � ��������� �� selectedAction,
	// �������� �������� currentResult � �������� ��������� �� ������
		
		if (selectedAction=='+') {
			currentResult+=displayValue;
	
	// ������������� ��������� � ������, ���������� ���� �� ����� ������
	// � �������� ����
			parent.displayField.setText("" + currentResult);
		
		}else if (selectedAction== '/') {
			if (displayValue==0)
			{
				JOptionPane.showConfirmDialog(null, "�� 0 ����� �� �����", "�������", JOptionPane.PLAIN_MESSAGE);
			}
			else {
			currentResult/=displayValue;
			parent.displayField.setText("" + currentResult);
			}
			}else if (selectedAction== '-') {
			currentResult-=displayValue;
			parent.displayField.setText("" + currentResult);
			}else if (selectedAction== '*') {
			currentResult*=displayValue;
			parent.displayField.setText("" + currentResult);
			
		}
		} else {
		
				// ��� ��� �������� ������ �������� ������ �� ������
		// �� ������� �� ������
		
		String clickedButtonLabel = clickedButton.getText ();
		if (dispFieldText.indexOf ('.')>0){
		parent.displayField.setText(dispFieldText+"");
		//JOptionPane.showConfirmDialog(null,"", "�������", JOptionPane.PLAIN_MESSAGE);
		}else {
				parent.displayField.setText(dispFieldText +	clickedButtonLabel) ;
			}
		}
	}
}
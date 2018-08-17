import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class CalculatorEngine implements ActionListener {

	Calculator parent; // Силка на вікно калькулятора
	
	char selectedAction = ' ' ; // +, -, /, чи *
	double currentResult = 0;
	
	//Конструктор зберігає ссилку на вікно калькулятора
	//в перемінній єкземпляра класа
	
	CalculatorEngine (Calculator parent) {
		this.parent = parent;
}

	public void actionPerformed (ActionEvent e) {
		// Отримати джерело дії
		
		JButton clickedButton = (JButton) e.getSource ();
		String dispFieldText=parent.displayField.getText();
		double displayValue = 0;
		
		 //Отримати число із дисплею калькулятора,
		// якщо він не пустий.
		// Знак оклику  - це оператор відмови
		
		if (!"".equals(dispFieldText)) {
			
			//displayValue = Double.parseDouble(dispFieldText);
			displayValue= Double.valueOf(dispFieldText);
			
		}

		Object src = e.getSource ();
		/* Для кожної кнопки арифметино дії
		 * запамятати його: +, -, /, чи *, зберегти дане число
		 * в змінній currentResult, і очистити дисплей
		 * для відводу нового числа
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
			
	// Здійснити арифметичну дію, в залежності від selectedAction,
	// обновити перемінну currentResult і показати результат на дисплеї
		
		if (selectedAction=='+') {
			currentResult+=displayValue;
	
	// Сконвертувати результат в строку, добавляючи його до пустої строки
	// і показати його
			parent.displayField.setText("" + currentResult);
		
		}else if (selectedAction== '/') {
			if (displayValue==0)
			{
				JOptionPane.showConfirmDialog(null, "На 0 ділити не можна", "Помилка", JOptionPane.PLAIN_MESSAGE);
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
		
				// Для всіх цифрових кнопок приєднати надпис на кнопці
		// до надпису на дисплеї
		
		String clickedButtonLabel = clickedButton.getText ();
		if (dispFieldText.indexOf ('.')>0){
		parent.displayField.setText(dispFieldText+"");
		//JOptionPane.showConfirmDialog(null,"", "Помилка", JOptionPane.PLAIN_MESSAGE);
		}else {
				parent.displayField.setText(dispFieldText +	clickedButtonLabel) ;
			}
		}
	}
}

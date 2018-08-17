import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.*;

public class Calculator {

	// Обявлення всіх компонентів калькулятора.
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMultiply;
	JButton buttonDivide;
	JPanel p1;
	JPanel p2;
	JButton numbutton [];
			//в конструкторі створюються всі компоненти
			//і добавляються на фрейм за допомогою комбінації
			//BorderLayout i GridLayout
	Calculator () {
		
		windowContent = new JPanel ();
		
		//Задаємо схему для цієї панелі
		BorderLayout bl = new BorderLayout ();
		windowContent.setLayout(bl);
		
		//Створюємо і відображаємо поле
		//Добавляємо його в Північну частину вікна
		
		displayField = new JTextField(30);
		
		//displayField = new JFormattedTextField ();
		//displayField.setHorizontalAlignment(JFormattedTextField.RIGHT);
	  //displayField.setHorizontalAlignment(SwingConstants.RIGHT); //можливий варіант
		windowContent.add("North", displayField);
		
		//Створюємо кнопки, використовуючи конструктор
		//каласа JButton, який приймає текст кнопки в якості параметру
		
		button0=new JButton ("0");
		button1=new JButton ("1");
		button2=new JButton ("2");
		button3=new JButton ("3");
		button4=new JButton ("4");
		button5=new JButton ("5");
		button6=new JButton ("6");
		button7=new JButton ("7");
		button8=new JButton ("8");
		button9=new JButton ("9");
		buttonPoint = new JButton (".");
		buttonEqual = new JButton ("=");
		buttonPlus = new JButton ("+");
		buttonMinus = new JButton ("-");
		buttonDivide = new JButton ("/");
		buttonMultiply = new JButton ("*");
		/** Створюємо панель с GridLayout, яка включає 12 кнопок - 10 кнопок
		 * з числами и кнопки з крапкою та знаком дорівнює 
		 */
		
		p1 = new JPanel ();
		GridLayout gl = new GridLayout (4,3);
		p1.setLayout(gl);
	/**	
		numbutton = new JButton [10];
		for(int i=0;i<10;i++) {
			numbutton [i] = new JButton ("" + i);
		
		// numbutton [i] = new JButton (String.valueOf(i));  // 
		p1.add(numbutton [i]);
	}
	*/
		// Добавляємо кнопки на панель p1
		
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		//Поміщаємо панель p1 в центральну область вікна
				windowContent.add("Center", p1);
		
		p2 = new JPanel ();
		GridLayout gl1 = new GridLayout (4,1);
		p2.setLayout(gl1);
		
		p2.add(buttonPlus);
		p2.add(buttonMinus);
		p2.add(buttonMultiply);
		p2.add(buttonDivide);
		
		windowContent.add("East", p2);
		
		//Створюємо фрейм і задаємо його в основну панель
				JFrame frame = new JFrame("Calculator");
				frame.setContentPane(windowContent);
				
		//робимо розмір вікна достатнім для того, щоб вмістити всі компоненти
				frame.pack();
		
		//Накінець, відображаємо вікно
				frame.setVisible(true);
	CalculatorEngine calcEngine = new CalculatorEngine(this);
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		buttonPlus.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonDivide.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		buttonMultiply.addActionListener(calcEngine);
		buttonPoint.addActionListener(calcEngine);
		
	}
	
	public static void main (String[] args) {
		Calculator calc = new Calculator ();
	}
}

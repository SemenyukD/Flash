import javax.swing.*;
import java.awt.GridLayout;
import java.awt.*;
//import java.awt.FlowLayout;
public class SimpleCalculator {
	public static void main (String [] args) {
		// Створюємо панель
	JPanel windowContent = new JPanel ();
	
	   // Задаєм менеджер відображення для цієї панелі
	//BorderLayout br = new BorderLayout ();
	//windowContent.setLayout (br);
	
	GridLayout gr = new GridLayout (4,2);
	windowContent.setLayout(gr);
	//FlowLayout fl = new FlowLayout ();
	//windowContent.setLayout (fl);
	
	//Створюємо компоненти в пам'яті
	JLabel label1 = new JLabel ("Number 1:");
	JTextField field1 = new JTextField (10);
	JLabel label2 = new JLabel ("Number 2:");
	JTextField field2 = new JTextField (10);
	JLabel label3 = new JLabel ("Sum:");
	JTextField result = new JTextField (10);
	JButton go = new JButton ("Add");
	
	//Добавляємо компоненти на панель
	windowContent.add(label1);
	windowContent.add(field1);
	windowContent.add(label2);
	windowContent.add(field2);
	windowContent.add(label3);
	windowContent.add(result);
	windowContent.add(go);
	
	//Створюємо фрейм і задаєм для нього панель
	JFrame frame = new JFrame("My Frist Calculator"); // Заговолок для калькулятора
	frame.setContentPane(windowContent);
	
	// Задаємо розмір і робимо фрейм видимим
	frame.setSize(400,100);
	frame.setVisible(true);	
	}
}

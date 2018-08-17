/**
 * Гра в хрестики-нулики на дошці 3х3
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.*;
import javax.swing.*;
public class TictTacToe extends Applet implements ActionListener {

	JButton squares [];
	JButton newGameButton;
	Label score, win1, lost1, tie1;
	int emptySquaresLeft=9;
	int win2, lost2;
	
/**
 * Метод int() - це конструктор апплета
 */

	public void init () {
		
		//Устанавливаем менеджер расположения апплетаб шрифт и цвет
		
	this.setLayout (new BorderLayout());
	this.setBackground(Color.CYAN);
	
		// Змінюємо шрифт апплету так, щоб він був жирним і мав розмір 20
	
	Font appletFont = new Font("Monospased", Font.BOLD, 20);
	this.setFont(appletFont);
	
	//Створюємо кнопку "New Game" і реєструємо в ній 'слухач дії'

	newGameButton=new JButton ("New Game");
	newGameButton.addActionListener(this);
	
	JPanel topPanel=new JPanel ();
	topPanel.add(newGameButton);
		this.add(topPanel,"North");
		
		JPanel centerPanel = new JPanel ();
		centerPanel.setLayout (new GridLayout (3,3));
		this.add(centerPanel, "Center");
		
		score=new Label ("Your turn!");
		this.add(score, "South");
		
		//Панель підрахунку перемог і поразок
		
		Panel winlost = new Panel();
		winlost.setLayout(new GridLayout (3,1));
		Font labelFont = new Font ("Monospaces", Font.BOLD, 13);
		winlost.setFont(labelFont);
		this.add(winlost, "North");
		win1 = new Label ("You win = " + win2);
		winlost.add(win1, "East");
		lost1 = new Label ("You lost = " +lost2);
		winlost.add(lost1, "North");
		winlost.add(newGameButton, "Center");
		
	// Створюєм массив, щоб берегти ссилки на 9 кнопок
		
		squares=new JButton [9];
		
	// Створюємо кнопки, зберігаємо ссилки на них в массиві
	// реєструємо в них слухача, фарбуємо їх в оранжевий колір і добавляємо на панель
		
		for (int i=0; i<9; i++) {
			
			squares [i] = new JButton();
			squares [i].addActionListener(this);
			squares [i].setBackground(Color.ORANGE);
			centerPanel.add(squares[i]);
		}
	}
	/**
	*Цей метод буде обробляти всі події
	*@param ActionEvent обєкт
	*/
	public void actionPerformed (ActionEvent e) {
		JButton theButton = (JButton) e.getSource();
		
		// Це кнопка New Game?

		if (theButton==newGameButton) {
			for (int i=0; i<9; i++) {
			
				squares [i].setEnabled (true);
				squares [i].setLabel("");
				squares [i].setBackground(Color.ORANGE);
			
			}
			
		emptySquaresLeft=9;
		score.setText("Your turn!");
		newGameButton.setEnabled (false);
		return;
	}
		
		String winner = "";
		
		//Це одна із клітинок?
		
		for (int i=0; i<9; i++) {
			if (theButton==squares[i]) {
			
				squares[i].setLabel("X");
				squares[i].setEnabled(false); // заборона на поставлення Х
				winner = lookForWinner();
				
				if (!"".equals(winner)) {
					endTheGame();
				
				}else {
					
					computerMove();
					winner = lookForWinner ();
					
					if (!"".equals(winner)) {
						endTheGame();
					}
				}	
					break;
			}
		} // кінець цикла for
		
		if (winner.equals("X")) {
			score.setText ("You won!");
			while (true) {			//рахуємо перемоги
				win2++;
				break;
			}
			win1.setText("You win = " + win2);
		} else if (winner.equals("O")) {
			score.setText("You lost!");
			while (true) {			//рахуємо невдачі
			lost2++;
			break;
			}
			lost1.setText("You lost =" + lost2);
		} else if (winner.equals("T")) {
			score.setText("It's a tie");
		}
	} // кінець методу actionPerformed
	
	/**
	 * Цей метод викликаться після кожного кроку, щоб дізнатись чи є переможець.
	 * Він провіряє кожен ряд, колонку і діагональ, щоб найти три клітинки з одинаковими надписами (не пустими)
	 * @return "X", "O", "T" - нічия, "" - ще не має переможця
	 */
	@SuppressWarnings("deprecation")
	String lookForWinner () {
		
		String theWinner = "";
		emptySquaresLeft--;
	
		if (emptySquaresLeft==0) {
			return "T"; // це нічия.
	}


		// Провіряємо ряд 1 - елементи массиву 0,1,2
	if (!squares[0].getLabel().equals("") && squares[0].getLabel().equals(squares[1].getLabel()) && squares[0].getLabel().equals(squares[2].getLabel())) {
	
		theWinner = squares[0].getLabel();
		highlightWinner(0,1,2);
	
		// Провіряємо ряд 2 - елементи массиву 3,4,5
	}else if (!squares[3].getLabel().equals("") && squares[3].getLabel().equals(squares[4].getLabel()) && squares[3].getLabel().equals(squares[5].getLabel())) {
		
		theWinner = squares[3].getLabel();
		highlightWinner(3,4,5);
		
		//Провіряємо ряд 3 - елементи массиву 6,7,8
	}else if (!squares[6].getLabel().equals("") && squares[6].getLabel().equals(squares[7].getLabel()) && squares[6].getLabel().equals(squares[8].getLabel())){
			
		theWinner = squares[6].getLabel();
		highlightWinner(6,7,8);
		
		//Провіряємо колонку 1 - елементи массиву 0,3,6
	}else if (!squares[0].getLabel().equals("") && squares[0].getLabel().equals(squares[3].getLabel()) && squares[0].getLabel().equals(squares[6].getLabel())){
	
		theWinner = squares[0].getLabel();
		highlightWinner(0,3,6);
		
		//Провірємо колонку 2 - елементи массиву 1,4,7
	}else if (!squares[1].getLabel().equals("") && squares[1].getLabel().equals(squares[4].getLabel()) && squares[1].getLabel().equals(squares[7].getLabel())){
		
		theWinner = squares[1].getLabel();
		highlightWinner(1,4,7);
	
		//Провіряємо колонку 3 - елементи массиву 2,5,8
	}else if (!squares[2].getLabel().equals("") && squares[2].getLabel().equals(squares[5].getLabel()) && squares[2].getLabel().equals(squares[8].getLabel())){
				
		theWinner = squares[2].getLabel();
		highlightWinner(2,5,8);
	
		//Провіряємо 1-шу діагональ - елементи массиву 0,4,8
				
	}else if (!squares[0].getLabel().equals("") && squares[0].getLabel().equals(squares[4].getLabel()) && squares[0].getLabel().equals(squares[8].getLabel())){
	
		theWinner = squares[0].getLabel();
		highlightWinner(0,4,8);
	
		//Провіряємо 2-гу діагональ - елементи 2,4,6
	}else if (!squares[2].getLabel().equals("") && squares[2].getLabel().equals(squares[4].getLabel()) && squares[2].getLabel().equals(squares[6].getLabel())) {
	
		theWinner = squares[2].getLabel();
		highlightWinner(2,4,6);
	
	}
	
		return theWinner;
	}
	
/**
 * Цей метод застосовує набір правил, щоб знайти кращий AI хід. Якщо хороший хід не знайдений, вибираємо випадкову клітинку.
 */
	
	void computerMove() {
		
		int selectedSquare;
		
		//З початку комп'ютер намагається знайти пусту клітинку рядом з двома клітинками з нуликом, щоб виграти
		
		selectedSquare = findEmptySquare ("O");
		
		//якщо selectedSquare все ще дорівнює -1, то намагається зайняти центральну клітинку
		if (selectedSquare == -1) {
			selectedSquare = findEmptySquare ("X");
		}
	
		//якщо selectedSquare все ще дорівнює -1, то намагається зайняти центральну клітинку
		if ((selectedSquare == -1) && (squares[4].getLabel().equals(""))) {
			selectedSquare = 4;
		}
		
		//не пощастило з центральною клітинкою...
		//просто займаємо випадкову клітинку
		
		if (selectedSquare == -1) {
			selectedSquare = getRandomSquare();
		}
			squares[selectedSquare].setLabel("O");
			squares[selectedSquare].setEnabled(false); //заборона на поставленні Х в клітинку О
	}
	
	/** Цей метод провіряє кожний рядок, колонку і діагональ щоб дізнатись
	 * чи є в ній дві клітинки з одинаковими надписаси і пустою клітинкою.
	 * @param передаэться Х - для користувача и О - для компа
	 * @return кількість вільних клітинок
	 * 		   чи -1, якщо не знайдено 2-ві клітинки з одинаковоими надписами
	 */
		
		int findEmptySquare (String player) {
			
			int weight [] = new int [9];
			
			for(int i = 0; i<9; i++) {
				
				if (squares[i].getLabel().equals("O") )
					weight[i] = -1;
			else if (squares[i].getLabel().equals("X"))
					weight[i] = 1;
			else
					weight[i] = 0;
					
		}
			int twoWeights = player.equals("O") ? -2 : 2;
			
			//Перевіряємо чи є в 1 ряду дві одинакові клітинки і одна пуста.
			
			if (weight[0] + weight[1] + weight[2] == twoWeights) {
				if(weight [0] == 0)
					return 0;
				else if (weight [1] == 0)
					return 1;
				else
					return 2;
			}

			// Перевіряємо чи є в ряду 2 дві одинакові клітинки і одна пуста
			
			if (weight[3] + weight[4] + weight[5] == twoWeights) {
				if (weight[3] == 0 )
					return 3;
				else if (weight [4] == 0)
					return 4;
				else 
					return 5;
			}
			
			// Перевіряємо чи є в ряду 3 дві одинакові клітинки і одна пуста
			
			if (weight[6] + weight[7] + weight [8] == twoWeights) {
				
				if (weight [6] == 0)
					return 6;
				else if (weight [7] == 0)
					return 7;
				else
					return 8;
			}
		
			// Перевіряємо чи є в колонці 2 дві однинакові клітинки і одна пуста.
			
				if (weight[1] + weight[4] + weight[7] == twoWeights) {
					
					if (weight [1] == 0)
						return 1;
					else if (weight [4] == 0)
						return 4;
					else
						return 7;
					
			}
				
			// Перевіряємо чи є в колонці 3 дві однинакові клітинки і одна пуста.
			
				if (weight[2] + weight[5] + weight[8] == twoWeights) {
					
					if (weight [2] == 0)
						return 2;
					else if (weight [5] == 0)
						return 5;
					else
						return 8;
					
			}
				
			// Перевіряємо чи є в діагоналі 1 дві одинакові клітинки і одна пуста.
				
				if (weight[0] + weight[4] + weight[8] == twoWeights) {
					
					if (weight [0] == 0)
						return 0;
					else if (weight [4] == 0)
						return 4;
					else
						return 8;
					
			}
			
			// Перевіряємо чи є в діагоналі 2 дві одинакові клітинки і одна пуста
				if (weight[2] + weight[4] + weight[6] == twoWeights) {
				if (weight [2] == 0)
					return 2;
				else if (weight [4] == 0)
					return 4;
				else
					return 6;
			}
				
			// Не знайдено 2-х одинакових сосідніх клітинок
			return -1;
			
			} // кінець методу findEmptySquares()

			/**
			 * Цей метод вибирає любу пусту клітинку
			 * @return випадково вибраний номер клітинки
			 */
		
			int getRandomSquare () {
				boolean gotEmptySquare = false;
				int selectedSquare = -1;
				
			do {
				selectedSquare = (int) (Math.random() * 9);
				
				if (squares [selectedSquare].getLabel().equals("")){
					gotEmptySquare = true; //щоб закінчити цикл
				
				}
			} while (!gotEmptySquare);
			
			return selectedSquare;
			} // кінець методу getRandomSquare ()
			
			/**
			 * Цей метод виділяє виграшну лінію
			 * @param перша, друга і третя клітинки для виділення
			 */
			void highlightWinner (int win1, int win2, int win3) {
				squares [win1].setBackground(Color.CYAN);
				squares [win2].setBackground(Color.CYAN);
				squares [win3].setBackground(Color.CYAN);
			}
		
			// Робимо не доступні клітинки і доступною кнопку "New Game"
			void endTheGame () {
				
				newGameButton.setEnabled(true);
				
				for (int i=0; i<9; i++) {
					squares [i].setEnabled(false);
				}
			}
		 // кінець класса

	public static void main(String[] args){
    //Запускаем через main() как Java приложение
    Applet tictac=new TictTacToe();
    JFrame frame=new JFrame("Крестики и нолики");
    frame.getContentPane().add(tictac);
    frame.setSize(200,300);
    tictac.init();
    tictac.start();
    //обязтельное условие, иначе 
    //не будет виден созданный фрейм
    frame.setVisible(true); 
       }               
       }
		
					

public class Chardemo{ 

	 public static void main(String[] arg) {

	     char st[] = { 'o', '2', 'A', 'b' };

	     for (int i = 0; i < st.length; i++) {
	         if (Character.isLetter(st[i])) {
	             System.out.println("Character At:" + i + "\t" + st[i]);

	         }

	         else {
	             System.out.println("Integer At:" + i + "\t" + st[i]);

	         }
	     }

	 }
}
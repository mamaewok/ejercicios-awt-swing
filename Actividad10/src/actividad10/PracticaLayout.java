package actividad10;

import java.awt.Button;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
/**
 * Actividad que consiste en hacer pr�ctica del Layout BoxLayout
 * @author MAMAEWOK
 *
 */
public class PracticaLayout {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame f = new JFrame("Ejemplo Border Layout");
			f.getContentPane().setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
			f.getContentPane().add(new Button("Bot�n 1"));
			f.getContentPane().add(new Button("Bot�n 2"));
			f.getContentPane().add(new Button("Bot�n 3"));
			f.getContentPane().add(new Button("Bot�n con nombre largo"));
			f.getContentPane().add(new Button("5"));
			
			f.setSize(300, 200);
			f.setVisible(true);
			
	}
}

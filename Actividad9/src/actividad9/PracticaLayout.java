package actividad9;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;
/**
 * Actividad para aprender a realizar con éxito un Border Layout
 * @author MAMAEWOK
 *
 */
public class PracticaLayout {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Ejemplo Border Layout");
		
		f.setLayout(new BorderLayout());
		f.add(new Button("Norte"), BorderLayout.NORTH);
		f.add(new Button("Oeste"), BorderLayout.WEST);
		f.add(new Button("Centro"), BorderLayout.CENTER);
		f.add(new Button("Este"), BorderLayout.EAST);
		f.add(new Button("Sur"), BorderLayout.SOUTH);
		
		f.setSize(400, 350);
		f.setVisible(true);
		
		

	}

}

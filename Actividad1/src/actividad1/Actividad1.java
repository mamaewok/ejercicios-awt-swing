package actividad1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Actividad en la que realizamos un HolaMundo simple con las librerias awt y swing
 * @author MAMAEWOK
 *
 */
public class Actividad1 {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame();
		JLabel l = new JLabel("Hola Mundo");
			f.setTitle("Actividad 1");
			f.setSize(300, 200);
			f.getContentPane().setLayout(new FlowLayout());
			f.getContentPane().add(l);
			
			f.setVisible(true);
	}

}

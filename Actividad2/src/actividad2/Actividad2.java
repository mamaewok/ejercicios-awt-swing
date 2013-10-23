package actividad2;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * Actividad para practicar la creación y posicionamiento de etiquetas, caja de texto y botones
 * @author MAMAEWOK
 *
 */
public class Actividad2 {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Actividad 2");
			f.setSize(300, 200);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
			f.getContentPane().add(new JLabel("Texto Etiqueta"));
			f.getContentPane().add(new JTextField(20));
			f.getContentPane().add(new JButton("Tócame"));
			
			f.setVisible(true);
		
			
		
		
		

	}

}

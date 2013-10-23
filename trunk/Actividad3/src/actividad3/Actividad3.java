package actividad3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Actividad para preacticar la colocación de componentes swing con LayoutManager
 * @author MAMAEWOK
 *
 */
public class Actividad3 {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Actividad 3");
			f.setSize(500, 300);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p = new JPanel();
			p.setLayout(new GridLayout(3,2,15,15));
		
			p.add(new JLabel("Número 1:"));
			p.add(new JTextField("0", 12));
			p.add(new JLabel("Número 2:"));
			p.add(new JTextField("0", 12));
			p.add(new Button("Sumar"));
			p.add(new Button("Restar"));
			
			f.add(p1, BorderLayout.NORTH);
			p1.add(p, BorderLayout.WEST);
			
			f.setVisible(true);
			
	}

}

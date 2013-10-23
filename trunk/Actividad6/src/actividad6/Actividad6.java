package actividad6;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
/**
 * Actividad que sirve para la práctica de las barras de menu y submenus
 * @author MAMAEWOK
 *
 */
public class Actividad6 {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("JMenuBarTest");
			f.setSize(300,250);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
		JMenuBar mb = new JMenuBar();
			
		JMenu m1 = new JMenu("Fichero");
			JMenu m11 = new JMenu("Nuevo");
				m11.add(new JMenuItem("Proyecto"));
				m11.add(new JMenuItem("Clase"));
				m11.add(new JMenuItem("Paquete"));
			JMenuItem m12 = new JMenuItem("Abrir");
			JMenuItem m13 = new JMenuItem("Cerrar");
			JMenuItem m14 = new JMenuItem("Salir");
		
			m1.add(m11);
			m1.add(m12);
			m1.add(m13);
			m1.addSeparator();
			m1.add(m14);
			
		JMenu m2 = new JMenu("Modo Edición");
			m2.add(new JRadioButtonMenuItem("Modo Binario"));
			m2.add(new JRadioButtonMenuItem("Modo Hexadécimal"));
			m2.add(new JRadioButtonMenuItem("Modo Decimal"));
			
			mb.add(m1);
			mb.add(m2);
			f.setJMenuBar(mb);
			
			f.setVisible(true);
	}

}

package actividad5;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Actividad para aprender a usar JMenuBar, y la aplicación tanto de JPanel como Layout Manager
 * @author MAMAEWOK
 *
 */
public class Actividad5 {

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Menús");
			f.setSize(300, 200);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new BorderLayout());
			
		JMenuBar m = new JMenuBar();                    //Abro la barra de menú
			JMenu m1=new JMenu("Archivo");
				m1.add(new JMenuItem("Proyecto nuevo"));
				m1.add(new JMenuItem("Archivo nuevo"));
				JMenu m11= new JMenu("Importar proyecto");
				m1.add(m11);
					m11.add(new JMenuItem("Proyecto Eclipse"));
					m11.add(new JMenuItem("Resincronizar proyecto"));
				
				m.add(m1);
				
			JMenu m2=new JMenu("Editar");
				m2.add(new JMenuItem("Deshacer"));
				m2.add(new JMenuItem("Cortar"));
				m.add(m2);
				
			JMenu m3=new JMenu("Navegar");
				m3.add(new JMenuItem("Ir al archivo..."));
				m3.add(new JMenuItem("Ir al tipo..."));
				m.add(m3);
				
			JMenu m4=new JMenu("Fuente");
				m4.add(new JMenuItem("Formeto"));
				m4.add(new JMenuItem("Eliminar espacios finales"));
				m.add(m4);
				
			JMenu m5=new JMenu("Reestructurar");
				m5.add(new JMenuItem("Cambiar de nombre"));
				m5.add(new JMenuItem("Mover"));
				m.add(m5);
				
				f.setJMenuBar(m);                //Añado la barra de menu al Frame
				
			JPanel p1 = new JPanel();
				p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
				p1.add(new JLabel("Elemento seleccionado: "));
				p1.add(new JTextField(12));
				
				f.add(p1, BorderLayout.NORTH);
				
			JPanel p2 = new JPanel();
				p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
				for(int i = 1; i <= 5; i++){
					p2.add(new JLabel("elemento"+i));
				}
				
				f.getContentPane().add(p2, BorderLayout.CENTER); //No se por qué no se pone el p2 en el centro
				
				
				f.setVisible(true);
	}

}

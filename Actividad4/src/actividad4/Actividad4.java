package actividad4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 * Actividad para preacticar la colocación de componentes swing con LayoutManager
 * @author MAMAEWOK
 *
 */
public class Actividad4 {
	
	
	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Datos Personales");
			f.setSize(330, 340);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
			
		JPanel p1 = new JPanel();
			p1.add(new JLabel("Nombre:"));
			p1.add(new JTextField(20));
			p1.add(new JLabel("Apellidos:"));
			p1.add(new JTextField(20));
			f.add(p1);
			
			JPanel p2 = new JPanel();
			p2.add(new JLabel("Edad"));
			String [] combo ={"Mayor de 20","Menor de 20"};
			p2.add(new JComboBox<>(combo));
			p2.add(new JLabel("Sexo:"));
			p2.add(new JRadioButton("mujer"));
			p2.add(new JRadioButton("hombre"));
			f.add(p2);
			
		JPanel p3 = new JPanel();
			p3.add(new JLabel("Estado civil:"));
			p3.add(new JRadioButton("soltero"));
			p3.add(new JRadioButton("casado"));
			p3.add(new JRadioButton("otro"));
			f.add(p3);
			
		JPanel p4 = new JPanel();
			p4.add(new JLabel("Aficiones:"));
			p4.add(new JCheckBox("Cine"));
			p4.add(new JCheckBox("Literatura"));
			p4.add(new JCheckBox("Tebeos"));
			f.add(p4);
			
		JPanel p5 = new JPanel();
			p5.add(new JCheckBox("Deporte"));
			p5.add(new JCheckBox("Música"));
			p5.add(new JCheckBox("Televisión"));
			p5.add(new JCheckBox("Mágia"));
			f.add(p5);
			
		JPanel p6 = new JPanel(new FlowLayout());
			p6.add(new Button("Botón"), BorderLayout.NORTH);
			f.add(p6);
			
			f.setVisible(true); //Ponerlo siempre al final
			
			
	}
}

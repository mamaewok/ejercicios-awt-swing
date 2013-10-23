package actividad12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticaLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Layout Mix");
			f.getContentPane().setLayout(new BorderLayout());
			f.setSize(400, 350);
			
		JPanel panelArriba = new JPanel(new FlowLayout());
			panelArriba.add(new Button("Sup.1"));
			panelArriba.add(new Button("Sup.2"));
			panelArriba.add(new Button("Sup.3"));
			panelArriba.add(new Button("Sup.4"));
			panelArriba.setBackground(Color.green);
		
		JPanel panelDerch = new JPanel();
		panelDerch.setLayout(new BoxLayout(panelDerch, BoxLayout.Y_AXIS));
			panelDerch.add(new Button("A"));
			panelDerch.add(new Button("B"));
			panelDerch.add(new Button("C"));
			panelDerch.add(new Button("D"));
			panelDerch.setBackground(Color.green);
			
		JPanel panelIzq = new JPanel();
			panelIzq.setLayout(new BoxLayout(panelIzq, BoxLayout.Y_AXIS));
			panelIzq.add(new Button("1"));
			panelIzq.add(new Button("2"));
			panelIzq.add(new Button("3"));
			panelIzq.setBackground(Color.red);
			
		JPanel panelAbajo = new JPanel(new FlowLayout());
			panelAbajo.add(new JLabel("Texto aquí"));
			panelAbajo.add(new JTextField(40));
			panelAbajo.add(new Button("Listo"));
			panelAbajo.setBackground(Color.yellow);
			
			f.add(panelArriba, BorderLayout.NORTH);
			f.add(panelAbajo, BorderLayout.SOUTH);
			f.add(panelIzq, BorderLayout.WEST);
			f.add(panelDerch, BorderLayout.EAST);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
			f.pack();
			
		
			
			
		
	}

}

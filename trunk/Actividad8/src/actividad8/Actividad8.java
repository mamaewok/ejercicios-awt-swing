package actividad8;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
/**
 * Actividad que se realiza con la finalidad de aprender y practicar el uso de FileChooser
 * @author MAMAEWOK
 *
 */
public class Actividad8 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser fc= new JFileChooser();
		int aux = fc.showOpenDialog(f);
		if(aux==JFileChooser.APPROVE_OPTION)
			System.out.println(fc.getSelectedFile());
	
	
		f.setVisible(false);
	}

}

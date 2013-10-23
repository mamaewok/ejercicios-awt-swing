package actividad11;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Model extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Model(){
		super("GridLayout");
		this.setLayout(new GridLayout(3,2));
		for(int i = 1; i <= 6;i++){
			this.add(new Button(Integer.toString(i)));
		}
		this.setSize(400,350);
		this.setVisible(true);
	}
	
	public Model(int disVertical, int disHorizontal){
		super("GridLayout");
		this.setLayout(new GridLayout(3,2, disHorizontal, disVertical));
		for(int i = 1; i <= 6;i++){
			this.add(new Button(Integer.toString(i)));
		}
		this.setSize(400,350);
		this.setVisible(true);
	}
	
}

package lab02;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JFrame frame = new JFrame();
	    JLabel label = new JLabel();
	    label.setText("Titel Label");
	    frame.add(label);
		frame.setTitle("Windor");
		frame.setSize(1360,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

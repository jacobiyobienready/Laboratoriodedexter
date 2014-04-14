import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Windore extends JFrame implements ActionListener { //Ventana "E" Esencial
	private JButton joton;
	private JTextField jtexto;
	private JLabel jlbl;

public Windore(){//Constructor
 super("Ejecutando");
 this.definewindore();
this.setLocationRelativeTo(null);
 this.setResizable(false);
 this.setSize(315,400);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setVisible(true);
	
}

public  void definewindore(){
	this.setLayout(new FlowLayout());
	joton = new JButton("Copiar");
	jtexto = new JTextField(20);
	jlbl = new JLabel();
	this.add(jtexto);
	this.add(joton);
	this.add(jlbl);
	joton.addActionListener(this);
	}


public void actionPerformed(ActionEvent e) {
	if(e.getSource()==joton){
		jlbl.setText(jtexto.getText());
	}
	
}//Final of ActionPerformed

}


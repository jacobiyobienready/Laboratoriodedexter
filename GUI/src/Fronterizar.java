import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fronterizar extends JFrame  implements ItemListener{
	private JTextField texto;
	private JCheckBox negrita,cursiva;
	private Font Fuente;
	
	public Fronterizar()/*Contructor Default*/{
		super("Fronterizar");
		this.setLayout(new FlowLayout());
		this.definirventanu();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void definirventanu(){
		texto = new JTextField(20);
		negrita = new JCheckBox("Negrita");
		cursiva = new JCheckBox("Cursiva");
		add(texto);
		add(negrita);
		add(cursiva);
		negrita.addItemListener(this);
		cursiva.addItemListener(this);
		
		
	}
	public void itemStateChanged(ItemEvent e) {
	if(negrita.isSelected() && cursiva.isSelected()){
		//Cambie el texto a negrita y cursiva
	}else if(cursiva.isSelected()){
		//Cambiar el texto a cursiva solo cursiva
	}else if(negrita.isSelected()){
		//se Seleciono solo negrita
	}
		
	}

}

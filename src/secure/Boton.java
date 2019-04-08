package secure;
import java.awt.*;
import java.security.SecureRandom;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class Boton extends JFrame implements ActionListener{
	JButton boton;
	JTextField texto;
	int pass = 30;
	private static final SecureRandom SG = new SecureRandom();
	private static final String alpha = ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	public Boton(){
		setLayout (null);
		boton = new JButton("Generate!");
		boton.setBounds(100,100,100,30);
		boton.addActionListener(this);
		add(boton);
		texto = new JTextField("");
		texto.setBounds(30,50,230,40);
		add(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton){
			setTitle ("Password...");
			String contraseña = getContra(pass);
			texto.setText(contraseña);
		}
	}
	
	public static String getContra(int length){
		StringBuilder contragen = new StringBuilder(length);
		for (int i=0; i<length;i++){
			contragen.append(alpha.charAt(SG.nextInt(alpha.length())));
		}
		return new String (contragen);
	}
	
	
	
	
}

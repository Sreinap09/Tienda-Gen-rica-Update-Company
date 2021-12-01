package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelMenuC extends JPanel{

	private JLabel lblTituloC;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	
	public static final String BOTON1 = "boton1";
	public static final String BOTON2 = "boton2";
	public static final String BOTON3 = "boton3";
	public static final String BOTON4 = "boton4";
	
	public PanelMenuC() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		setBorder(new LineBorder(Color.BLACK, 1, false));
		
		lblTituloC = new JLabel("Módulo Clientes");
		lblTituloC.setBounds(55, 15, 200, 20);
		lblTituloC.setFont(new Font("Arial", Font.BOLD, 16));
		lblTituloC.setForeground(Color.BLACK);
		add(lblTituloC);
		
		b1 = new JButton("Crear Cliente");
		b1.setBounds(15, 50, 185, 20);
		b1.setActionCommand(BOTON1);
		add(b1);
		
		b2 = new JButton("Mostrar Clientes");
		b2.setBounds(15, 85, 185, 20);
		b2.setActionCommand(BOTON2);
		add(b2);
		
		b3 = new JButton("Actualizar datos cliente");
		b3.setBounds(15, 120, 185, 20);
		b3.setActionCommand(BOTON3);
		add(b3);
		
		b4 = new JButton("Borrar cliente");
		b4.setBounds(15, 155, 185, 20);
		b4.setActionCommand(BOTON4);
		add(b4);
	}

//	getters & setters
	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}
}

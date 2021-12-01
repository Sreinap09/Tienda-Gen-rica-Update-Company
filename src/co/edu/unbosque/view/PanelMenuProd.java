package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelMenuProd extends JPanel{

	private JLabel lblTituloProd;
	private JButton btnCrearProd;
	private JButton btnMostrarProd;
	private JButton btnActProd;
	private JButton btnBorrarProd;
	
	public static final String BCPRD = "boton1";
	public static final String BMPRD = "boton2";
	public static final String BAPRD = "boton3";
	public static final String BBPRD = "boton4";
	
	public PanelMenuProd() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		setBorder(new LineBorder(Color.BLACK, 1, false));
		
		lblTituloProd = new JLabel("Módulo Productos");
		lblTituloProd.setBounds(35, 15, 200, 20);
		lblTituloProd.setFont(new Font("Arial", Font.BOLD, 16));
		lblTituloProd.setForeground(Color.BLACK);
		add(lblTituloProd);
		
		btnCrearProd = new JButton("Crear Producto");
		btnCrearProd.setBounds(15, 50, 185, 20);
		btnCrearProd.setActionCommand(BCPRD);
		add(btnCrearProd);
		
		btnMostrarProd = new JButton("Mostrar Productos");
		btnMostrarProd.setBounds(15, 85, 185, 20);
		btnMostrarProd.setActionCommand(BMPRD);
		add(btnMostrarProd);
		
		btnActProd = new JButton("Actualizar datos productos");
		btnActProd.setBounds(15, 120, 185, 20);
		btnActProd.setActionCommand(BAPRD);
		add(btnActProd);
		
		btnBorrarProd = new JButton("Borrar producto");
		btnBorrarProd.setBounds(15, 155, 185, 20);
		btnBorrarProd.setActionCommand(BBPRD);
		add(btnBorrarProd);
		
		
		
	}

//	getters & setters
	public JLabel getLblTituloProd() {
		return lblTituloProd;
	}

	public void setLblTituloProd(JLabel lblTituloProd) {
		this.lblTituloProd = lblTituloProd;
	}

	public JButton getBtnCrearProd() {
		return btnCrearProd;
	}

	public void setBtnCrearProd(JButton btnCrearProd) {
		this.btnCrearProd = btnCrearProd;
	}

	public JButton getBtnMostrarProd() {
		return btnMostrarProd;
	}

	public void setBtnMostrarProd(JButton btnMostrarProd) {
		this.btnMostrarProd = btnMostrarProd;
	}

	public JButton getBtnActProd() {
		return btnActProd;
	}

	public void setBtnActProd(JButton btnActProd) {
		this.btnActProd = btnActProd;
	}

	public JButton getBtnBorrarProd() {
		return btnBorrarProd;
	}

	public void setBtnBorrarProd(JButton btnBorrarProd) {
		this.btnBorrarProd = btnBorrarProd;
	}
	
}

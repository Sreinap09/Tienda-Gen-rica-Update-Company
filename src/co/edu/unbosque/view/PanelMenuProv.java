package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelMenuProv extends JPanel{

	private JLabel lblTituloProv;
	private JButton btnCrearProv;
	private JButton btnMostrarProv;
	private JButton btnActProv;
	private JButton btnBorrarProv;
	
	public static final String BCPRV = "boton1";
	public static final String BMPRV = "boton2";
	public static final String BAPRV = "boton3";
	public static final String BBPRV = "boton4";
	
	public PanelMenuProv() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		setBorder(new LineBorder(Color.BLACK, 1, false));
		
		lblTituloProv = new JLabel("Módulo Proveedores");
		lblTituloProv.setBounds(35, 15, 200, 20);
		lblTituloProv.setFont(new Font("Arial", Font.BOLD, 16));
		lblTituloProv.setForeground(Color.BLACK);
		add(lblTituloProv);
		
		btnCrearProv = new JButton("Crear Proveedor");
		btnCrearProv.setBounds(15, 50, 185, 20);
		btnCrearProv.setActionCommand(BCPRV);
		add(btnCrearProv);
		
		btnMostrarProv = new JButton("Mostrar Proveedores");
		btnMostrarProv.setBounds(15, 85, 185, 20);
		btnMostrarProv.setActionCommand(BMPRV);
		add(btnMostrarProv);
		
		btnActProv = new JButton("Actualizar datos proveedor");
		btnActProv.setBounds(15, 120, 185, 20);
		btnActProv.setActionCommand(BAPRV);
		add(btnActProv);
		
		btnBorrarProv = new JButton("Borrar proveedor");
		btnBorrarProv.setBounds(15, 155, 185, 20);
		btnBorrarProv.setActionCommand(BBPRV);
		add(btnBorrarProv);
	}
	
	
	
//	getters & setters
	public JLabel getLblTituloProv() {
		return lblTituloProv;
	}

	public void setLblTituloProv(JLabel lblTituloProv) {
		this.lblTituloProv = lblTituloProv;
	}

	public JButton getBtnCrearProv() {
		return btnCrearProv;
	}

	public void setBtnCrearProv(JButton btnCrearProv) {
		this.btnCrearProv = btnCrearProv;
	}

	public JButton getBtnMostrarProv() {
		return btnMostrarProv;
	}

	public void setBtnMostrarProv(JButton btnMostrarProv) {
		this.btnMostrarProv = btnMostrarProv;
	}

	public JButton getBtnActProv() {
		return btnActProv;
	}

	public void setBtnActProv(JButton btnActProv) {
		this.btnActProv = btnActProv;
	}

	public JButton getBtnBorrarProv() {
		return btnBorrarProv;
	}

	public void setBtnBorrarProv(JButton btnBorrarProv) {
		this.btnBorrarProv = btnBorrarProv;
	}	
}

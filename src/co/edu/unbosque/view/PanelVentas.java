package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PanelVentas extends JPanel{

	private JLabel lblTituloV;
	private JLabel lblCedula;
	private JLabel lblCodigo;
	private JLabel lblCantidad;
	
	private JTextField txtCedula;
	private JTextField txtCodifo;
	private JTextField txtCantidad;
	
	private JButton btnCrearArchivo;
	
	public static final String CREAR = "CrearArchivo";

	public PanelVentas() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		lblTituloV = new JLabel("Gestión de ventas");
		lblTituloV.setBounds(35, 15, 200, 20);
		lblTituloV.setFont(new Font("Arial", Font.BOLD, 16));
		lblTituloV.setForeground(Color.BLACK);
		add(lblTituloV);
		
		lblCedula = new JLabel("Cédula:");
		lblCedula.setBounds(15, 50, 150, 20);
		add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(15, 70, 160, 20);
		add(txtCedula);
		
		lblCodigo = new JLabel("Tipo de tienda:");
		lblCodigo.setBounds(15, 100, 150, 20);
		add(lblCodigo);
		
		txtCodifo = new JTextField();
		txtCodifo.setBounds(15, 120, 160, 20);
		add(txtCodifo);
		
		lblCantidad = new JLabel("NIT:");
		lblCantidad.setBounds(15, 150, 150, 20);
		add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(15, 170, 160, 20);
		add(txtCantidad);
		
		btnCrearArchivo = new JButton("Crear Archivo");
		btnCrearArchivo.setBounds(15, 200, 160, 20);
		btnCrearArchivo.setActionCommand(CREAR);
		add(btnCrearArchivo);
		
	}
	
	
	
	
//	getters & setters
	public JLabel getLblTituloV() {
		return lblTituloV;
	}

	public void setLblTituloV(JLabel lblTituloV) {
		this.lblTituloV = lblTituloV;
	}

	public JLabel getLblCedula() {
		return lblCedula;
	}

	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	public JLabel getLblCodigo() {
		return lblCodigo;
	}

	public void setLblCodigo(JLabel lblCodigo) {
		this.lblCodigo = lblCodigo;
	}

	public JLabel getLblCantidad() {
		return lblCantidad;
	}

	public void setLblCantidad(JLabel lblCantidad) {
		this.lblCantidad = lblCantidad;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextField getTxtCodifo() {
		return txtCodifo;
	}

	public void setTxtCodifo(JTextField txtCodifo) {
		this.txtCodifo = txtCodifo;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JButton getBtnCrearArchivo() {
		return btnCrearArchivo;
	}

	public void setBtnCrearArchivo(JButton btnCrearArchivo) {
		this.btnCrearArchivo = btnCrearArchivo;
	}
}

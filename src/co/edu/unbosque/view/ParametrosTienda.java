package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class ParametrosTienda extends JPanel {

	private JLabel lblTituloT;
	private JLabel lblNombreTienda;
	private JLabel lblTipo;
	private JLabel lblNit;
	private JLabel lblCiudad;
	private JLabel lblIva;
	private JLabel lblTasaInteres;
	private JLabel lblBanco;
	private JLabel lblNumeroCuenta;
	private JLabel lblNombreGerente;
	
	private JTextField txtNombreTienda;
	private JTextField txtTipo;
	private JTextField txtDNit;
	private JTextField txtCiudad;
	private JTextField txtTasaInteres;
	private JTextField txtBanco;
	private JTextField txtIva;
	private JTextField txtNumeroCuenta;
	private JTextField txtNombreGerente;
	
	private JButton btnCrearArchivo;
	private JButton btnModificar;
	private JButton btnGuardar;
	
	public static final String CREARA = "CrearArchivo";
	public static final String MODIFICARA = "Modificar";
	public static final String GUARDARA = "Guardar";
	
	public ParametrosTienda() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		lblTituloT = new JLabel("Parámetros Tienda");
		lblTituloT.setBounds(35, 15, 200, 20);
		lblTituloT.setFont(new Font("Arial", Font.BOLD, 16));
		lblTituloT.setForeground(Color.BLACK);
		add(lblTituloT);
		
		lblNombreTienda = new JLabel("Nombre tienda:");
		lblNombreTienda.setBounds(15, 50, 150, 20);
		add(lblNombreTienda);
		
		txtNombreTienda = new JTextField();
		txtNombreTienda.setBounds(15, 70, 160, 20);
		add(txtNombreTienda);
		
		lblTipo = new JLabel("Tipo de tienda:");
		lblTipo.setBounds(15, 100, 150, 20);
		add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(15, 120, 160, 20);
		add(txtTipo);
		
		lblNit = new JLabel("NIT:");
		lblNit.setBounds(15, 150, 150, 20);
		add(lblNit);
		
		txtDNit = new JTextField();
		txtDNit.setBounds(15, 170, 160, 20);
		add(txtDNit);
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(210, 50, 150, 20);
		add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(210, 70, 160, 20);
		add(txtCiudad);
		
		lblIva = new JLabel("IVA:");
		lblIva.setBounds(210, 100, 150, 20);
		add(lblIva);
		
		txtIva = new JTextField();
		txtIva.setBounds(210, 120, 160, 20);
		add(txtIva);
		
		lblTasaInteres = new JLabel("Tasa de interés:");
		lblTasaInteres.setBounds(210, 150, 150, 20);
		add(lblTasaInteres);
		
		txtTasaInteres = new JTextField();
		txtTasaInteres.setBounds(210, 170, 160, 20);
		add(txtTasaInteres);		
		
		lblBanco = new JLabel("Banco:");
		lblBanco.setBounds(400, 50, 150, 20);
		add(lblBanco);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(400, 70, 160, 20);
		add(txtBanco);		
		
		lblNumeroCuenta = new JLabel("Número de cuenta:");
		lblNumeroCuenta.setBounds(400, 100, 150, 20);
		add(lblNumeroCuenta);
		
		txtNumeroCuenta = new JTextField();
		txtNumeroCuenta.setBounds(400, 120, 160, 20);
		add(txtNumeroCuenta);		
		
		lblNombreGerente = new JLabel("Nombre gerente:");
		lblNombreGerente.setBounds(400, 150, 150, 20);
		add(lblNombreGerente);
		
		txtNombreGerente = new JTextField();
		txtNombreGerente.setBounds(400, 170, 160, 20);
		add(txtNombreGerente);
		
		btnCrearArchivo = new JButton("Crear Archivo");
		btnCrearArchivo.setBounds(15, 200, 160, 20);
		btnCrearArchivo.setActionCommand(CREARA);
		add(btnCrearArchivo);
		
		btnModificar = new JButton("Modificar Archivo");
		btnModificar.setBounds(210, 200, 160, 20);
		btnModificar.setActionCommand(MODIFICARA);
		add(btnModificar);
		
		btnGuardar = new JButton("Guardar Archivo");
		btnGuardar.setBounds(400, 200, 160, 20);
		btnGuardar.setActionCommand(GUARDARA);
		add(btnGuardar);
		
	}
	
	
//	getters & setters
	public JLabel getLblNombreTienda() {
		return lblNombreTienda;
	}
	public JLabel getLblTituloT() {
		return lblTituloT;
	}
	public void setLblTituloT(JLabel lblTituloT) {
		this.lblTituloT = lblTituloT;
	}
	public void setLblNombreTienda(JLabel lblNombreTienda) {
		this.lblNombreTienda = lblNombreTienda;
	}
	public JLabel getLblTipo() {
		return lblTipo;
	}
	public void setLblTipo(JLabel lblTipo) {
		this.lblTipo = lblTipo;
	}
	public JLabel getLblNit() {
		return lblNit;
	}
	public void setLblNit(JLabel lblNit) {
		this.lblNit = lblNit;
	}
	public JLabel getLblCiudad() {
		return lblCiudad;
	}
	public void setLblCiudad(JLabel lblCiudad) {
		this.lblCiudad = lblCiudad;
	}
	public JLabel getLblIva() {
		return lblIva;
	}
	public void setLblIva(JLabel lblIva) {
		this.lblIva = lblIva;
	}
	public JLabel getLblTasaInteres() {
		return lblTasaInteres;
	}
	public void setLblTasaInteres(JLabel lblTasaInteres) {
		this.lblTasaInteres = lblTasaInteres;
	}
	public JLabel getLblBanco() {
		return lblBanco;
	}
	public void setLblBanco(JLabel lblBanco) {
		this.lblBanco = lblBanco;
	}
	public JLabel getLblNumeroCuenta() {
		return lblNumeroCuenta;
	}
	public void setLblNumeroCuenta(JLabel lblNumeroCuenta) {
		this.lblNumeroCuenta = lblNumeroCuenta;
	}
	public JLabel getLblNombreGerente() {
		return lblNombreGerente;
	}
	public void setLblNombreGerente(JLabel lblNombreGerente) {
		this.lblNombreGerente = lblNombreGerente;
	}
	public JTextField getTxtNombreTienda() {
		return txtNombreTienda;
	}
	public void setTxtNombreTienda(JTextField txtNombreTienda) {
		this.txtNombreTienda = txtNombreTienda;
	}
	public JTextField getTxtTipo() {
		return txtTipo;
	}
	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}
	public JTextField getTxtDNit() {
		return txtDNit;
	}
	public void setTxtDNit(JTextField txtDNit) {
		this.txtDNit = txtDNit;
	}
	public JTextField getTxtCiudad() {
		return txtCiudad;
	}
	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}
	public JTextField getTxtTasaInteres() {
		return txtTasaInteres;
	}
	public void setTxtTasaInteres(JTextField txtTasaInteres) {
		this.txtTasaInteres = txtTasaInteres;
	}
	public JTextField getTxtBanco() {
		return txtBanco;
	}
	public void setTxtBanco(JTextField txtBanco) {
		this.txtBanco = txtBanco;
	}
	public JTextField getTxtIva() {
		return txtIva;
	}
	public void setTxtIva(JTextField txtIva) {
		this.txtIva = txtIva;
	}
	public JTextField getTxtNumeroCuenta() {
		return txtNumeroCuenta;
	}
	public void setTxtNumeroCuenta(JTextField txtNumeroCuenta) {
		this.txtNumeroCuenta = txtNumeroCuenta;
	}
	public JTextField getTxtNombreGerente() {
		return txtNombreGerente;
	}
	public void setTxtNombreGerente(JTextField txtNombreGerente) {
		this.txtNombreGerente = txtNombreGerente;
	}
	public JButton getBtnCrearArchivo() {
		return btnCrearArchivo;
	}
	public void setBtnCrearArchivo(JButton btnCrearArchivo) {
		this.btnCrearArchivo = btnCrearArchivo;
	}
	public JButton getBtnModificar() {
		return btnModificar;
	}
	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
}

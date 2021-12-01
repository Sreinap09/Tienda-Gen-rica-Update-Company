package co.edu.unbosque.view;

import javax.swing.*;

public class PanelCrearC extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblCedula;
	private JLabel lblNombre;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	
	private JButton btnCrearC;
	private JButton limpiar;
	
	public static final String ESCRIBIR = "Escribir";
	
	public PanelCrearC() {
		setLayout(null);
		componentes();
		setVisible(false);
	}

	public void componentes() {
		lblCedula = new JLabel("Cédula:");
		lblCedula.setBounds(14, 0, 200, 20);
		add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(14, 20, 150, 20);
		add(txtCedula);
		
		lblNombre = new JLabel("Nombre completo:");
		lblNombre.setBounds(14, 50, 200, 20);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(14, 70, 150, 20);
		add(txtNombre);
		
		lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(14, 100, 200, 20);
		add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(14, 120, 150, 20);
		add(txtDireccion);
		
		lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(190, 0, 200, 20);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(190, 20, 150, 20);
		add(txtTelefono);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(190, 50, 200, 20);
		add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(190, 70, 150, 20);
		add(txtCorreo);
		
		btnCrearC = new JButton("Crear Cliente");
		btnCrearC.setBounds(14, 170, 150, 20);
		btnCrearC.setActionCommand(ESCRIBIR);
		add(btnCrearC);
		
		limpiar = new JButton("Limpiar");
		limpiar.setBounds(190, 170, 150, 20);
		limpiar.setActionCommand("limpiar");
		add(limpiar);		
	}

//	getters & setters
	public JLabel getLblCedula() {
		return lblCedula;
	}

	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public void setLblTelefono(JLabel lblTelefono) {
		this.lblTelefono = lblTelefono;
	}

	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	public void setLblCorreo(JLabel lblCorreo) {
		this.lblCorreo = lblCorreo;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JButton getBtnCrearC() {
		return btnCrearC;
	}

	public void setBtnCrearC(JButton btnCrearC) {
		this.btnCrearC = btnCrearC;
	}

	public JButton getLimpiar() {
		return limpiar;
	}

	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}	
}

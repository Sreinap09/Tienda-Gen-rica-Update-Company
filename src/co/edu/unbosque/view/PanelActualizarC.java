package co.edu.unbosque.view;

import javax.swing.*;

public class PanelActualizarC extends JPanel{

	private JLabel lblCedula;
	private JLabel lblDatoAct;
	private JTextField txtCedula;
	private JTextField txtDatoAct;
	private JComboBox<String> txtDatos;
	
	private JButton btnBuscar;
	private JButton btnActualizar;
	
	public static final String BBUSCAR = "btnBuscar";
	
	public PanelActualizarC() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		lblCedula = new JLabel("Ingrese la cédula del cliente a actualizar:");
		lblCedula.setBounds(14, 0, 250, 20);
		add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(14, 20, 150, 20);
		add(txtCedula);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(14, 50, 150, 20);
		btnBuscar.setActionCommand(BBUSCAR);
		add(btnBuscar);
		
		lblDatoAct = new JLabel("Seleccione el dato a actualizar:");
		lblDatoAct.setBounds(14, 100, 250, 20);
		add(lblDatoAct);
		
		txtDatos = new JComboBox<String>();
		txtDatos.setBounds(14, 120, 200, 20);
		txtDatos.addItem("Nombre");
		txtDatos.addItem("Dirección");
		txtDatos.addItem("Teléfono");
		txtDatos.addItem("Correo");
		add(txtDatos);
		
		txtDatoAct = new JTextField();
		txtDatoAct.setBounds(14, 150, 115, 20);
		add(txtDatoAct);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(14, 180, 150, 20);
		btnActualizar.setActionCommand("Actualizar");
		add(btnActualizar);
	}

//	getters & setters
	public JLabel getLblCedula() {
		return lblCedula;
	}

	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JComboBox<String> getTxtDatos() {
		return txtDatos;
	}

	public void setTxtDatos(JComboBox<String> txtDatos) {
		this.txtDatos = txtDatos;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}	
}

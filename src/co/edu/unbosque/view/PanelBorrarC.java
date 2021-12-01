package co.edu.unbosque.view;

import javax.swing.*;

public class PanelBorrarC extends JPanel{

	private JLabel lblCedula;
	private JTextField txtCedula;
	private JButton btnBorrar;
	
	public static final String BBORRAR = "btnBorrar";
	
	public PanelBorrarC() {
		setLayout(null);
		componentes();
		setVisible(false);
	}
	
	public void componentes() {
		lblCedula = new JLabel("Ingrese la cédula del cliente a borrar:");
		lblCedula.setBounds(14, 0, 220, 20);
		add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(14, 20, 150, 20);
		add(txtCedula);
		
		btnBorrar = new JButton("Borrar cliente");
		btnBorrar.setBounds(14, 50, 150, 20);
		btnBorrar.setActionCommand("borrarC");
		add(btnBorrar);
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

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}	
}

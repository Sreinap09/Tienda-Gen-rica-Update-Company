package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistence.Cliente;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class PanelCliente extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JButton btnLeer;
	private JButton btnActualizar;
	private JButton btnBorrar;
	private JButton btnCrear;
	public static final String ESCRIBIR = "Escribir";
	public static final String LEER_REG = "LeerReg";
	
	
	public PanelCliente(Controller control) {
		
		setBounds(100, 100, 570, 355);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrincipal = new JLabel("Clientes");
		lblTituloPrincipal.setForeground(Color.BLUE);
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrincipal.setFont(new Font("Arial", Font.BOLD, 22));
		lblTituloPrincipal.setBounds(207, 11, 154, 33);
		contentPane.add(lblTituloPrincipal);
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCedula.setBounds(38, 41, 54, 24);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(38, 88, 61, 24);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDireccion.setBounds(38, 137, 70, 24);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono.setBounds(38, 187, 88, 24);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo electrónico:");
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCorreo.setBounds(38, 237, 126, 24);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(38, 255, 202, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(38, 206, 202, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(38, 156, 202, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(38, 106, 202, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(38, 61, 202, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		btnCrear = new JButton("Crear Cliente");
		btnCrear.addActionListener(control);
		
		btnCrear.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCrear.setBounds(332, 74, 172, 23);
		contentPane.add(btnCrear);
		
		btnLeer = new JButton("Leer Cliente");
		btnLeer.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLeer.setBounds(332, 123, 172, 23);
		contentPane.add(btnLeer);
		btnLeer.setActionCommand(LEER_REG);
		
		btnActualizar = new JButton("Actualizar Cliente");
		btnActualizar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnActualizar.setBounds(332, 168, 172, 23);
		contentPane.add(btnActualizar);
		
		btnBorrar = new JButton("Borrar Cliente");
		btnBorrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBorrar.setBounds(332, 213, 172, 23);
		contentPane.add(btnBorrar);
		
				
		
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("ya");
	}
	
//	public void mostrarCliente(int numClient, Cliente[] client) {
//		for(int i = 0; i < numClient; i++) {
//			getTxtCedula()
//		}
//		
//	}

	
//	getters & setters
	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JButton getBtnLeer() {
		return btnLeer;
	}

	public void setBtnLeer(JButton btnLeer) {
		this.btnLeer = btnLeer;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}	
}

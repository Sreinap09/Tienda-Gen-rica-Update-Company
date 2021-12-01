package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelMenuPrincipal extends JPanel{

	private JLabel lblAccion;
	private JButton btnConfig;
	private JButton btnModuloClientes;
	private JButton btnModuloProv;
	private JButton btnModuloProd;
	private JButton btnModuloVentas;
	private JButton btnModuloReportes;
	
	public static final String BCONF = "btnConf";
	public static final String BMODCLIENTES = "btnModClientes";
	public static final String BMODPROV = "btnModProv";
	public static final String BMODPROD = "btnModProd";
	public static final String BMODVENTAS = "btnModVentas";
	public static final String BMODREPOR = "btnModRepor";
	
	public PanelMenuPrincipal() {
		setLayout(null);
		componentes();
		setVisible(true);
	}
	
	public void componentes() {
		setBorder(new LineBorder(Color.BLACK, 1, false));
		
		lblAccion = new JLabel("Seleccione la acción que desea realizar:");
		lblAccion.setBounds(15, 0, 300, 20);
		add(lblAccion);
		
		btnConfig = new JButton("Configurar tienda");
		btnConfig.setBounds(15, 25, 150, 20);
		btnConfig.setActionCommand(BCONF);
		add(btnConfig);
		
		btnModuloClientes = new JButton("Módulo Clientes");
		btnModuloClientes.setBounds(15, 60, 150, 20);
		btnModuloClientes.setActionCommand(BMODCLIENTES);
		add(btnModuloClientes);
		
		btnModuloProv = new JButton("Módulo Proveedores");
		btnModuloProv.setBounds(185, 25, 160, 20);
		btnModuloProv.setActionCommand(BMODPROV);
		add(btnModuloProv);
		
		btnModuloProd = new JButton("Módulo Productos");
		btnModuloProd.setBounds(185, 60, 160, 20);
		btnModuloProd.setActionCommand(BMODPROD);
		add(btnModuloProd);
		
		btnModuloVentas = new JButton("Módulo Gestión Ventas");
		btnModuloVentas.setBounds(365, 25, 200, 20);
		btnModuloVentas.setActionCommand(BMODVENTAS);
		add(btnModuloVentas);
		
		btnModuloReportes = new JButton("Módulo Consultas y Reportes");
		btnModuloReportes.setBounds(365, 60, 200, 20);
		btnModuloReportes.setActionCommand(BMODREPOR);
		add(btnModuloReportes);
		
		
		
	}
	
	
//	getters & setters
	public JLabel getLblAccion() {
		return lblAccion;
	}
	public void setLblAccion(JLabel lblAccion) {
		this.lblAccion = lblAccion;
	}
	public JButton getBtnConfig() {
		return btnConfig;
	}
	public void setBtnConfig(JButton btnConfig) {
		this.btnConfig = btnConfig;
	}
	public JButton getBtnModuloClientes() {
		return btnModuloClientes;
	}
	public void setBtnModuloClientes(JButton btnModuloClientes) {
		this.btnModuloClientes = btnModuloClientes;
	}
	public JButton getBtnModuloProv() {
		return btnModuloProv;
	}
	public void setBtnModuloProv(JButton btnModuloProv) {
		this.btnModuloProv = btnModuloProv;
	}
	public JButton getBtnModuloProd() {
		return btnModuloProd;
	}
	public void setBtnModuloProd(JButton btnModuloProd) {
		this.btnModuloProd = btnModuloProd;
	}
	public JButton getBtnModuloVentas() {
		return btnModuloVentas;
	}
	public void setBtnModuloVentas(JButton btnModuloVentas) {
		this.btnModuloVentas = btnModuloVentas;
	}
	public JButton getBtnModuloReportes() {
		return btnModuloReportes;
	}
	public void setBtnModuloReportes(JButton btnModuloReportes) {
		this.btnModuloReportes = btnModuloReportes;
	}
}

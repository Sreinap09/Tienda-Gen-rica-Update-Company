package co.edu.unbosque.view;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class VentanaC extends JFrame{

	private PanelMenuPrincipal panMenuPrinc;
	private PanelMenuC panMenuC;
	private PanelCrearC panCrearC;
	private PanelActualizarC panActualizarC;
	private PanelBorrarC panBorrarC;
	private PanelMenuProv panMenuProv;
	private PanelMenuProd panMenuProd;
	private ParametrosTienda parTienda;
	private PanelVentas panVentas;
		
	public VentanaC(Controller control) {
		setTitle("Tienda Genérica");
		setSize(680, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		componentes(control);
	}

	public void componentes(Controller control) {
		panMenuPrinc = new PanelMenuPrincipal();
		panMenuPrinc.setBounds(15, 15, 580, 100);
		getContentPane().add(panMenuPrinc);
		
		panMenuC = new PanelMenuC();
		panMenuC.setBounds(15, 125, 220, 220);
		getContentPane().add(panMenuC);
		
		panCrearC = new PanelCrearC();
		panCrearC.setBounds(255, 135, 710, 200);
		getContentPane().add(panCrearC);
		
		panActualizarC = new PanelActualizarC();
		panActualizarC.setBounds(255, 135, 710, 200);
		getContentPane().add(panActualizarC);
		
		panBorrarC = new PanelBorrarC();
		panBorrarC.setBounds(255, 135, 710, 200);
		getContentPane().add(panBorrarC);		
	
		panMenuProv = new PanelMenuProv();
		panMenuProv.setBounds(15, 125, 220, 220);
		getContentPane().add(panMenuProv);
		
		panMenuProd = new PanelMenuProd();
		panMenuProd.setBounds(15, 125, 220, 220);
		getContentPane().add(panMenuProd);
		
		parTienda = new ParametrosTienda();
		parTienda.setBounds(15, 125, 800, 400);
		getContentPane().add(parTienda);
		
		panVentas = new PanelVentas();
		panVentas.setBounds(15, 125, 800, 400);
		getContentPane().add(panVentas);
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	
//	getters & setters		
	public PanelCrearC getPanCrearC() {
		return panCrearC;
	}

	public PanelVentas getPanVentas() {
		return panVentas;
	}

	public void setPanVentas(PanelVentas panVentas) {
		this.panVentas = panVentas;
	}

	public PanelMenuProd getPanMenuProd() {
		return panMenuProd;
	}

	public void setPanMenuProd(PanelMenuProd panMenuProd) {
		this.panMenuProd = panMenuProd;
	}

	public PanelMenuPrincipal getPanMenuPrinc() {
		return panMenuPrinc;
	}

	public void setPanMenuPrinc(PanelMenuPrincipal panMenuPrinc) {
		this.panMenuPrinc = panMenuPrinc;
	}

	public PanelMenuC getPanMenuC() {
		return panMenuC;
	}

	public void setPanMenuC(PanelMenuC panMenuC) {
		this.panMenuC = panMenuC;
	}

	public void setPanCrearC(PanelCrearC panCrearC) {
		this.panCrearC = panCrearC;
	}

	public PanelActualizarC getPanActualizarC() {
		return panActualizarC;
	}

	public void setPanActualizarC(PanelActualizarC panActualizarC) {
		this.panActualizarC = panActualizarC;
	}

	public PanelBorrarC getPanBorrarC() {
		return panBorrarC;
	}

	public void setPanBorrarC(PanelBorrarC panBorrarC) {
		this.panBorrarC = panBorrarC;
	}

	public PanelMenuProv getPanMenuProv() {
		return panMenuProv;
	}

	public void setPanMenuProv(PanelMenuProv panMenuProv) {
		this.panMenuProv = panMenuProv;
	}

	public ParametrosTienda getParTienda() {
		return parTienda;
	}

	public void setParTienda(ParametrosTienda parTienda) {
		this.parTienda = parTienda;
	}
	
}

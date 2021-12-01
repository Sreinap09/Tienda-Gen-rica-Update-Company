package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistence.Cliente;
import co.edu.unbosque.view.PanelCliente;
import co.edu.unbosque.view.VentanaC;

public class Controller implements ActionListener {

	private Binarios b;
	private VentanaC v;
	
	public Controller() {
		b = new Binarios();
		v = new VentanaC(this);
		v.setVisible(true);
		
		v.getPanMenuPrinc().getBtnModuloClientes().addActionListener(this);
		v.getPanMenuPrinc().getBtnModuloProv().addActionListener(this);
		v.getPanMenuPrinc().getBtnModuloProd().addActionListener(this);
		v.getPanMenuPrinc().getBtnConfig().addActionListener(this);
		v.getPanMenuPrinc().getBtnModuloVentas().addActionListener(this);
		v.getPanMenuC().getB1().addActionListener(this);
		v.getPanMenuC().getB2().addActionListener(this);
		v.getPanMenuC().getB3().addActionListener(this);
		v.getPanMenuC().getB4().addActionListener(this);
		v.getPanActualizarC().getBtnBuscar().addActionListener(this);
		
		v.getPanCrearC().getBtnCrearC().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
		String resultado;
		
		if(evento.getActionCommand().equals(v.getPanMenuPrinc().BMODCLIENTES)) {
			soloClientes();
			v.getPanMenuC().setVisible(true);
			
			
			}
		if(evento.getActionCommand().equals(v.getPanMenuC().BOTON1)) {
			v.getPanCrearC().setVisible(true);
		}
		if(evento.getActionCommand().equals(v.getPanCrearC().ESCRIBIR)) {
			System.out.println("aaaaaa");
			
			long cedL = Long.parseLong(v.getPanCrearC().getTxtCedula().getText());
			String nomS = v.getPanCrearC().getTxtNombre().getText();
			String dirS = v.getPanCrearC().getTxtDireccion().getText();
			long teleL = Long.parseLong(v.getPanCrearC().getTxtTelefono().getText());
			String corS = v.getPanCrearC().getTxtCorreo().getText();
						
//			b.getBf().getListaClientes().add(new Cliente(cedL, nomS, dirS, teleL, corS));
//			b.getBf().escribirCliente(b.getBf().getListaClientes().add(new Cliente(cedL, nomS, dirS, teleL, corS)));
			
			resultado = b.getBf().escribirCliente(cedL, nomS, dirS, teleL, corS);
			System.out.println(b.getBf().getListaClientes());
			v.mostrarMensaje(resultado);
		}
				
		if(evento.getActionCommand().equals(v.getPanMenuC().BOTON2)) {
			v.getPanCrearC().setVisible(false);
			v.getPanActualizarC().setVisible(false);
			v.getPanBorrarC().setVisible(false);
			
			v.mostrarMensaje(b.getBf().getListaClientes().toString()+ "\n");
		}
		
		if(evento.getActionCommand().equals(v.getPanMenuC().BOTON3)) {
			v.getPanActualizarC().setVisible(true);
			v.getPanCrearC().setVisible(false);
			v.getPanBorrarC().setVisible(false);			
			
		}
		
		if(evento.getActionCommand().equals(v.getPanActualizarC().BBUSCAR)) {
			long cedula = Long.parseLong(v.getPanActualizarC().getLblCedula().getText());
			JComboBox<String> datos = v.getPanActualizarC().getTxtDatos();			
			
		}
			
		if(evento.getActionCommand().equals(v.getPanMenuC().BOTON4)) {
			v.getPanBorrarC().setVisible(true);
			v.getPanCrearC().setVisible(false);
			v.getPanActualizarC().setVisible(false);
		
			if(evento.getActionCommand().equals(v.getPanBorrarC().BBORRAR)) {
				long cedula = Long.parseLong(v.getPanBorrarC().getLblCedula().getText());
				
				b.getBf().borrarCliente(cedula);
			}
		}
		
		
		
		
		if(evento.getActionCommand().equals(v.getPanMenuPrinc().BMODPROV)) {
			soloProv();
			v.getPanMenuProv().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(v.getPanMenuPrinc().BMODPROD)) {
			soloProd();
			v.getPanMenuProd().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(v.getPanMenuPrinc().BCONF)) {
			soloConf();
			v.getParTienda().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(v.getPanMenuPrinc().BMODVENTAS)) {
			soloVentas();
			v.getPanVentas().setVisible(true);
		}
		
	}
	
	public void soloProv() {
		v.getPanVentas().setVisible(false);
		v.getParTienda().setVisible(false);
		v.getPanMenuProd().setVisible(false);
		v.getPanMenuC().setVisible(false);
		v.getPanCrearC().setVisible(false);
		v.getPanActualizarC().setVisible(false);
		v.getPanBorrarC().setVisible(false);
	}
	
	public void soloClientes() {
		v.getPanVentas().setVisible(false);
		v.getParTienda().setVisible(false);
		v.getPanMenuProd().setVisible(false);
		v.getPanMenuProv().setVisible(false);
	}
	
	public void soloProd() {
		v.getPanVentas().setVisible(false);
		v.getParTienda().setVisible(false);
		v.getPanMenuProv().setVisible(false);
		v.getPanMenuC().setVisible(false);
		v.getPanCrearC().setVisible(false);
		v.getPanActualizarC().setVisible(false);
		v.getPanBorrarC().setVisible(false);
	}
	
	public void soloConf() {
		v.getPanVentas().setVisible(false);
		v.getPanMenuProv().setVisible(false);
		v.getPanMenuProd().setVisible(false);
		v.getPanMenuC().setVisible(false);
		v.getPanCrearC().setVisible(false);
		v.getPanActualizarC().setVisible(false);
		v.getPanBorrarC().setVisible(false);
	}
	
	public void soloVentas() {
		v.getPanMenuProv().setVisible(false);
		v.getPanMenuProd().setVisible(false);
		v.getPanMenuC().setVisible(false);
		v.getPanCrearC().setVisible(false);
		v.getPanActualizarC().setVisible(false);
		v.getPanBorrarC().setVisible(false);
		v.getParTienda().setVisible(false);
	}
}

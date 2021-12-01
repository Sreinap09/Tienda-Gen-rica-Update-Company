package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class BinariosFile {

	private String rutaClient = "./data/Clientes.out";
	private String rutaProv = "./data/Proveedores.out";
	
	private Cliente[] Cliente;
	private Proveedores[] Proveedores;
	private ArrayList<Cliente> listaClientes;
	
	private File f;
	private FileOutputStream fos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private DataInputStream dis;
	
	public BinariosFile() {
		Cliente = new Cliente[20];
		Proveedores = new Proveedores[20];
		listaClientes = new ArrayList<Cliente>();
	}	
	
	public String escribirCliente(long cedula, String nombre, String direccion, long telefono, String correo) {
		String mensaje = "Registro del cliente ingresado";
		listaClientes.add(new Cliente(cedula, nombre, direccion, telefono, correo));
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaClient));
			out.writeObject(listaClientes);		
			
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}		
		
		return mensaje;
	}
	
	public void leerCliente() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaClient));
			listaClientes = (ArrayList<Cliente>)in.readObject();
			in.close();
			
			for(int i = 0; i < listaClientes.size(); i++) {
				System.out.println(listaClientes.get(i));				
			}			
		}
		catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public void actualizarCliente(long cedula, JComboBox<String> datos) {
				
		if(listaClientes.contains(cedula)) {
			
		}
	}
	
	public String borrarCliente(long cedula) {
		System.out.println("eeee");
		String respuesta;
		if(listaClientes.contains(cedula)) {
			listaClientes.remove(cedula);
			respuesta = "Cliente eliminado";
		}
		respuesta = "No se encuentra el cliente";
		
		return respuesta;
	}
	
	public String escribirProveedores() {
		String mensaje = "Registro de proveedor ingresado.";
		Proveedores staff[] = new Proveedores[1];
		staff[0] = new Proveedores(mensaje, mensaje, mensaje, 0, mensaje);
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaProv));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error del IO";
		}		
		
		return mensaje;
	}
	
	public void leerProveedor() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaProv));
			Proveedores = (Proveedores[])in.readObject();
			in.close();
			for(int i = 0; i > Proveedores.length; i++) {
				System.out.println(Proveedores[i].getNit());
				System.out.println(Proveedores[i].getNombreProveedores());
				System.out.println(Proveedores[i].getDireccion());
				System.out.println(Proveedores[i].getTelefono());
				System.out.println(Proveedores[i].getCiudad());
			}
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
//	getters & setters
	public String getRutaClient() {
		return rutaClient;
	}
	public void setRutaClient(String rutaClient) {
		this.rutaClient = rutaClient;
	}
	public String getRutaProv() {
		return rutaProv;
	}
	public void setRutaProv(String rutaProv) {
		this.rutaProv = rutaProv;
	}
	public Cliente[] getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente[] cliente) {
		Cliente = cliente;
	}
	public Proveedores[] getProveedores() {
		return Proveedores;
	}
	public void setProveedores(Proveedores[] proveedores) {
		Proveedores = proveedores;
	}
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}

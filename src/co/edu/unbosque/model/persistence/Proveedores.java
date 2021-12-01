package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Proveedores implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nit;
	private String nombreProveedores;
	private String direccion;
	private long telefono;
	private String ciudad;
	
	public Proveedores(String nit, String nombreProveedores, String direccion, long telefono, String ciudad) {
		this.nit = nit;
		this.nombreProveedores = nombreProveedores;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

//	getters & setters
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombreProveedores() {
		return nombreProveedores;
	}

	public void setNombreProveedores(String nombreProveedores) {
		this.nombreProveedores = nombreProveedores;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Proveedores [NIT=" + nit + ", Nombre Proveedores=" + nombreProveedores + ", Dirección=" + direccion
				+ ", telefono=" + telefono + ", ciudad=" + ciudad + "]";
	}
}

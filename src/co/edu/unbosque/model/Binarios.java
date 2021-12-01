package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;

public class Binarios {

	private BinariosFile bf;
	
	public Binarios() {
		bf = new BinariosFile();
	}

	public BinariosFile getBf() {
		return bf;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}
}

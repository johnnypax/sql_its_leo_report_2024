package com.ferramenta.lez00_gestore_clienti;

public class Bottiglia {

	private String marca;
	private String contenuto;
	private String colore;
	private float capacita;
	
	public void setCapacita(float varCapa) {
		if(varCapa > 0 && varCapa < 999) {
			capacita = varCapa;
		}
	}
	
	public float getCapacita() {
		return capacita;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	

	
	
}

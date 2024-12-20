package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prod_parquet {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	long id;
	
	String nome;
	String materiale;
	String collezione;
	String descrizione;
	double prezzo;
	String url;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateriale() {
		return materiale;
	}
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	public String getCollezione() {
		return collezione;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setCollezione(String collezione) {
		this.collezione = collezione;
	}
	
	

}

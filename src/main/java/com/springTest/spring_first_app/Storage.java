package com.springTest.spring_first_app;

public class Storage {

	private String nom;
	private String prenom;

	public Storage(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}

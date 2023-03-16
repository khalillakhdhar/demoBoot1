package com.demo.model;
// boilerplatCode
public class User {
private String nom,prenom;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}

@Override
public String toString() {
	return "User [nom=" + nom + ", prenom=" + prenom + "]";
}


}

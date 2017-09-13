package com.maven.FilRouge.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe de gestion des agences
 * @author Alexandre
 *
 */
public class Agence {
	private String numAuth, dateCreation;
	private List<Employe> employes = new ArrayList<Employe>();

	public String getNumAuth() {
		return numAuth;
	}

	public void setNumAuth(String numAuth) {
		this.numAuth = numAuth;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
}

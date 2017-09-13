package com.maven.FilRouge.metier;
/**
 * Classe de gestion des comptes
 * @author Alexandre
 *
 */
public class Compte {
	private int idCompte;
	
	private long numCompte;
	private double solde;
	private String dateOuverture;
	private Client client;
	private CB carte;
	
	
	public CB getCarte() {
		return carte;
	}
	public void setCarte(CB carte) {
		this.carte = carte;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture="
				+ dateOuverture + ", client=" + client + ", carte=" + carte + "]";
	}
	
	
}

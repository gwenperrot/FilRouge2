package com.maven.FilRouge.metier;
/**
 * Classe de gestion des comptes épargnes
 * @author Alexandre
 *
 */
public class CompteEpargne extends Compte {
	private float tauxEpargne = 3/100;

	public float getTauxEpargne() {
		return tauxEpargne;
	}

	public void setTauxEpargne(float tauxEpargne) {
		this.tauxEpargne = tauxEpargne;
	}
	
}

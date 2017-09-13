package com.maven.FilRouge.metier;
/**
 * Classe de gestion des cartes bancaires
 * @author Alexandre
 *
 */
public abstract class CB {
	private long numCB;
	private Compte compte;

	public long getNumCB() {
		return numCB;
	}

	public void setNumCB(long numCB) {
		this.numCB = numCB;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}

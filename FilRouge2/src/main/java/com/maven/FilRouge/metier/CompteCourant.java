package com.maven.FilRouge.metier;
/**
 * Classe de gestion des comptes courants
 * @author Alexandre
 *
 */
public class CompteCourant extends Compte {
	private int decouvert = 1_000;

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}
	
}

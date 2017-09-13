package com.maven.FilRouge.service;

import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
/**
 * Interface faisant le lien entre la couche pr�sentation et la couche dao pour les conseillers
 * @author Alexandre
 *
 */
public interface IConseiller {

	public void seconnecter(String login, String mdp);	
	
	public void creerClient(Client c);
	public void lireClient(Client c);
	public void modifierClient(Client c);
	public void supprimerClient(Client c);
	
	public void creerCompte(Compte c);
	public Compte lireCompte(int idCompte);
	public void modifierCompte(Compte c);
	public void supprimerCompte(int idCompte);
	public void faireVirement(Compte c);
	public void simuler();
	public void placerArgent(float montant, Compte c);
	public void attribuerClient(Client cl, Compte c);
	public void ajouterCompte(Compte c, Client cl);
	public void attibuerConseiller(Conseiller c, Client cl);
	public void ajouterClient(Client cl, Conseiller c);

}

package com.maven.FilRouge.dao;

import com.maven.FilRouge.metier.Agence;
import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Employe;
import com.maven.FilRouge.metier.Gerant;
/**
 * Interface faisant le lien avec la couche Service
 * @author Alexandre
 *
 */
public interface Idao {

	public void seconnecter(String login, String mdp);

	public void creerClient(Client c);
	public void lireClient(Client c);
	public void modifierClient(Client c);
	public void supprimerClient(Client c);
	
	public void creerConseiller(Conseiller c);
	public void lireConseiller(Conseiller c);
	public void modifierConseiller(Conseiller c);
	public void supprimerConseiller(Conseiller c);
	public void attribuerAgence(Agence a, Employe e);
	public void ajouterEmploye(Employe e, Agence a);
	public void attribuerGerant(Gerant g, Conseiller c);
	public void ajouterConseiller(Conseiller c, Gerant g);
	
	public void creerCompte(Compte c);
	public Compte lireCompte(int idCompte);
	public void modifierCompte(int idCompte, double solde, int decouvert, float tauxEpargne);
	public void supprimerCompte(int idCompte);
	public Compte getCompte(int idCompte);
	public void faireVirement(Compte c);
	public void simuler();
	public void placerArgent(float montant, Compte c);
	public void attribuerClient(Client cl, Compte c);
	public void ajouterCompte(Compte c, Client cl);
	public void attibuerConseiller(Conseiller c, Client cl);
	public void ajouterClient(Client cl, Conseiller c);

	public void auditer();

}

package com.maven.FilRouge.service;

import com.maven.FilRouge.dao.Dao;
import com.maven.FilRouge.dao.Idao;
import com.maven.FilRouge.metier.Agence;
import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Employe;
import com.maven.FilRouge.metier.Gerant;
/**
 * Classe regroupant les m�thodes utilisables par les g�rants
 * @author Alexandre
 *
 */
public class GerantImpl implements IGerant {

	private Idao dao = new Dao(); //je d�clare l'interface et je l'initialise avec la classe

	/**
	 * M�thode permettant � un g�rant de cr�er un client
	 */
	@Override
	public void creerClient(Client c) {
		dao.creerClient(c);		
	}

	/**
	 * M�thode permettant � un g�rant de lire les informations d'un client
	 */
	@Override
	public void lireClient(Client c) {
		dao.lireClient(c);		
	}

	/**
	 * M�thode permettant � un g�rant de modifier les informations d'un client
	 */
	@Override
	public void modifierClient(Client c) {
		dao.modifierClient(c);			
	}

	/**
	 * M�thode permettant � un g�rant de supprimer un client
	 */
	@Override
	public void supprimerClient(Client c) {
		dao.supprimerClient(c);			
	}

	/**
	 * M�thode permettant � un ferant de cr�er un compte bancaire
	 */
	@Override
	public void creerCompte(Compte c) {
		dao.creerCompte(c);		
	}

	/**
	 * M�thode permettant � un g�rant de lire les caract�ristiques d'un compte bancaire
	 */
	@Override
	public Compte lireCompte(int idCompte) {
		return dao.lireCompte(idCompte);			
	}

	/**
	 * M�thode permettant � un g�rant de modifier les caract�ristiques d'un compte bancaire
	 */
	@Override
	public void modifierCompte(int idCompte, double solde, int decouvert, float tauxEpargne) {
		dao.modifierCompte(idCompte, solde, decouvert, tauxEpargne);			
	}
	
	@Override
	public void modifierCompte(int idCompte, double solde) {
		dao.modifierCompte(idCompte, solde);			
	}

	/**
	 * M�thode permettant � un g�rant de supprimer un compte bancaire
	 */
	@Override
	public void supprimerCompte(int idCompte) {
		dao.supprimerCompte(idCompte);			
	}

	/**
	 * M�thode permettant � un g�rant de faire un virement depuis un compte bancaire
	 */
	@Override
	public void faireVirement(Compte c) {
		dao.faireVirement(c);			
	}

	/**
	 * M�thode permettant � un g�rant de simuler un cr�dit
	 */
	@Override
	public void simuler() {
		dao.simuler();			
	}

	/**
	 * M�thode permettant � un g�rant de placer de l'argent en bourse
	 */
	@Override
	public void placerArgent(float montant, Compte c) {
		dao.placerArgent(montant, c);			
	}

	/**
	 * M�thode permettant � un g�rant d'avoir acc�s au logiciel
	 */
	@Override
	public void seconnecter(String login, String mdp) {
		dao.seconnecter(login, mdp);		
	}

	/**
	 * M�thode permettant � un g�rant de cr�er un conseiller
	 */
	@Override
	public void creerConseiller(Conseiller c) {
		dao.creerConseiller(c);		
	}

	/**
	 * M�thode permettant � un g�rant de lire les informations d'un conseiller
	 */
	@Override
	public Conseiller lireConseiller(int id) {
		return dao.lireConseiller(id);		
	}
	
	/**
	 * M�thode permettant � un g�rant de modifier les informations d'un conseiller
	 */
	@Override
	public void modifierConseiller(int id, String nom, String prenom, String login, String mdp, String email) {
		dao.modifierConseiller(id, nom, prenom, login, mdp, email);			
	}

	/**
	 * M�thode permettant � un g�rant de supprimer un conseiller
	 */
	@Override
	public void supprimerConseiller(Conseiller c) {
		dao.supprimerConseiller(c);		
	}

	/**
	 * M�thode permettant � un g�rant d'attribuer un client � un compte bancaire
	 */
	@Override
	public void attribuerClient(Client cl, Compte c) {
		dao.attribuerClient(cl, c);
	}

	/**
	 * M�thode permettant � un g�rant d'ajouter un compte bancaire � un client
	 */
	@Override
	public void ajouterCompte(Compte c, Client cl) {
		dao.ajouterCompte(c, cl);
	}

	/**
	 * M�thode permettant � un g�rant d'attribuer un conseiller � un client
	 */
	@Override
	public void attibuerConseiller(Conseiller c, Client cl) {
		dao.attibuerConseiller(c, cl);
	}

	/**
	 * M�thode permettant � un g�rant d'ajouter un client � un conseiller
	 */
	@Override
	public void ajouterClient(Client cl, Conseiller c) {
		dao.ajouterClient(cl, c);
	}

	/**
	 * M�thode permettant � un g�rant d'attribuer une agence � un employ�
	 */
	@Override
	public void attribuerAgence(Agence a, Employe e) {
		dao.attribuerAgence(a, e);
	}

	/**
	 * M�thode permettant � un g�rant d'ajouter un employ� � une agence
	 */
	@Override
	public void ajouterEmploye(Employe e, Agence a) {
		dao.ajouterEmploye(e, a);
	}

	/**
	 * M�thode permettant � un g�rant d'attribuer un g�rant � un conseiller
	 */
	@Override
	public void attribuerGerant(Gerant g, Conseiller c) {
		dao.attribuerGerant(g, c);
	}

	/**
	 * M�thode permettant � un g�rant d'ajouter un conseiller � un g�rant
	 */
	@Override
	public void ajouterConseiller(Conseiller c, Gerant g) {
		dao.ajouterConseiller(c, g);
	}

	@Override
	public Compte getCompte(int idCompte) {
		return dao.getCompte(idCompte);
	}
	
}

package com.maven.FilRouge.service;

import com.maven.FilRouge.dao.Dao;
import com.maven.FilRouge.dao.Idao;
import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
/**
 * Classe regroupant les m�thodes utilisables par les conseillers
 * @author Alexandre
 *
 */
public class ConseillerImpl implements IConseiller {

	private Idao dao = new Dao(); //je d�clare l'interface et je l'initialise avec la classe

	/**
	 * M�thode permettant � un conseiller d'avoir acc�s au logiciel
	 */
	@Override
	public void seconnecter(String login, String mdp) {
		dao.seconnecter(login, mdp);	
	}

	/**
	 * M�thode permettant � un conseiller de cr�er un nouveau client
	 */
	@Override
	public void creerClient(Client c) {
		dao.creerClient(c);		
	}

	/**
	 * M�thode permettant � un conseiller de lire les informations d'un client
	 */
	@Override
	public void lireClient(Client c) {
		dao.lireClient(c);	
	}

	/**
	 * M�thode permettant � un conseiller de modifier les informations d'un client
	 */
	@Override
	public void modifierClient(Client c) {
		dao.modifierClient(c);			
	}

	/**
	 * M�thode permettant � un conseiller de supprimer un client
	 */
	@Override
	public void supprimerClient(Client c) {
		dao.supprimerClient(c);			
	}

	/**
	 * M�thode permettant � un conseiller de cr�er un compte bancaire
	 */
	@Override
	public void creerCompte(Compte c) {
		dao.creerCompte(c);			
	}

	/**
	 * M�thode permettant � un conseiller de lire les caract�ristiques d'un compte bancaire
	 */
	@Override
	public Compte lireCompte(int idCompte) {
		
		return dao.lireCompte(idCompte);
		
	}

	/**
	 * M�thode permettant � un conseiller de modifier les caract�ristiques d'un compte bancaire
	 */
	@Override
	public void modifierCompte(int idCompte, double solde) {
		dao.modifierCompte(idCompte, solde);			
	}

	/**
	 * M�thode permettant � un conseiller de supprimer un compte bancaire
	 */
	@Override
	public void supprimerCompte(Compte c) {
		dao.supprimerCompte(c);	
	}

	/**
	 * M�thode permettant � un conseiller de faire un virement depuis un compte bancaire
	 */
	@Override
	public void faireVirement(Compte c) {
		dao.faireVirement(c);			
	}

	/**
	 * M�thode permettant � un conseiller de simuler un cr�dit
	 */
	@Override
	public void simuler() {
		dao.simuler();			
	}

	/**
	 * M�thode permettant � un conseiller de placer de l'argent en bourse
	 */
	@Override
	public void placerArgent(float montant, Compte c) {
		dao.placerArgent(montant, c);	
	}

	/**
	 * M�thode permettant � un conseiller d'attribuer un client � un compte bancaire
	 */
	@Override
	public void attribuerClient(Client cl, Compte c) {
		dao.attribuerClient(cl, c);		
	}

	/**
	 * M�thode permettant � un conseiller d'ajouter un compte bancaire � un client
	 */
	@Override
	public void ajouterCompte(Compte c, Client cl) {
		dao.ajouterCompte(c, cl);		
	}

	/**
	 * M�thode permettant � un conseiller d'attribuer un conseiller � un client
	 */
	@Override
	public void attibuerConseiller(Conseiller c, Client cl) {
		dao.attibuerConseiller(c, cl);
	}

	/**
	 * M�thode permettant � un conseiller d'ajouter un client � un conseiller
	 */
	@Override
	public void ajouterClient(Client cl, Conseiller c) {
		dao.ajouterClient(cl, c);
	}
	
}

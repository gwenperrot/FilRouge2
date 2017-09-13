package com.maven.FilRouge.service;

import com.maven.FilRouge.dao.Dao;
import com.maven.FilRouge.dao.Idao;
/**
 * Classe regroupant les m�thodes utilisables par les auditeurs
 * @author Alexandre
 *
 */
public class AuditeurImpl implements IAuditeur {

	private Idao dao = new Dao(); //je d�clare l'interface et je l'initialise avec la classe

	/**
	 * M�thode permettant � l'auditeur de realiser l'audit de chaque agence
	 */
	@Override
	public void auditer() {
		dao.auditer();
	}

	/**
	 * M�thode permettant � l'auditeur de s'identifier pour avoir acc�s au logiciel
	 */
	@Override
	public void seconnecter(String login, String mdp) {
		dao.seconnecter(login, mdp);
	}

}

package com.maven.FilRouge.service;
/**
 * Interface faisant le lien entre la couche pr�sentation et la couche dao pour les auditeurs
 * @author Alexandre
 *
 */
public interface IAuditeur {

	public void seconnecter(String login, String mdp);	
	public void auditer();

}

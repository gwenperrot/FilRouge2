package com.maven.FilRouge.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe de gestion des employ�s de type conseillers
 * @author Alexandre
 *
 */
public class Conseiller extends Employe {
	private Gerant gerant;
	private List<Client> clients = new ArrayList<Client>();

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
}

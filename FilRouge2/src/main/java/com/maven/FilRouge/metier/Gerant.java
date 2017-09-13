package com.maven.FilRouge.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe de gestion des employ�s de type g�rants
 * @author Alexandre
 *
 */
public class Gerant extends Employe {
	private List<Conseiller> conseillers = new ArrayList<Conseiller>();

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
	
}

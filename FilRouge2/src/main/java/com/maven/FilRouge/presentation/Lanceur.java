package com.maven.FilRouge.presentation;

import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.service.AuditeurImpl;
import com.maven.FilRouge.service.ConseillerImpl;
import com.maven.FilRouge.service.GerantImpl;
import com.maven.FilRouge.service.IAuditeur;
import com.maven.FilRouge.service.IConseiller;
import com.maven.FilRouge.service.IGerant;

public class Lanceur {

	public static void main(String[] args) {
	
		IAuditeur ia = new AuditeurImpl();
		IConseiller ic = new ConseillerImpl();
		IGerant ig = new GerantImpl();
		
		Compte c = new Compte();
	//	c.setNumCompte(234234);
	//	c.setDateOuverture("12/12/12");
	//	c.setSolde((float)5000.0);
	//	ic.creerCompte(c);
	//	ic.supprimerCompte(1);
		//System.out.println(ic.lireCompte(1));
		
		
		/*Fenetre f = new Fenetre();
		f.setVisible(true);*/
	}

}

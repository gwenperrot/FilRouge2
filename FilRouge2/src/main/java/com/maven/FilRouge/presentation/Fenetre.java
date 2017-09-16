package com.maven.FilRouge.presentation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.CompteCourant;
import com.maven.FilRouge.metier.CompteEpargne;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Particulier;
import com.maven.FilRouge.service.AuditeurImpl;
import com.maven.FilRouge.service.ConseillerImpl;
import com.maven.FilRouge.service.GerantImpl;
import com.maven.FilRouge.service.IAuditeur;
import com.maven.FilRouge.service.IConseiller;
import com.maven.FilRouge.service.IGerant;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = -7186476640084782248L;

	private IAuditeur ia = new AuditeurImpl();
	private IConseiller ic = new ConseillerImpl();
	private IGerant ig = new GerantImpl();
	private CompteCourantModele CCModele;
	private CompteEpargneModele CEModele;
	private JScrollPane jsp;
	
	//Structure onglets
	JTabbedPane ongletGestionClient = new JTabbedPane();
		private JPanel ongletCreerClient = new JPanel();
		private JPanel ongletLireClient = new JPanel();
		private JPanel ongletModifierClient = new JPanel();
		private JPanel ongletSupprimerClient = new JPanel();
		private JPanel ongletAttribuerConseiller= new JPanel();

	JTabbedPane ongletGestionConseiller = new JTabbedPane();
		private JPanel ongletCreerConseiller = new JPanel();
		private JPanel ongletLireConseiller = new JPanel();
		private JPanel ongletModifierConseiller = new JPanel();
		private JPanel ongletSupprimerConseiller = new JPanel();
		private JPanel ongletAttribuerAgence = new JPanel();
		private JPanel ongletAjouterEmploye = new JPanel();
		private JPanel ongletAttribuerGerant = new JPanel();
		private JPanel ongletAjouterConseiller = new JPanel();
		private JPanel ongletAjouterClient= new JPanel();

	JTabbedPane ongletGestionCompte = new JTabbedPane();
		private JPanel ongletCreerCompte = new JPanel();
		private JPanel ongletLireCompte = new JPanel();
		private JPanel ongletModifierCompte = new JPanel();
		private JPanel ongletSupprimerCompte = new JPanel();
		private JPanel ongletFaireVirement = new JPanel();
		private JPanel ongletSimuler= new JPanel();
		private JPanel ongletPlacerArgent = new JPanel();
		private JPanel ongletAttribuerClient = new JPanel();
		private JPanel ongletAjouterCompte = new JPanel();

	private JPanel ongletAudition = new JPanel();	
	
	//Structure intra-onglets
	//Gestion Client
		//Gestion Client - Création
	private JLabel tnomCl = new JLabel("Nom");
	private JLabel tprenomCl = new JLabel("Prénom");
	private JLabel tadresseCl = new JLabel("Adresse");
	private JLabel tcodePostalCl = new JLabel("Code postal");
	private JLabel tvilleCl = new JLabel("Ville");
	private JLabel ttelephoneCl = new JLabel("Téléphone");
	private JLabel jeventCl = new JLabel("");
	private JTextField jtnomCl = new JTextField(12);
	private JTextField jtprenomCl = new JTextField(12);
	private JTextField jtadresseCl = new JTextField(12);
	private JTextField jtcodePostalCl = new JTextField(12);
	private JTextField jtvilleCl = new JTextField(12);
	private JTextField jttelephoneCl = new JTextField(12);
	private JButton bCl = new JButton("Valider");

	//Gestion Conseiller
		//Gestion Conseiller - Création
	private JLabel tnomCo = new JLabel("Nom");
	private JLabel tprenomCo = new JLabel("Prénom");
	private JLabel tloginCo = new JLabel("Login");
	private JLabel tmdpCo = new JLabel("MdP");
	private JLabel temailCo = new JLabel("Email");
	private JLabel jeventCo = new JLabel("");
	private JTextField jtnomCo = new JTextField(12);
	private JTextField jtprenomCo = new JTextField(12);
	private JTextField jtloginCo = new JTextField(12);
	private JTextField jtmdpCo = new JTextField(12);
	private JTextField jtemailCo = new JTextField(12);
	private JButton bCo = new JButton("Valider");
	
	//Gestion Compte
		//Gestion Compte - Création
	private JLabel tnumCp = new JLabel("Numéro");
	private JLabel tsoldeCp = new JLabel("Solde");
	private JLabel tdateOuvertureCp = new JLabel("Date d'ouverture");
	private JLabel tdecouvertCp = new JLabel("Découvert");
	private JLabel ttauxCp = new JLabel("Taux d'épargne");
	private JLabel jeventCp = new JLabel("");
	private JTextField jtnumCp = new JTextField(12);
	private JTextField jtsoldeCp = new JTextField(12);
	private JTextField jtdateOuvertureCp = new JTextField(12);
	private JTextField jtdecouvertCp = new JTextField(12);
	private JTextField jttauxCp = new JTextField(12);
	private JButton bCp = new JButton("Valider");
		//Gestion Compte - Lire
	private JLabel tidCp1 = new JLabel("ID");
	private JLabel tnumCp1 = new JLabel("Numéro");
	private JLabel jeventCp1 = new JLabel("");
	private JTextField jtidCp1 = new JTextField(12);
	private JTextField jtnumCp1 = new JTextField(12);
	private JButton bCp1 = new JButton("Valider");
		//Gestion Compte - Modifier
	private JLabel tidCp2 = new JLabel("ID");
	private JLabel tnumCp2 = new JLabel("Numéro");
	private JLabel tsoldeCp2 = new JLabel("Solde");
	private JLabel tdecouvertCp2 = new JLabel("Découvert");
	private JLabel ttauxCp2 = new JLabel("Taux d'épargne");
	private JLabel jeventCp2 = new JLabel("");
	private JTextField jtidCp2 = new JTextField(12);
	private JTextField jtnumCp2 = new JTextField(12);
	private JTextField jtsoldeCp2 = new JTextField(12);
	private JTextField jtdecouvertCp2 = new JTextField(12);
	private JTextField jttauxCp2 = new JTextField(12);
	private JButton bCp2 = new JButton("Valider");
		//Gestion Compte - Supprimer
	private JLabel tidCp3 = new JLabel("ID");
	private JLabel jeventCp3 = new JLabel("");
	private JLabel tnumCp3 = new JLabel("Numéro");
	private JTextField jtidCp3 = new JTextField(12);
	private JTextField jtnumCp3 = new JTextField(12);
	private JButton bCp3 = new JButton("Valider");

	public Fenetre() {
		
		setTitle("ProxyBanque");//Titre de la fenêtre
		setSize(800, 600);//Taille de la fenêtre en pixels
		setResizable(true);//On autorise la fenêtre à être redimensionnée
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Un clic sur la croix arrête le processus d'affichage de la fenêtre
		setLocationRelativeTo(null);//Pour centrer la fenêtre
		//Création ongletGestionClient
		ongletCreerClient.add(tnomCl);
		ongletCreerClient.add(jtnomCl);
		ongletCreerClient.add(tprenomCl);
		ongletCreerClient.add(jtprenomCl);
		ongletCreerClient.add(tadresseCl);
		ongletCreerClient.add(jtadresseCl);
		ongletCreerClient.add(tcodePostalCl);
		ongletCreerClient.add(jtcodePostalCl);
		ongletCreerClient.add(tvilleCl);
		ongletCreerClient.add(jtvilleCl);
		ongletCreerClient.add(ttelephoneCl);
		ongletCreerClient.add(jttelephoneCl);
		ongletCreerClient.add(bCl);
		ongletCreerClient.add(jeventCl);
		ongletGestionClient.addTab("Créer", ongletCreerClient);
		ongletGestionClient.addTab("Lire", ongletLireClient);
		ongletGestionClient.addTab("Modifier", ongletModifierClient);
		ongletGestionClient.addTab("Supprimer", ongletSupprimerClient);
		ongletGestionClient.addTab("Attribuer Conseiller", ongletAttribuerConseiller);

		//Création ongletGestionConseiller
			//Création ongletcréerconseiller
		ongletCreerConseiller.add(tnomCo);
		ongletCreerConseiller.add(jtnomCo);
		ongletCreerConseiller.add(tprenomCo);
		ongletCreerConseiller.add(jtprenomCo);
		ongletCreerConseiller.add(tloginCo);
		ongletCreerConseiller.add(jtloginCo);
		ongletCreerConseiller.add(tmdpCo);
		ongletCreerConseiller.add(jtmdpCo);
		ongletCreerConseiller.add(temailCo);
		ongletCreerConseiller.add(jtemailCo);
		ongletCreerConseiller.add(bCo);
		ongletCreerConseiller.add(jeventCo);
		ongletGestionConseiller.addTab("Créer", ongletCreerConseiller);
		ongletGestionConseiller.addTab("Lire", ongletLireConseiller);
		ongletGestionConseiller.addTab("Modifier", ongletModifierConseiller);
		ongletGestionConseiller.addTab("Supprimer", ongletSupprimerConseiller);
		ongletGestionConseiller.addTab("Attribuer Agence", ongletAttribuerAgence);
		ongletGestionConseiller.addTab("Ajouter employé", ongletAjouterConseiller);
		ongletGestionConseiller.addTab("Attribuer Gérant", ongletAttribuerGerant);
		ongletGestionConseiller.addTab("Ajouter Conseiller", ongletAjouterConseiller);
		ongletGestionConseiller.addTab("Ajouter Client", ongletAjouterClient);
		
		//Création ongletGestionCompte
			//Création ongletcréercompte
		ongletCreerCompte.add(tnumCp);
		ongletCreerCompte.add(jtnumCp);
		ongletCreerCompte.add(tsoldeCp);
		ongletCreerCompte.add(jtsoldeCp);
		ongletCreerCompte.add(tdateOuvertureCp);
		ongletCreerCompte.add(jtdateOuvertureCp);
		ongletCreerCompte.add(tdecouvertCp);
		ongletCreerCompte.add(jtdecouvertCp);
		ongletCreerCompte.add(ttauxCp);
		ongletCreerCompte.add(jttauxCp);
		ongletCreerCompte.add(bCp);
		ongletCreerCompte.add(jeventCp);
			//Création ongletLireCompte
		JPanel ongletLireCompten = new JPanel();
		JPanel ongletLireComptes = new JPanel();
		ongletLireCompte.setLayout(new BorderLayout());
		ongletLireCompten.add(tidCp1);
		ongletLireCompten.add(jtidCp1);
		ongletLireCompten.add(tnumCp1);
		ongletLireCompten.add(jtnumCp1);
		ongletLireCompten.add(bCp1);
		ongletLireComptes.add(jeventCp1);
		ongletLireCompte.add(ongletLireCompten, BorderLayout.NORTH);
		ongletLireCompte.add(ongletLireComptes, BorderLayout.SOUTH);
			//Création ongletModifierCompte
		JPanel ongletModifierCompten = new JPanel();
		JPanel ongletModifierComptec = new JPanel();
		JPanel ongletModifierComptes = new JPanel();
		ongletModifierCompte.setLayout(new BorderLayout());
		ongletModifierCompten.add(tidCp2);
		ongletModifierCompten.add(jtidCp2);
		ongletModifierCompten.add(tnumCp2);
		ongletModifierCompten.add(jtnumCp2);
		ongletModifierComptec.add(tsoldeCp2);
		ongletModifierComptec.add(jtsoldeCp2);
		ongletModifierComptec.add(tdecouvertCp2);
		ongletModifierComptec.add(jtdecouvertCp2);
		ongletModifierComptec.add(ttauxCp2);
		ongletModifierComptec.add(jttauxCp2);
		ongletModifierComptec.add(bCp2);
		ongletModifierComptes.add(jeventCp2);
		ongletModifierCompte.add(ongletModifierCompten, BorderLayout.NORTH);
		ongletModifierCompte.add(ongletModifierComptec, BorderLayout.CENTER);
		ongletModifierCompte.add(ongletModifierComptes, BorderLayout.SOUTH);

			//Création ongletSupprimerCompte
		JPanel ongletSupprimerCompten = new JPanel();
		JPanel ongletSupprimerComptec = new JPanel();
		JPanel ongletSupprimerComptes = new JPanel();
		ongletSupprimerCompte.setLayout(new BorderLayout());
		ongletSupprimerCompten.add(tidCp3);
		ongletSupprimerCompten.add(jtidCp3);
		ongletSupprimerCompten.add(tnumCp3);
		ongletSupprimerCompten.add(jtnumCp3);
		ongletSupprimerCompten.add(bCp3);
		ongletSupprimerComptes.add(jeventCp3);
		ongletSupprimerCompte.add(ongletSupprimerCompten, BorderLayout.NORTH);
		ongletSupprimerCompte.add(ongletSupprimerComptec, BorderLayout.CENTER);
		ongletSupprimerCompte.add(ongletSupprimerComptes, BorderLayout.SOUTH);
			//Ajout des onglets du compte
		ongletGestionCompte.addTab("Créer", ongletCreerCompte);
		ongletGestionCompte.addTab("Lire", ongletLireCompte);
		ongletGestionCompte.addTab("Modifier", ongletModifierCompte);
		ongletGestionCompte.addTab("Supprimer", ongletSupprimerCompte);
		ongletGestionCompte.addTab("Faire Virement", ongletFaireVirement);
		ongletGestionCompte.addTab("Simuler", ongletSimuler);
		ongletGestionCompte.addTab("Placer Bourse", ongletPlacerArgent);
		ongletGestionCompte.addTab("Attribuer Client", ongletAttribuerClient);
		ongletGestionCompte.addTab("Ajouter Compte", ongletAjouterCompte);
		/*
		//Création ongletAudition
	    onglet4.setLayout(new BorderLayout());
		onglet4h.add(tmc4);
		onglet4h.add(jtmc4);
		onglet4h.add(b4);
		model = new PersonneModele();
		jTablePersonnes = new JTable(model);
		jsp = new JScrollPane(jTablePersonnes);
		onglet4.add(onglet4h, BorderLayout.NORTH);
		onglet4.add(jsp, BorderLayout.CENTER);
		*/
		//Les onglets
		JTabbedPane onglets = new JTabbedPane();
		onglets.addTab("Gestion Client", ongletGestionClient);
		onglets.addTab("Gestion Conseiller", ongletGestionConseiller);
		onglets.addTab("Gestion Compte", ongletGestionCompte);
		onglets.addTab("Audition", ongletAudition);
		
		bCl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Client c = new Particulier();
				c.setNom(jtnomCl.getText());
				c.setPrenom(jtprenomCl.getText());
				c.setAdresse(jtadresseCl.getText());
				c.setCodePostal(jtcodePostalCl.getText());
				c.setVille(jtvilleCl.getText());
				c.setTelephone(jttelephoneCl.getText());
				ic.creerClient(c);
				jtnomCl.setText("");
				jtprenomCl.setText("");
				jtcodePostalCl.setText("");
				jtvilleCl.setText("");
				jttelephoneCl.setText("");
				jeventCl.setText("Le client "+c.getNom()+" "+c.getPrenom()+" a été créé");
			}
		});
		
		bCo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Conseiller c = new Conseiller();
				c.setNom(jtnomCo.getText());
				c.setPrenom(jtprenomCo.getText());
				c.setLogin(jtloginCo.getText());
				c.setMdp(jtmdpCo.getText());
				c.setEmail(jtemailCo.getText());
				ig.creerConseiller(c);
				jtnomCo.setText("");
				jtprenomCo.setText("");
				jtloginCo.setText("");
				jtmdpCo.setText("");
				jtemailCo.setText("");
				jeventCo.setText("Le conseiller "+c.getNom()+" "+c.getPrenom()+" a été créé");
			}
		});
		
		bCp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!"".equals(jtdecouvertCp.getText())) {
					CompteCourant c = new CompteCourant();
					c.setDecouvert(Integer.parseInt(jtdecouvertCp.getText()));
					c.setNumCompte(Long.parseLong(jtnumCp.getText()));
					c.setSolde(Float.parseFloat(jtsoldeCp.getText()));
					c.setDateOuverture(jtdateOuvertureCp.getText());
					ic.creerCompte(c);
					jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
				}
				else {
					CompteEpargne c = new CompteEpargne();
					c.setTauxEpargne(Float.parseFloat(jttauxCp.getText()));
					c.setNumCompte(Long.parseLong(jtnumCp.getText()));
					c.setSolde(Float.parseFloat(jtsoldeCp.getText()));
					c.setDateOuverture(jtdateOuvertureCp.getText());
					ic.creerCompte(c);
					jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
				}
				jtnumCp.setText("");
				jtsoldeCp.setText("");
				jtdateOuvertureCp.setText("");
				jtdecouvertCp.setText("");
				jttauxCp.setText("");
			}
		});
		
		bCp1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CompteCourant c = new CompteCourant();
				CompteEpargne ce = new CompteEpargne();
				if(!"".equals(jtidCp1.getText())) {
					c = ic.lireCompteCourant(Integer.parseInt(jtidCp1.getText()));
					ce = ic.lireCompteEpargne(Integer.parseInt(jtidCp1.getText()));
					if(c.getDecouvert()!=0 && ce.getTauxEpargne()==0) {
						jsp = new JScrollPane(new JTable(CCModele=new CompteCourantModele()));
						CCModele.setData(c);
					}
					else {
						jsp = new JScrollPane(new JTable(CEModele=new CompteEpargneModele()));
						CEModele.setData(ce);
					}
				}
				else {
					c = ic.lireCompteCourant(Long.parseLong(jtnumCp1.getText()));
					ce = ic.lireCompteEpargne(Long.parseLong(jtnumCp1.getText()));
					if(c.getDecouvert()!=0 && ce.getTauxEpargne()==0) {
						jsp = new JScrollPane(new JTable(CCModele=new CompteCourantModele()));
						CCModele.setData(c);
					}
					else {
						jsp = new JScrollPane(new JTable(CEModele=new CompteEpargneModele()));
						CEModele.setData(ce);
					}
				}
				ongletLireCompte.add(jsp, BorderLayout.CENTER);
				jtidCp1.setText("");
				jtnumCp1.setText("");
				jeventCp1.setText("Compte n° "+c.getNumCompte()+" ouvert le "+c.getDateOuverture()+ " solde = "+c.getSolde()+ "0€");
			}
		});
		
		bCp2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!"".equals(jtidCp2.getText()))
					if(!"".equals(jtdecouvertCp2.getText())) {
						CompteCourant c = new CompteCourant();
						c = ic.lireCompteCourant(Integer.parseInt(jtidCp2.getText()));
						if(!"".equals(jtsoldeCp2.getText()))
							c.setSolde(Double.parseDouble(jtsoldeCp2.getText()));
						c.setDecouvert(Integer.parseInt(jtdecouvertCp2.getText()));
						ic.modifierCompteCourant(c.getNumCompte(), c.getSolde(), c.getDecouvert());
						jeventCp2.setText("Le compte n° "+c.getNumCompte()+" a été modifié");
					}
					else {
						CompteEpargne c = new CompteEpargne();
						c = ic.lireCompteEpargne(Integer.parseInt(jtidCp2.getText()));
						if(!"".equals(jtsoldeCp2.getText()))
							c.setSolde(Double.parseDouble(jtsoldeCp2.getText()));
						if(!"".equals(jttauxCp2.getText()))
							c.setTauxEpargne(Float.parseFloat(jttauxCp2.getText()));
						ic.modifierCompteEpargne(c.getNumCompte(), c.getSolde(), c.getTauxEpargne());
						jeventCp2.setText("Le compte n° "+c.getNumCompte()+" a été modifié");
					}
				else
					if(!"".equals(jtdecouvertCp2.getText())) {
						CompteCourant c = new CompteCourant();
						c = ic.lireCompteCourant(Long.parseLong(jtnumCp2.getText()));
						if(!"".equals(jtsoldeCp2.getText()))
							c.setSolde(Double.parseDouble(jtsoldeCp2.getText()));
						c.setDecouvert(Integer.parseInt(jtdecouvertCp2.getText()));
						ic.modifierCompteCourant(c.getNumCompte(), c.getSolde(), c.getDecouvert());
						jeventCp2.setText("Le compte n° "+c.getNumCompte()+" a été modifié");
					}
					else {
						CompteEpargne c = new CompteEpargne();
						c = ic.lireCompteEpargne(Long.parseLong(jtnumCp2.getText()));
						if(!"".equals(jtsoldeCp2.getText()))
							c.setSolde(Double.parseDouble(jtsoldeCp2.getText()));
						if(!"".equals(jttauxCp2.getText()))
							c.setTauxEpargne(Float.parseFloat(jttauxCp2.getText()));
						ic.modifierCompteEpargne(c.getNumCompte(), c.getSolde(), c.getTauxEpargne());
						jeventCp2.setText("Le compte n° "+c.getNumCompte()+" a été modifié");
					}		
				jtidCp2.setText("");
				jtsoldeCp2.setText("");
				jtdecouvertCp2.setText("");
				jttauxCp2.setText("");
			}
		});
		
		bCp3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				if(!"".equals(jtidCp3.getText())) {
					System.out.println(jtidCp3.getText());
					c = ic.lireCompteCourant(Integer.parseInt(jtidCp3.getText()));
					ic.supprimerCompte(c.getNumCompte());
				}
				else {
					c = ic.lireCompteCourant(Long.parseLong(jtnumCp3.getText()));
					ic.supprimerCompte(c.getNumCompte());
				}
				jtidCp3.setText("");
				jtnumCp3.setText("");
				jeventCp3.setText("Le compte n° "+c.getNumCompte()+" a été supprimé");
			}
		});
		
		getContentPane().add(onglets); //Ajoute les onglets à la fenêtre

}

	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		f.setVisible(true);
	}
}

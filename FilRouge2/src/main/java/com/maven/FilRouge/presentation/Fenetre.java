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
	
	//Structure onglets
	private JPanel ongletgestionclient = new JPanel();
		private JPanel ongletcreerclient = new JPanel();
		private JPanel ongletlireclient = new JPanel();
		private JPanel ongletmodifierclient = new JPanel();
		private JPanel ongletsupprimerclient = new JPanel();
		private JPanel ongletattribuerconseiller= new JPanel();

	private JPanel ongletgestionconseiller = new JPanel();
		private JPanel ongletcreerconseiller = new JPanel();
		private JPanel ongletlireconseiller = new JPanel();
		private JPanel ongletmodifierconseiller = new JPanel();
		private JPanel ongletsupprimerconseiller = new JPanel();
		private JPanel ongletattribueragence = new JPanel();
		private JPanel ongletajouteremploye = new JPanel();
		private JPanel ongletattribuergerant = new JPanel();
		private JPanel ongletajouterconseiller = new JPanel();
		private JPanel ongletajouterclient= new JPanel();

	private JPanel ongletgestioncompte = new JPanel();
		private JPanel ongletcreercompte = new JPanel();
		private JPanel ongletlirecompte = new JPanel();
		private JPanel ongletmodifiercompte = new JPanel();
		private JPanel ongletsupprimercompte = new JPanel();
		private JPanel ongletfairevirement = new JPanel();
		private JPanel ongletsimuler= new JPanel();
		private JPanel ongletplacerargent = new JPanel();
		private JPanel ongletattribuerclient = new JPanel();
		private JPanel ongletajoutercompte = new JPanel();

	private JPanel ongletaudition = new JPanel();	
	
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
		//Gestion Compte - Modifier
	private JLabel tidCp1 = new JLabel("ID");
	private JLabel tnumCp1 = new JLabel("Numéro");
	private JLabel tsoldeCp1 = new JLabel("Solde");
	private JLabel tdateOuvertureCp1 = new JLabel("Date d'ouverture");
	private JLabel tdecouvertCp1 = new JLabel("Découvert");
	private JLabel ttauxCp1 = new JLabel("Taux d'épargne");
	private JLabel jeventCp1 = new JLabel("");
	private JTextField jtidCp1 = new JTextField(12);
	private JTextField jtnumCp1 = new JTextField(12);
	private JTextField jtsoldeCp1 = new JTextField(12);
	private JTextField jtdateOuvertureCp1 = new JTextField(12);
	private JTextField jtdecouvertCp1 = new JTextField(12);
	private JTextField jttauxCp1 = new JTextField(12);
	private JButton bCp1 = new JButton("Valider");
		//Gestion Compte - Lire
	private JLabel tidCp2 = new JLabel("ID");
	private JLabel tnumCp2 = new JLabel("Numéro");
	private JLabel tsoldeCp2 = new JLabel("Solde");
	private JLabel tdateOuvertureCp2 = new JLabel("Date d'ouverture");
	private JLabel tdecouvertCp2 = new JLabel("Découvert");
	private JLabel ttauxCp2 = new JLabel("Taux d'épargne");
	private JLabel jeventCp2 = new JLabel("");
	private JTextField jtidCp2 = new JTextField(12);
	private JTextField jtnumCp2 = new JTextField(12);
	private JTextField jtsoldeCp2 = new JTextField(12);
	private JTextField jtdateOuvertureCp2 = new JTextField(12);
	private JTextField jtdecouvertCp2 = new JTextField(12);
	private JTextField jttauxCp2 = new JTextField(12);
	private JButton bCp2 = new JButton("Valider");
		//Gestion Compte - Supprimer
	private JLabel tidCp3 = new JLabel("ID");
	private JTextField jtidCp3 = new JTextField(12);
	private JLabel tnumCp3 = new JLabel("Numéro");
	private JTextField jtnumCp3 = new JTextField(12);
	private JButton bCp3 = new JButton("Valider");

	public Fenetre() {
		
		setTitle("ProxyBanque");//Titre de la fenêtre
		setSize(800, 600);//Taille de la fenêtre en pixels
		setResizable(true);//On autorise la fenêtre à être redimensionnée
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Un clic sur la croix arrête le processus d'affichage de la fenêtre
		setLocationRelativeTo(null);//Pour centrer la fenêtre
		//Création ongletgestionclient
		ongletcreerclient.add(tnomCl);
		ongletcreerclient.add(jtnomCl);
		ongletcreerclient.add(tprenomCl);
		ongletcreerclient.add(jtprenomCl);
		ongletcreerclient.add(tadresseCl);
		ongletcreerclient.add(jtadresseCl);
		ongletcreerclient.add(tcodePostalCl);
		ongletcreerclient.add(jtcodePostalCl);
		ongletcreerclient.add(tvilleCl);
		ongletcreerclient.add(jtvilleCl);
		ongletcreerclient.add(ttelephoneCl);
		ongletcreerclient.add(jttelephoneCl);
		ongletcreerclient.add(bCl);
		ongletcreerclient.add(jeventCl);
		JTabbedPane ongletgestionclient = new JTabbedPane();
		ongletgestionclient.addTab("Créer Client", ongletcreerclient);
		
		//Création ongletgestionconseiller
			//Création ongletcréerconseiller
		ongletcreerconseiller.add(tnomCo);
		ongletcreerconseiller.add(jtnomCo);
		ongletcreerconseiller.add(tprenomCo);
		ongletcreerconseiller.add(jtprenomCo);
		ongletcreerconseiller.add(tloginCo);
		ongletcreerconseiller.add(jtloginCo);
		ongletcreerconseiller.add(tmdpCo);
		ongletcreerconseiller.add(jtmdpCo);
		ongletcreerconseiller.add(temailCo);
		ongletcreerconseiller.add(jtemailCo);
		ongletcreerconseiller.add(bCo);
		ongletcreerconseiller.add(jeventCo);
		JTabbedPane ongletgestionconseiller = new JTabbedPane();
		ongletgestionconseiller.addTab("Créer Conseiller", ongletcreerconseiller);
		
		//Création ongletgestioncompte
			//Création ongletcréercompte
		ongletcreercompte.add(tnumCp);
		ongletcreercompte.add(jtnumCp);
		ongletcreercompte.add(tsoldeCp);
		ongletcreercompte.add(jtsoldeCp);
		ongletcreercompte.add(tdateOuvertureCp);
		ongletcreercompte.add(jtdateOuvertureCp);
		ongletcreercompte.add(tdecouvertCp);
		ongletcreercompte.add(jtdecouvertCp);
		ongletcreercompte.add(ttauxCp);
		ongletcreercompte.add(jttauxCp);
		ongletcreercompte.add(bCp);
		ongletcreercompte.add(jeventCp);
			//Création ongletmodifiercompte
		ongletmodifiercompte.add(tidCp1);
		ongletmodifiercompte.add(tnumCp1);
		ongletmodifiercompte.add(jtnumCp1);
		ongletmodifiercompte.add(tsoldeCp1);
		ongletmodifiercompte.add(jtsoldeCp1);
		ongletmodifiercompte.add(tdateOuvertureCp1);
		ongletmodifiercompte.add(jtdateOuvertureCp1);
		ongletmodifiercompte.add(tdecouvertCp1);
		ongletmodifiercompte.add(jtdecouvertCp1);
		ongletmodifiercompte.add(ttauxCp1);
		ongletmodifiercompte.add(jttauxCp1);
		ongletmodifiercompte.add(bCp1);
		ongletmodifiercompte.add(jeventCp1);
			//Création ongletlirecompte
		ongletlirecompte.add(tidCp2);
		ongletlirecompte.add(tnumCp2);
		ongletlirecompte.add(jtnumCp2);
		ongletlirecompte.add(tsoldeCp2);
		ongletlirecompte.add(jtsoldeCp2);
		ongletlirecompte.add(tdateOuvertureCp2);
		ongletlirecompte.add(jtdateOuvertureCp2);
		ongletlirecompte.add(tdecouvertCp2);
		ongletlirecompte.add(jtdecouvertCp2);
		ongletlirecompte.add(ttauxCp2);
		ongletlirecompte.add(jttauxCp2);
		ongletlirecompte.add(bCp2);
		ongletlirecompte.add(jeventCp2);
			//Création ongletsupprimercompte
		ongletsupprimercompte.add(tidCp3);
		ongletsupprimercompte.add(tnumCp3);
		ongletsupprimercompte.add(jtnumCp3);
			//Ajout des onglets du compte
		JTabbedPane ongletgestioncompte = new JTabbedPane();
		ongletgestioncompte.addTab("Créer Compte", ongletcreercompte);
		ongletgestioncompte.addTab("Lire Compte", ongletlirecompte);
		ongletgestioncompte.addTab("Modifier Compte", ongletmodifiercompte);
		ongletgestioncompte.addTab("Supprimer Compte", ongletsupprimercompte);
		/*
		//Création ongletaudition
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
		onglets.addTab("Gestion Client", ongletgestionclient);
		onglets.addTab("Gestion Conseiller", ongletgestionconseiller);
		onglets.addTab("Gestion Compte", ongletgestioncompte);
		onglets.addTab("Audition", ongletaudition);
		
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
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt(jtnumCp.getText()));
				c.setSolde(Float.parseFloat(jtsoldeCp.getText()));
				c.setDateOuverture(jtdateOuvertureCp.getText());
				((CompteCourant) c).setDecouvert(Integer.parseInt(jtdecouvertCp.getText()));
				((CompteEpargne) c).setTauxEpargne(Float.parseFloat(jttauxCp.getText()));
				ic.creerCompte(c);
				jtnumCp.setText("");
				jtsoldeCp.setText("");
				jtdateOuvertureCp.setText("");
				jtdecouvertCp.setText("");
				jttauxCp.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
			}
		});
		
		bCp1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt(jtnumCp.getText()));
				c.setSolde(Float.parseFloat(jtsoldeCp.getText()));
				c.setDateOuverture(jtdateOuvertureCp.getText());
				((CompteCourant) c).setDecouvert(Integer.parseInt(jtdecouvertCp.getText()));
				((CompteEpargne) c).setTauxEpargne(Float.parseFloat(jttauxCp.getText()));
				ic.modifierCompte(c);
				jtnumCp.setText("");
				jtsoldeCp.setText("");
				jtdateOuvertureCp.setText("");
				jtdecouvertCp.setText("");
				jttauxCp.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
			}
		});
		
		bCp2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt(jtnumCp.getText()));
				c.setSolde(Float.parseFloat(jtsoldeCp.getText()));
				c.setDateOuverture(jtdateOuvertureCp.getText());
				((CompteCourant) c).setDecouvert(Integer.parseInt(jtdecouvertCp.getText()));
				((CompteEpargne) c).setTauxEpargne(Float.parseFloat(jttauxCp.getText()));
				ic.lireCompte(c);
				jtnumCp.setText("");
				jtsoldeCp.setText("");
				jtdateOuvertureCp.setText("");
				jtdecouvertCp.setText("");
				jttauxCp.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
			}
		});
		
		bCp3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt(jtnumCp.getText()));
				ic.supprimerCompte(c);
				jtnumCp.setText("");
				jtsoldeCp.setText("");
				jtdateOuvertureCp.setText("");
				jtdecouvertCp.setText("");
				jttauxCp.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été créé");
			}
		});
		
		getContentPane().add(onglets); //Ajoute les onglets à la fenêtre

}

	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		f.setVisible(true);
	}
}

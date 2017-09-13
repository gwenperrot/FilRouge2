package com.maven.FilRouge.presentation;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
	JTabbedPane ongletgestionclient = new JTabbedPane();
		private JPanel ongletcreerclient = new JPanel();
		private JPanel ongletlireclient = new JPanel();
		private JPanel ongletmodifierclient = new JPanel();
		private JPanel ongletsupprimerclient = new JPanel();
		private JPanel ongletattribuerconseiller= new JPanel();

	JTabbedPane ongletgestionconseiller = new JTabbedPane();
		private JPanel ongletcreerconseiller = new JPanel();
		private JPanel ongletlireconseiller = new JPanel();
		private JPanel ongletmodifierconseiller = new JPanel();
		private JPanel ongletsupprimerconseiller = new JPanel();
		private JPanel ongletattribueragence = new JPanel();
		private JPanel ongletajouteremploye = new JPanel();
		private JPanel ongletattribuergerant = new JPanel();
		private JPanel ongletajouterconseiller = new JPanel();
		private JPanel ongletajouterclient= new JPanel();

	JTabbedPane ongletgestioncompte = new JTabbedPane();
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
		//Gestion Compte - Lire
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
		//Gestion Compte - Modifier
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
		ongletgestionclient.addTab("Créer", ongletcreerclient);
		ongletgestionclient.addTab("Lire", ongletlireclient);
		ongletgestionclient.addTab("Modifier", ongletmodifierclient);
		ongletgestionclient.addTab("Supprimer", ongletsupprimerclient);
		ongletgestionclient.addTab("Attribuer Conseiller", ongletattribuerconseiller);

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
		ongletgestionconseiller.addTab("Créer", ongletcreerconseiller);
		ongletgestionconseiller.addTab("Lire", ongletlireconseiller);
		ongletgestionconseiller.addTab("Modifier", ongletmodifierconseiller);
		ongletgestionconseiller.addTab("Supprimer", ongletsupprimerconseiller);
		ongletgestionconseiller.addTab("Attribuer Agence", ongletattribueragence);
		ongletgestionconseiller.addTab("Ajouter employé", ongletajouterconseiller);
		ongletgestionconseiller.addTab("Attribuer Gérant", ongletattribuergerant);
		ongletgestionconseiller.addTab("Ajouter Conseiller", ongletajouterconseiller);
		ongletgestionconseiller.addTab("Ajouter Client", ongletajouterclient);
		
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
			//Création ongletlirecompte
		ongletlirecompte.add(tidCp1);
		ongletlirecompte.add(jtidCp1);
		ongletlirecompte.add(tnumCp1);
		ongletlirecompte.add(jtnumCp1);
		ongletlirecompte.add(bCp1);
		ongletlirecompte.add(jeventCp1);
			//Création ongletmodifiercompte
		ongletmodifiercompte.add(tidCp2);
		ongletmodifiercompte.add(jtidCp2);
		ongletmodifiercompte.add(tnumCp2);
		ongletmodifiercompte.add(jtnumCp2);
		ongletmodifiercompte.add(tsoldeCp2);
		ongletmodifiercompte.add(jtsoldeCp2);
		ongletmodifiercompte.add(tdateOuvertureCp2);
		ongletmodifiercompte.add(jtdateOuvertureCp2);
		ongletmodifiercompte.add(tdecouvertCp2);
		ongletmodifiercompte.add(jtdecouvertCp2);
		ongletmodifiercompte.add(ttauxCp2);
		ongletmodifiercompte.add(jttauxCp2);
		ongletmodifiercompte.add(bCp2);
		ongletmodifiercompte.add(jeventCp2);
			//Création ongletsupprimercompte
		ongletsupprimercompte.add(tidCp3);
		ongletsupprimercompte.add(jtidCp3);
		ongletsupprimercompte.add(tnumCp3);
		ongletsupprimercompte.add(jtnumCp3);
		ongletmodifiercompte.add(bCp3);
		ongletmodifiercompte.add(jeventCp3);
			//Ajout des onglets du compte
		ongletgestioncompte.addTab("Créer", ongletcreercompte);
		ongletgestioncompte.addTab("Lire", ongletlirecompte);
		ongletgestioncompte.addTab("Modifier", ongletmodifiercompte);
		ongletgestioncompte.addTab("Supprimer", ongletsupprimercompte);
		ongletgestioncompte.addTab("Faire Virement", ongletfairevirement);
		ongletgestioncompte.addTab("Simuler", ongletsimuler);
		ongletgestioncompte.addTab("Placer Bourse", ongletplacerargent);
		ongletgestioncompte.addTab("Attribuer Client", ongletattribuerclient);
		ongletgestioncompte.addTab("Ajouter Compte", ongletajoutercompte);
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
				ic.lireCompte(Integer.parseInt(jtidCp1.getText()));
				jtidCp1.setText("");
				jeventCp1.setText("Compte n° "+jtnumCp.getText()+" de "+c.getNumCompte()+" ouvert le "+c.getDateOuverture()+"\ndécouvert = "+((CompteCourant) c).getDecouvert());
			}
		});
		
		bCp2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				c = ic.getCompte(Integer.parseInt(jtidCp2.getText()));
				if (jtsoldeCp2.getText()==null)
					c.setSolde(0.01);
				else c.setSolde(Double.parseDouble(jtsoldeCp2.getText()));
				if (jtdecouvertCp2.getText()==null)
					((CompteCourant) c).setDecouvert(999999998);
				else ((CompteCourant) c).setDecouvert(Integer.parseInt(jtdecouvertCp2.getText()));
				if (jttauxCp2.getText()==null)
					((CompteEpargne) c).setTauxEpargne(0.01f);
				else ((CompteEpargne) c).setTauxEpargne(Float.parseFloat(jttauxCp2.getText()));
				ic.modifierCompte(c.getIdCompte(), c.getSolde(), ((CompteCourant) c).getDecouvert(), ((CompteEpargne) c).getTauxEpargne());
				jtidCp2.setText("");
				jtsoldeCp2.setText("");
				jtdecouvertCp2.setText("");
				jttauxCp2.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été modifié");
			}
		});
		
		bCp3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Compte c = new Compte();
				c = ic.getCompte(Integer.parseInt(jtidCp3.getText()));
				ic.supprimerCompte(c.getIdCompte());
				jtidCp3.setText("");
				jeventCp.setText("Le compte n° "+c.getNumCompte()+" a été supprimé");
			}
		});
		
		getContentPane().add(onglets); //Ajoute les onglets à la fenêtre

}

	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		f.setVisible(true);
	}
}

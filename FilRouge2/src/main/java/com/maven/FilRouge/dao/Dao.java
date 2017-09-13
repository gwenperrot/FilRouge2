package com.maven.FilRouge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.maven.FilRouge.metier.Agence;
import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Employe;
import com.maven.FilRouge.metier.Gerant;
import com.maven.FilRouge.service.AuditeurImpl;
import com.maven.FilRouge.service.ConseillerImpl;
import com.maven.FilRouge.service.GerantImpl;
import com.maven.FilRouge.service.IAuditeur;
import com.maven.FilRouge.service.IConseiller;
import com.maven.FilRouge.service.IGerant;
import com.maven.FilRouge.metier.CompteCourant;
import com.maven.FilRouge.metier.CompteEpargne;
/**
 * 
 * @author 
 *
 */
public class Dao implements Idao {

	@Override
	public void creerClient(Client c) {
		System.out.println("Je cree un client en BDD");
	}
	
	@Override
	public void lireClient(Client c) {
		System.out.println("Je lis un client en BDD");		
	}

	@Override
	public void modifierClient(Client c) {
		System.out.println("Je modifie un client en BDD");		
	}

	@Override
	public void supprimerClient(Client c) {
		System.out.println("Je supprime un client en BDD");		
	}

	@Override
	public void creerCompte(Compte c) {
			
		try {
            //  1-charger le pilote
            Class.forName("com.mysql.jdbc.Driver");

            // 2- adresse de la BDD
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";

            // 3- Connection a la BDD
            Connection con = DriverManager.getConnection(adresse, login, mdp);

         // 4- Preparation et envoi de la requete
            String requete = "INSERT INTO compte (numCompte, solde, dateOuverture) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(requete);
            ps.setLong(1, c.getNumCompte());
            ps.setDouble(2, c.getSolde());
            ps.setString(3, c.getDateOuverture());
            //ps.setInt(4, ((CompteCourant)c).getDecouvert());
            //ps.setFloat(5, ((CompteEpargne)c).getTauxEpargne());
            
            ps.executeUpdate();

            // 6- Liberation des ressources
            ps.close();
            con.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	
	}

	@Override
	public Compte lireCompte(int idCompte) {
		Compte c = new Compte();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- preparer en envoyer la requete 
			String requete = "SELECT* FROM compte WHERE idCompte=? ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setLong(1, idCompte);
			
			//5- recuperer le resultat
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			c.setNumCompte(rs.getLong("numCompte"));
			c.setSolde(rs.getFloat("solde"));
			c.setDateOuverture(rs.getString("dateOuverture"));

			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return c;	
	}
	
	@Override
	public void modifierCompte(int idCompte, double solde) {	
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
	        String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
	        String login = "root";
	        String mdp = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- preparer en envoyer la requete 
			String requete = "UPDATE compte set solde=? WHERE idCompte=? ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setDouble(1, solde);
			ps.setInt(2, idCompte);

			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		
	}
	
	@Override
	public void modifierCompte(int idCompte, double solde, int decouvert, float tauxEpargne) {
		
		try {
		//1- charger le pilote
		Class.forName("com.mysql.jdbc.Driver");
		//2- adresse de la base de donn�es
        String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
        String login = "root";
        String mdp = "";
		
		//3- connection a la base 
		Connection conn = DriverManager.getConnection(adresse, login, mdp);
		//4- preparer en envoyer la requete 
		String requete = "UPDATE compte set solde=?, decouvert=?, tauxEpargne=? WHERE idCompte=? ";
		
		PreparedStatement ps = conn.prepareStatement(requete);
		ps.setInt(4, idCompte);
		
		if(solde != 0.01)
			ps.setDouble(1, solde);
		if(decouvert != 999999998)
			ps.setInt(2, decouvert);
		if(tauxEpargne != 0.01f)
			ps.setFloat(3, tauxEpargne);
		
		ps.executeUpdate();
		
		ps.close();
		conn.close();
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	@Override
	public void supprimerCompte(int idCompte) {
		Compte c = new Compte();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- preparer en envoyer la requete 
			String requete = "DELETE FROM compte Where idCompte=?";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			
			ps.setInt(1, idCompte);
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
	}

	@Override
	public void faireVirement(Compte c) {
		System.out.println("Je fais un virement depuis un compte en BDD");	
	}

	@Override
	public void simuler() {
		System.out.println("Je simule un placement en BDD");	
	}

	@Override
	public void placerArgent(float montant, Compte c) {
		System.out.println("Je fais un placement");
	}		

	@Override
	public void seconnecter(String login, String mdp) {
		System.out.println("Je me connecte");	
	}

	@Override
	public void auditer() {
		System.out.println("J'audite");	
	}

	@Override
	public void creerConseiller(Conseiller c) {
		try {
            //  1-charger le pilote
            Class.forName("com.mysql.jdbc.Driver");

            // 2- adresse de la BDD
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";

            // 3- Connection a la BDD
            Connection con = DriverManager.getConnection(adresse, login, mdp);

         // 4- Preparation et envoi de la requete
            String requete = "INSERT INTO employe (nom, prenom, login, mdp, email) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getLogin());
            ps.setString(4, c.getMdp());
            ps.setString(5, c.getEmail());

            
            ps.executeUpdate();

            // 6- Liberation des ressources
            ps.close();
            con.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }	
	}

	@Override
	public Conseiller lireConseiller(int id) {
		Conseiller c = new Conseiller();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- preparer en envoyer la requete 
			String requete = "SELECT * FROM employe WHERE id=? ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setLong(1, id);
			
			//5- recuperer le resultat
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setLogin(rs.getString("login"));
			c.setMdp(rs.getString("mdp"));
			c.setEmail(rs.getString("email"));
			

			//6- liberer les ressources
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return c;	
	}

	@Override
	public void modifierConseiller(int id, String nom, String prenom, String login, String mdp, String email) {
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
	        String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
	        String login2 = "root";
	        String mdp2 = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login2, mdp2);
			//4- preparer en envoyer la requete 
			String requete = "UPDATE employe set nom=?, prenom=?, login=?, mdp=?, email=? WHERE idCompte=? ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setString(3, login);
			ps.setString(4, mdp);
			ps.setString(5, email);
			

			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}	
	}

	@Override
	public void supprimerConseiller(Conseiller c) {
		System.out.println("Je supprimer un conseiller en BDD");
	}

	@Override
	public void attribuerAgence(Agence a, Employe e) {
		System.out.println("J'attribue une agence � un employ�");		
	}

	@Override
	public void ajouterEmploye(Employe e, Agence a) {
		System.out.println("J'ajoute un employ� � une agence");				
	}

	@Override
	public void ajouterConseiller(Conseiller c, Gerant g) {
		System.out.println("J'ajoute un conseiller � un g�rant");			
	}

	@Override
	public void attribuerGerant(Gerant g, Conseiller c) {
		System.out.println("J'attribue un g�rant � un conseiller");			
	}

	@Override
	public void attribuerClient(Client cl, Compte c) {
		System.out.println("J'attribue un client � un compte");				
	}

	@Override
	public void ajouterCompte(Compte c, Client cl) {
		System.out.println("J'ajoute un compte � un client");				
	}

	@Override
	public void attibuerConseiller(Conseiller c, Client cl) {
		System.out.println("J'attribue un conseiller � un client");						
	}

	@Override
	public void ajouterClient(Client cl, Conseiller c) {
		System.out.println("J'ajoute un client � un conseiller");						
	}

	@Override
	public Compte getCompte(int idCompte) {
		Compte c = new Compte();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de donn�es
            String adresse = "jdbc:mysql://127.0.0.1:3306/proxybanque";
            String login = "root";
            String mdp = "";
			
			//3- connection a la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- preparer en envoyer la requete 
			String requete = "SELECT * FROM compte WHERE idCompte=? ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, idCompte);
			
			//5- recuperer le resultat
			ResultSet rs = ps.executeQuery();
			rs.next();
			c.setIdCompte(idCompte);
			c.setNumCompte(rs.getLong("numCompte"));
			c.setDateOuverture(rs.getString("dateOuverture"));
			c.setSolde(rs.getDouble("solde"));
			//((CompteCourant)c).setDecouvert(rs.getInt("decouvert"));
			//((CompteEpargne)c).setTauxEpargne(rs.getFloat("tauxEpargne"));

			//6- liberer les ressources
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return c;
	}

}

package hei.devweb.dao;

import hei.devweb.model.Membre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * MembreDao est la classe qui gère les intéractions du site avec la table "membre" de la base de données sitelasauce.
 *
 */
public class MembreDao {
	   /**
* Retourne la liste des membres de la table "membre".
* 
* @return La liste des membres.
* 
* @see Membre
*/
	public List<Membre> listerMembres() {
		List<Membre> listeMembres = new ArrayList<Membre>();
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM Membre");

			while (results.next()) {
				Membre Membre = new Membre(results.getInt("idMembre"),
						results.getString("nom"),
						results.getString("prenom"),
						results.getString("motdePasse"),
						results.getString("mailHEI"),
						results.getString("telephone"));
				listeMembres.add(Membre);
			}

			// Fermer la connexion
			results.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeMembres;
	}
	/**
     * Met à jour la table "membre".
     * 
     * @param membre 
     *            Le nouveau membre ajouté.
     * 
     */
	public void ajouterMembre(Membre Membre) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO `Membre`(`nom`,`prenom`,`motdePasse`,`mailHEI`,`telephone`) VALUES(?,?,?,?,?)");
			stmt.setString(1, Membre.getNom());
			stmt.setString(2, Membre.getPrenom());
			stmt.setString(3, Membre.getMotdePasse());
			stmt.setString(4, Membre.getMailHEI());
			stmt.setString(5, Membre.getTelephone());
			stmt.executeUpdate();

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * Met à jour la table "membre".
     * 
     * @param idMembre 
     *            L'id du membre qui sera supprimé.
     * 
     */
	public void supprimerMembre(Integer idMembre) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM Membre WHERE idMembre = ?");

			stmt.setInt(1, idMembre);
			stmt.executeUpdate();
			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * Retourne l'objet Membre.
     * @param idMembre
     * 			Id du membre qui sera retourné.
     * 
     * @return L'objet Membre d'identifiant idMembre. 
     */	
	public Membre getMembre(Integer idMembre) {
		Membre Membre = null;
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM Membre WHERE idMembre = ?");
			stmt.setInt(1, idMembre);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Membre = new Membre(result.getInt("idMembre"),
						result.getString("nom"),
						result.getString("prenom"),
						result.getString("motdePasse"),
						result.getString("mailHEI"),
						result.getString("telephone"));
			}

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Membre;
	}

}

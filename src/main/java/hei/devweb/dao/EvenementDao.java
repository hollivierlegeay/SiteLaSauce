package hei.devweb.dao;

import hei.devweb.model.Evenement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * EvenementDao est la classe qui gère les intéractions du site avec la table
 * "evenement" de la base de données sitelasauce.
 * 
 */
public class EvenementDao {
	/**
	 * Retourne la liste des évènements de la table "evenement".
	 * 
	 * @return La liste des évènements.
	 * 
	 * @see Evenement
	 */
	public List<Evenement> listerEvenements() {
		List<Evenement> listeEvenements = new ArrayList<Evenement>();
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM Evenement");

			while (results.next()) {
				Evenement evenement = new Evenement(
						results.getInt("idEvenement"),
						results.getString("titreEvenement"),
						results.getDate("dateEvenement"),
						results.getString("detailEvenement"),
						results.getString("lieuEvenement"));
				listeEvenements.add(evenement);
			}

			// Fermer la connexion
			results.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeEvenements;
	}

	/**
	 * Met à jour la table "evenement".
	 * 
	 * @param evenement
	 *            Le nouvel évènement ajouté.
	 * 
	 */
	public void ajouterEvenement(Evenement Evenement) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO Evenement (titreEvenement,dateEvenement, detailEvenement,lieuEvenement) VALUES(?,?,?,?)");
			stmt.setString(1, Evenement.getTitreEvenement());
			stmt.setDate(2, new Date(Evenement.getDateEvenement().getTime()));
			stmt.setString(3, Evenement.getDetailEvenement());
			stmt.setString(4, Evenement.getLieuEvenement());

			stmt.executeUpdate();

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Met à jour la table "evenement".
	 * 
	 * @param idEvenement
	 *            L'id de l'évènement qui sera supprimé.
	 * 
	 */
	public void supprimerEvenement(Integer idEvenement) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM evenement WHERE idEvenement = ?");

			stmt.setInt(1, idEvenement);
			stmt.executeUpdate();
			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retourne l'objet Evenement.
	 * 
	 * @param idEvenement
	 *            Id de l'évènement qui sera retourné.
	 * 
	 * @return L'objet Evenement d'identifiant idEvenement.
	 */
	public Evenement getEvenement(Integer idEvenement) {
		Evenement Evenement = null;
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM Evenement WHERE idEvenement = ?");
			stmt.setInt(1, idEvenement);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Evenement = new Evenement(result.getInt("idEvenement"),
						result.getString("titreEvenement"),
						result.getDate("dateEvenement"),
						result.getString("detailEvenement"),
						result.getString("lieuEvenement"));
			}
			System.out.println("RETOUR:" + result.getString("titreEvenement"));
			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Evenement;
	}

}
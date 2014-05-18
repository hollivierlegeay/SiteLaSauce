package hei.devweb.dao;

import hei.devweb.model.Equipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * EquipeDao est la classe qui gère les intéractions avec la table "equipe" de
 * la base de données sitelasauce.
 * 
 */
public class EquipeDao {
	/**
	 * Retourne la liste des équipes de la table "equipe".
	 * 
	 * @return La liste des équipes.
	 * 
	 * @see Equipe
	 */

	public List<Equipe> listerEquipes() {
		List<Equipe> listeEquipes = new ArrayList<Equipe>();
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM Equipe");

			while (results.next()) {
				Equipe Equipe = new Equipe(results.getInt("idEquipe"),
						results.getString("anneeMandat"),
						results.getString("descriptionEquipe"),
						results.getString("imgEquipe"));
				listeEquipes.add(Equipe);
			}

			// Fermer la connexion
			results.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeEquipes;
	}

	/**
	 * Met à jour la table "equipe".
	 * 
	 * @param equipe
	 *            La nouvelle équipe ajoutée.
	 * 
	 */
	public void ajouterEquipe(Equipe Equipe) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO `Equipe`(`anneeMandat`,`descriptionEquipe`,`imgEquipe`) VALUES(?,?,?)");
			stmt.setString(1, Equipe.getAnneeMandat());
			stmt.setString(2, Equipe.getDescriptionEquipe());
			stmt.setString(3, Equipe.getImgEquipe());
			stmt.executeUpdate();

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Met à jour la table "equipe".
	 * 
	 * @param idEquipe
	 *            L'id de l'équipe qui sera supprimée.
	 * 
	 */
	public void supprimerEquipe(Integer idEquipe) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM Equipe WHERE idEquipe = ?");

			stmt.setInt(1, idEquipe);
			stmt.executeUpdate();
			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retourne l'objet Equipe.
	 * 
	 * @param idEquipe
	 *            Id de l'équipe qui sera retournée.
	 * 
	 * @return L'objet Equipe d'identifiant idEquipe.
	 */
	public Equipe getEquipe(Integer idEquipe) {
		Equipe Equipe = null;
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM Equipe WHERE idEquipe = ?");
			stmt.setInt(1, idEquipe);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Equipe = new Equipe(result.getInt("idEquipe"),
						result.getString("anneeMandat"),
						result.getString("descriptionEquipe"),
						result.getString("imgEquipe"));
			}

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Equipe;
	}

}

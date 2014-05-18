package hei.devweb.dao;

import hei.devweb.model.Recette;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * RecetteDao est la classe qui gère les intéractions du site avec la table
 * "recette" de la base de données sitelasauce.
 * 
 */
public class RecetteDao {
	/**
	 * Retourne la liste des recettes de la table "recette".
	 * 
	 * @return La liste des recettes.
	 * 
	 * @see Recette
	 */
	public List<Recette> listerRecettes() {
		List<Recette> listeRecettes = new ArrayList<Recette>();
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM Recette");

			while (results.next()) {
				Recette recette = new Recette(results.getInt("idRecette"),
						results.getString("titrePlat"),
						results.getString("imgRecette"),
						results.getString("difficulte"),
						results.getString("typePlat"),
						results.getString("ingredients"),
						results.getString("texteRecette"));
				listeRecettes.add(recette);
			}

			// Fermer la connexion
			results.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeRecettes;
	}

	/**
	 * Met à jour la table "recette".
	 * 
	 * @param recette
	 *            La nouvelle recette ajoutée.
	 * 
	 */
	public void ajouterRecette(Recette Recette) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO Recette (titrePlat,imgRecette, difficulte, typePlat,ingredients, texteRecette) VALUES(?,?,?,?,?,?)");
			stmt.setString(1, Recette.getTitrePlat());
			stmt.setString(2, Recette.getImgRecette());
			stmt.setString(3, Recette.getDifficulte());
			stmt.setString(4, Recette.getTypePlat());
			stmt.setString(5, Recette.getIngredients());
			stmt.setString(6, Recette.getTexteRecette());
			stmt.executeUpdate();

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Met à jour la table "recette".
	 * 
	 * @param idRecette
	 *            L'id de la recette qui sera supprimée.
	 * 
	 */
	public void supprimerRecette(Integer idRecette) {
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM Recette WHERE idRecette = ?");

			stmt.setInt(1, idRecette);
			stmt.executeUpdate();
			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retourne l'objet Recette.
	 * 
	 * @param idRecette
	 *            Id de la recette qui sera retournée.
	 * 
	 * @return L'objet Recette d'identifiant idRecette.
	 */
	public Recette getRecette(Integer idRecette) {
		Recette Recette = null;
		try {
			Connection connection = DataSourceProvider.getDataSource()
					.getConnection();

			// Utiliser la connexion
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM Recette WHERE idRecette = ?");
			stmt.setInt(1, idRecette);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Recette = new Recette(result.getInt("idRecette"),
						result.getString("titrePlat"),
						result.getString("imgRecette"),
						result.getString("difficulte"),
						result.getString("typePlat"),
						result.getString("ingredients"),
						result.getString("texteRecette"));
			}

			// Fermer la connexion
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Recette;
	}

}
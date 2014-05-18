package hei.devweb.metier;

import hei.devweb.dao.RecetteDao;
import hei.devweb.model.Recette;

import java.util.List;

/**
 * RecetteManager est la classe qui gère les méthodes pour interagir la table
 * "recette" de la base de données sitelasauce.
 * 
 * @see RecetteDao
 * 
 */
public class RecetteManager {

	private static RecetteManager instance;
	/**
	 * Création du lien avec la table "recette" de la base de données.
	 * 
	 * @see RecetteDao
	 * 
	 */
	private RecetteDao recetteDao = new RecetteDao();

	/**
	 * Retourne l'instance du Manager Recette.
	 * 
	 * @return L'instance du manager de la table "recette".
	 */
	public static RecetteManager getInstance() {
		if (instance == null) {
			instance = new RecetteManager();
		}
		return instance;
	}

	/**
	 * Retourne la liste des recettes de la table "recette".
	 * 
	 * @return La liste des recettes.
	 * 
	 * @see RecetteDao#listerRecettes()
	 */
	public List<Recette> listerRecettes() {
		return recetteDao.listerRecettes();
	}

	/**
	 * Vérifie les erreurs de saisie et retourne l'objet Recette.
	 * 
	 * @see RecetteDao#getRecette(Integer)
	 * 
	 * @param idRecette
	 *            Id de la recette qui sera retournée.
	 * 
	 * @return L'objet Recette d'identifiant idRecette.
	 * 
	 * 
	 */
	public Recette getRecette(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant de la recette doit etre renseigné.");
		}
		return recetteDao.getRecette(id);
	}

	/**
	 * Vérifie les erreurs de saisie et met à jour la table "recette"
	 * 
	 * @see RecetteDao#ajouterRecette(Recette)
	 * 
	 * @param recette
	 *            La nouvelle recette ajoutée.
	 * 
	 */
	public void ajouterRecette(Recette recette) {
		if (recette == null) {
			throw new IllegalArgumentException(
					"La recette doit être renseignée.");
		}
		if (recette.getIdRecette() == null
				|| recette.getTitrePlat().equals("") == true
				|| recette.getImgRecette().equals("") == true
				|| recette.getDifficulte().equals("") == true
				|| recette.getTypePlat().equals("") == true
				|| recette.getIngredients().equals("") == true
				|| recette.getTexteRecette().equals("") == true) {
			throw new IllegalArgumentException(
					"Un champ obligatoire de la recette n'est pas renseigné.");
		}

		recetteDao.ajouterRecette(recette);
	}

	/**
	 * Met à jour la table "recette".
	 * 
	 * @see RecetteDao#supprimerRecette(Recette)
	 * 
	 * @param idRecette
	 *            L'id de la recette qui sera supprimée.
	 * 
	 */
	public void supprimerRecette(Integer idRecette) {
		recetteDao.supprimerRecette(idRecette);
	}

}

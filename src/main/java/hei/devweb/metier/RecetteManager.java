package hei.devweb.metier;

import hei.devweb.dao.RecetteDao;
import hei.devweb.model.Recette;

import java.util.List;

public class RecetteManager {

	private static RecetteManager instance;

	private RecetteDao recetteDao = new RecetteDao();

	public static RecetteManager getInstance() {
		if (instance == null) {
			instance = new RecetteManager();
		}
		return instance;
	}

	public List<Recette> listerRecettes() {
		return recetteDao.listerRecettes();
	}

	public Recette getRecette(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant du recette doit etre renseigné.");
		}
		return recetteDao.getRecette(id);
	}

	public void ajouterRecette(Recette recette) {
		if (recette == null) {
			throw new IllegalArgumentException(
					"Le recette doit être renseigné.");
		}
		if (recette.getIdRecette() == null
				|| recette.getTitrePlat() == null
				|| recette.getDifficulte() == null
				|| recette.getTypePlat() == null
				|| recette.getIngredients() == null
				|| recette.getTexteRecette() == null) {
			throw new IllegalArgumentException(
					"Un champ obligatoire du recette n'est pas renseigné.");
		}

		recetteDao.ajouterRecette(recette);
	}

	public void supprimerRecette(Integer idRecette) {
		recetteDao.supprimerRecette(idRecette);
	}

}

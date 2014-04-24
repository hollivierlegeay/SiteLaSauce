package hei.devweb.forms;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import hei.devweb.beans.Recette;

public final class CreationRecetteForm {
	private static final String CHAMP_TITRE = "titrePlat";
	private static final String CHAMP_DIFFICULTE = "difficulte";
	private static final String CHAMP_TYPE = "typePlat";
	private static final String CHAMP_INGREDIENTS = "ingredients";
	private static final String CHAMP_TEXTE = "texteRecette";
	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public String getResultat() {
		return resultat;
	}

	public Recette creerRecette(HttpServletRequest request) {
		String titrePlat = getValeurChamp(request, CHAMP_TITRE);
		String difficulte = getValeurChamp(request, CHAMP_DIFFICULTE);
		String typePlat = getValeurChamp(request, CHAMP_TYPE);
		String ingredients = getValeurChamp(request, CHAMP_INGREDIENTS);
		String texteRecette = getValeurChamp(request, CHAMP_TEXTE);
		Recette recette = new Recette();
		try {
			validationTitre(titrePlat);
		} catch (Exception e) {
			setErreur(CHAMP_TITRE, e.getMessage());
		}
		recette.setTitrePlat(titrePlat);
		try {
			validationDifficulte(difficulte);
		} catch (Exception e) {
			setErreur(CHAMP_DIFFICULTE, e.getMessage());
		}
		recette.setDifficulte(difficulte);
		try {
			validationType(typePlat);
		} catch (Exception e) {
			setErreur(CHAMP_TYPE, e.getMessage());
		}
		recette.setTypePlat(typePlat);
		try {
			validationIngredients(ingredients);
		} catch (Exception e) {
			setErreur(CHAMP_INGREDIENTS, e.getMessage());
		}
		recette.setIngredients(ingredients);
		try {
			validationTexte(texteRecette);
		} catch (Exception e) {
			setErreur(CHAMP_TEXTE, e.getMessage());
		}
		recette.setTexteRecette(texteRecette);
		if (erreurs.isEmpty()) {
			resultat = "Succès de la création de la recette.";
		} else {
			resultat = "Échec de la création de la recette.";
		}
		return recette;
	}

	private void validationTitre(String titrePlat) throws Exception {
		if (titrePlat != null) {
			if (titrePlat.length() < 2) {
				throw new Exception(
						"Le titre de la recette doit contenir au moins 2 caractères.");
			}
		} else {
			throw new Exception("Merci d'entrer un titre.");
		}
	}

	private void validationDifficulte(String difficulte) throws Exception {
		if (difficulte != null && difficulte.length() < 2) {
			throw new Exception(
					"La difficulté de la recette doit contenir au moins 2 caractères.");
		}
	}

	private void validationType(String typePlat) throws Exception {
		if (typePlat != null) {
			if (typePlat.length() < 2) {
				throw new Exception(
						"Le type de plat doit contenir au moins 2 caractères.");
			}
		} else {
			throw new Exception("Merci d'entrer un type de plat.");
		}
	}

	private void validationIngredients(String ingredients) throws Exception {
		if (ingredients != null) {
			if (ingredients.length() < 5) {
				throw new Exception(
						"La liste des ingrédients doit contenir au moins 5 caractères.");
			}
		} else {
			throw new Exception("Merci d'entrer les ingrédients.");
		}
	}

	private void validationTexte(String texteRecette) throws Exception {
		if (texteRecette != null) {

			throw new Exception("Merci d'entrer le texte de la recette.");
		}
	}

	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	private void setErreur(String champ, String message) {
		erreurs.put(champ, message);
	}

	/*
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private static String getValeurChamp(HttpServletRequest request,
			String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}
}

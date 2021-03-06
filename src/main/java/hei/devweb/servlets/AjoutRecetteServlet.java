package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Membre;
import hei.devweb.model.Recette;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AjoutRecetteServlet est la classe qui permet d'afficher le formulaire de
 * création d'une recette ("ajouterRecette.jsp").
 * 
 * @see HttpServlet
 */
public class AjoutRecetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/pages/ajouterRecette.jsp";
	public static final String CHAMP1 = "titrePlatRecette";
	public static final String CHAMP2 = "difficulteRecette";
	public static final String CHAMP3 = "typePlatRecette";
	public static final String CHAMP4 = "imgRecette";
	public static final String CHAMP5 = "ingredientsRecette";
	public static final String CHAMP6 = "texteRecette";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";

	/**
	 * Pour gérer la méthode GET
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/* Affichage de la page */
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}

	/**
	 * Pour gérer la méthode POST
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String resultat;
		Map<String, String> erreurs = new HashMap<String, String>();

		/* Récupération des champs du formulaire. */
		String titrePlatRecette = request.getParameter(CHAMP1);
		String difficulteRecette = request.getParameter(CHAMP2);
		String typePlatRecette = request.getParameter(CHAMP3);
		String imgRecette = request.getParameter(CHAMP4);
		String ingredientsRecette = request.getParameter(CHAMP5);
		String texteRecette = request.getParameter(CHAMP6);

		/* Validation du champ titre. */
		try {
			validationTitre(titrePlatRecette);
		} catch (Exception e) {
			erreurs.put(CHAMP1, e.getMessage());
		}
		/* Validation du champ difficulté */
		try {
			validationDifficulte(difficulteRecette);
		} catch (Exception e) {
			erreurs.put(CHAMP2, e.getMessage());
		}
		/* Validation du champ type. */
		try {
			validationType(typePlatRecette);
		} catch (Exception e) {
			erreurs.put(CHAMP3, e.getMessage());
		}
		/* Validation du champ image. */
		try {
			validationImg(imgRecette);
		} catch (Exception e) {
			erreurs.put(CHAMP4, e.getMessage());
		}
		/* Validation du champ ingrédients. */
		try {
			validationIngredients(ingredientsRecette);
		} catch (Exception e) {
			erreurs.put(CHAMP5, e.getMessage());
		}
		/* Validation du champ texte. */
		try {
			validationTexte(texteRecette);

		} catch (Exception e) {
			erreurs.put(CHAMP6, e.getMessage());
		}

		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {

			/* Ajout de la recette à la BDD */
			Integer idRecette = RecetteManager.getInstance().listerRecettes()
					.size() + 1;
			RecetteManager.getInstance().ajouterRecette(
					new Recette(idRecette, request
							.getParameter("titrePlatRecette"), request
							.getParameter("imgRecette"), request
							.getParameter("difficulteRecette"), request
							.getParameter("typePlatRecette"), request
							.getParameter("ingredientsRecette"), request
							.getParameter("texteRecette")));

			response.sendRedirect("listeRecettes");
		} else {
			resultat = "Échec de la création.";

			/*
			 * Stockage du résultat et des messages d'erreur dans l'objet
			 * request
			 */
			request.setAttribute(ATT_ERREURS, erreurs);
			request.setAttribute(ATT_RESULTAT, resultat);

			/* Transmission de la paire d'objets request/response à notre JSP */
			this.getServletContext().getRequestDispatcher(VUE)
					.forward(request, response);

		}

	}

	/**
	 * Méthode qui valide la saisie du titre dans le formulaire d'ajout.
	 * 
	 * @param titrePlatRecette
	 */
	private void validationTitre(String titrePlatRecette) throws Exception {
		List<Recette> recettes = RecetteManager.getInstance().listerRecettes();
		for (int i = 0; i < recettes.size(); i++) {
			if (titrePlatRecette.equals(recettes.get(i).getTitrePlat()))	
			{
				throw new Exception(
					"Ce titre de recette existe déjà.");
			}
		}

		if (titrePlatRecette != null && titrePlatRecette.trim().length() < 3) {
			throw new Exception(
					"Le titre de la recette doit contenir au moins 3 caractères.");
		}

	}

	/**
	 * Méthode qui valide la saisie de la difficulté dans le formulaire d'ajout.
	 * 
	 * @param difficulteRecette
	 */
	private void validationDifficulte(String difficulteRecette)
			throws Exception {
		if (difficulteRecette != null && difficulteRecette.trim().length() < 3) {
			throw new Exception(
					"La difficulté doit contenir au moins 3 caractères.");
		}
	}

	/**
	 * Méthode qui valide la saisie du type de plat dans le formulaire d'ajout.
	 * 
	 * @param typePlatRecette
	 */
	private void validationType(String typePlatRecette) throws Exception {
		if (typePlatRecette != null && typePlatRecette.trim().length() < 3) {
			throw new Exception(
					"Le type de la recette doit contenir au moins 3 caractères.");
		}
	}

	/**
	 * Méthode qui valide la saisie de l'URL de l'image dans le formulaire
	 * d'ajout.
	 * 
	 * @param imgRecette
	 */
	private void validationImg(String imgRecette) throws Exception {
		if (imgRecette != null && imgRecette.trim().length() < 3) {
			throw new Exception(
					"L'URL de l'image doit contenir au moins 3 caractères.");
		}
	}

	/**
	 * Méthode qui valide la saisie des ingrédients dans le formulaire d'ajout.
	 * 
	 * @param ingredientsRecette
	 */
	private void validationIngredients(String ingredientsRecette)
			throws Exception {
		if (ingredientsRecette != null
				&& ingredientsRecette.trim().length() < 3) {
			throw new Exception(
					"La liste des ingrédients doit contenir au moins 3 caractères.");
		}
	}

	/**
	 * Méthode qui valide la saisie du texte dans le formulaire d'ajout.
	 * 
	 * @param texteRecette
	 */
	private void validationTexte(String texteRecette) throws Exception {
		if (texteRecette != null && texteRecette.trim().length() < 3) {
			throw new Exception("Le texte doit contenir au moins 3 caractères.");
		}
	}

}

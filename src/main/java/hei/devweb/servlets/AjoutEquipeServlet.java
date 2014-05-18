package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;
import hei.devweb.metier.MembreManager;
import hei.devweb.model.Equipe;
import hei.devweb.model.Membre;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AjoutEquipeServlet est la classe qui permet d'afficher le formulaire de
 * création d'une équipe ("ajouterEquipe.jsp").
 * 
 * @see HttpServlet
 */
public class AjoutEquipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/pages/ajouterEquipe.jsp";
	public static final String CHAMP1 = "anneeMandatEquipe";
	public static final String CHAMP2 = "imgEquipe";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";

	/**
	 * Pour gérer la méthode GET
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * 
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
		String anneeMandatEquipe = request.getParameter(CHAMP1);
		String imgEquipe = request.getParameter(CHAMP2);

		/* Validation du champ annéeMandat. */
		try {
			validationAnneeM(anneeMandatEquipe);
		} catch (Exception e) {
			erreurs.put(CHAMP1, e.getMessage());
		}
		/* Validation du champ URL de l'image */
		try {
			validationImg(imgEquipe);
		} catch (Exception e) {
			erreurs.put(CHAMP2, e.getMessage());
		}

		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {

			/* Ajout de l'équipe à la BDD */
			Integer idEquipe = EquipeManager.getInstance().listerEquipes()
					.size() + 1;
			EquipeManager.getInstance().ajouterEquipe(
					new Equipe(idEquipe, request
							.getParameter("anneeMandatEquipe"), request
							.getParameter("descriptionEquipe"), request
							.getParameter("imgEquipe")));

			response.sendRedirect("listeEquipes");
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
	 * Méthode qui valide la saisie de l'année de mandat dans le formulaire
	 * d'ajout.
	 * 
	 * @param annee
	 */
	private void validationAnneeM(String annee) throws Exception {
		List<Equipe> equipes = EquipeManager.getInstance().listerEquipes();
		for (int i = 0; i < equipes.size(); i++) {
			if (annee.equals(equipes.get(i).getAnneeMandat()))	
			{
				throw new Exception(
					"Cette année de mandat existe déjà.");
			}
		}
		
		
		if (annee != null && annee.trim().length() < 4) {
			throw new Exception(
					"L'annee de mandat doit contenir au moins 4 caractères.");
		}

	}

	/**
	 * Méthode qui valide la saisie de l'url d'une image dans le formulaire
	 * d'ajout.
	 * 
	 * @param img
	 */
	private void validationImg(String img) throws Exception {
		if (img != null && img.trim().length() < 3) {
			throw new Exception(
					"Vous devez saisir l'URL d'une photo de l'équipe.");
		}
	}

}

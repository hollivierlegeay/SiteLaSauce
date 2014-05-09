package hei.devweb.servlets;

import hei.devweb.metier.EvenementManager;
import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Evenement;
import hei.devweb.model.Recette;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutEvenementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static final String VUE = "/WEB-INF/pages/ajouterEvenement.jsp";
	public static final String CHAMP1 = "titreEvenement";
	public static final String CHAMP2 = "detailEvenement";
	public static final String CHAMP3 = "lieuEvenement";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/* Affichage de la page */
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String resultat;
		Map<String, String> erreurs = new HashMap<String, String>();

		/* Récupération des champs du formulaire. */
		String titreEvenement = request.getParameter(CHAMP1);
		String detailEvenement = request.getParameter(CHAMP2);
		String lieuEvenement = request.getParameter(CHAMP3);

		/* Validation du champ titre. */
		try {
			validationTitre(titreEvenement);
		} catch (Exception e) {
			erreurs.put(CHAMP1, e.getMessage());
		}
		/* Validation du champ détail */
		try {
			validationDetail(detailEvenement);
		} catch (Exception e) {
			erreurs.put(CHAMP2, e.getMessage());
		}
		/* Validation du champ lieu. */
		try {
			validationLieu(lieuEvenement);
		} catch (Exception e) {
			erreurs.put(CHAMP3, e.getMessage());
		}

		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {

			/* Ajout de l'evenement à la BDD */
			Integer idEvenement = EvenementManager.getInstance()
					.listerEvenements().size() + 1;
			Date dateEvenement = null;
			try {
				dateEvenement = dateFormat.parse(request
						.getParameter("dateEvenement"));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			EvenementManager.getInstance().ajouterEvenement(
					new Evenement(idEvenement, request
							.getParameter("titreEvenement"), dateEvenement,
							request.getParameter("detailEvenement"), request
									.getParameter("lieuEvenement")));

			response.sendRedirect("listeEvenements");
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

	private void validationTitre(String titreEvenement) throws Exception {
		if (titreEvenement != null && titreEvenement.trim().length() < 3) {
			throw new Exception(
					"Le titre de l'évènement doit contenir au moins 3 caractères.");
		}

	}

	private void validationDetail(String detailEvenement) throws Exception {
		if (detailEvenement != null && detailEvenement.trim().length() < 3) {
			throw new Exception(
					"La description doit contenir au moins 3 caractères.");
		}
	}

	private void validationLieu(String lieuEvenement) throws Exception {
		if (lieuEvenement != null && lieuEvenement.trim().length() < 3) {
			throw new Exception("Le lieu doit contenir au moins 3 caractères.");
		}
	}

}

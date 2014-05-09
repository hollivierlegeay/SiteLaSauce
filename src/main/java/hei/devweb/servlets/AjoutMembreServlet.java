package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutMembreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/pages/ajouterMembre.jsp";
	public static final String CHAMP1 = "nomMembre";
	public static final String CHAMP2 = "prenomMembre";
	public static final String CHAMP3 = "mailHEIMembre";
	public static final String CHAMP4 = "motdePasseMembre";
	public static final String CHAMP5 = "telephoneMembre";
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
		String nomMembre = request.getParameter(CHAMP1);
		String prenomMembre = request.getParameter(CHAMP2);
		String mailHEIMembre = request.getParameter(CHAMP3);
		String motdePasseMembre = request.getParameter(CHAMP4);
		String telephoneMembre = request.getParameter(CHAMP5);
		
		/* Validation du champ nom. */
		try {
			validationNom(nomMembre);
		} catch (Exception e) {
			erreurs.put(CHAMP1, e.getMessage());
		}
		/* Validation du champ prénom */
		try {
			validationPrenom(prenomMembre);
		} catch (Exception e) {
			erreurs.put(CHAMP2, e.getMessage());
		}
		/* Validation du champ mailHEI. */
		try {
			validationMail(mailHEIMembre);
		} catch (Exception e) {
			erreurs.put(CHAMP3, e.getMessage());
		}
		/* Validation du champ mot de passe. */
		try {
			validationMdp(motdePasseMembre);
		} catch (Exception e) {
			erreurs.put(CHAMP4, e.getMessage());
		}
		/* Validation du champ téléphone. */
		try {
			validationTel(telephoneMembre);
		} catch (Exception e) {
			erreurs.put(CHAMP5, e.getMessage());
		}
		
		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {

			/*Ajout du membre à la BDD*/
			Integer idMembre = MembreManager.getInstance().listerMembres().size() + 1;
			MembreManager.getInstance().ajouterMembre(
				new Membre(idMembre, request.getParameter("nomMembre"),request.getParameter("prenomMembre"),request.getParameter("motdePasseMembre"),request.getParameter("mailHEIMembre"),request.getParameter("telephoneMembre")));

			response.sendRedirect("listeMembres");
		} else {
			resultat = "Échec de la création.";
			
			/*
			 * Stockage du résultat et des messages d'erreur dans l'objet request
			 */
			request.setAttribute(ATT_ERREURS, erreurs);
			request.setAttribute(ATT_RESULTAT, resultat);
			
			/* Transmission de la paire d'objets request/response à notre JSP */
			this.getServletContext().getRequestDispatcher(VUE)
					.forward(request, response);

		}

	}

	private void validationNom(String nomMembre) throws Exception {
		if (nomMembre != null && nomMembre.trim().length() < 3) {
			throw new Exception(
					"Le nom doit contenir au moins 3 caractères.");
		}

	}

	private void validationPrenom(String prenomMembre)
			throws Exception {
		if (prenomMembre != null && prenomMembre.trim().length() < 3) {
			throw new Exception(
					"Le prénom doit contenir au moins 3 caractères.");
		}
	}

	private void validationMail(String mailHEIMembre) throws Exception {
		if (mailHEIMembre != null && mailHEIMembre.trim().length() < 3) {
			throw new Exception(
					"Le mail HEI doit contenir au moins 3 caractères.");
		}
	}

	private void validationMdp(String motdePasseMembre) throws Exception {
		if (motdePasseMembre != null && motdePasseMembre.trim().length() < 6) {
			throw new Exception(
					"Le mot de passe doit contenir au moins 6 caractères.");
		}
	}

	private void validationTel(String telephoneMembre)
			throws Exception {
		if (telephoneMembre != null
				&& telephoneMembre.trim().length() < 9) {
			throw new Exception(
					"Le telephone doit contenir au moins 9 caractères.");
		}
	}
}

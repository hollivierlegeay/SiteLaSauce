package hei.devweb.servlets;

import hei.devweb.beans.Utilisateur;
import hei.devweb.forms.ConnexionForm;
import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ConnexionServlet extends HttpServlet {
	public static final String VUE = "/WEB-INF/pages/connexion.jsp";
	public static final String VUE2 = "/WEB-INF/pages/indexM.jsp";
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER =
	"sessionUtilisateur";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Affichage de la page de connexion */
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		/* Préparation de l'objet formulaire */
		ConnexionForm form = new ConnexionForm();
		
		/* Traitement de la requête et récupération du bean en résultant */
		Utilisateur utilisateur = form.connecterUtilisateur( request);
		
		/* Initialisation des variables locales */
		String login = request.getParameter("email");
		String mdp = request.getParameter("motdepasse");
		
		/* Récupération de la session depuis la requête */
		HttpSession session = request.getSession();

		/**
		* Si aucune erreur de validation n'a eu lieu, alors ajout du bean
		* Utilisateur à la session, sinon suppression du bean de la
		session.
		*/
	
		List<Membre> membres = MembreManager.getInstance().listerMembres();
		for (int i = 0; i < membres.size(); i++) 
		{
			if(login.equals(membres.get(i).getMailHEI())
					&& mdp.equals(membres.get(i).getMotdePasse())
					&& login.endsWith("@hei.fr")
					&&form.getErreurs().isEmpty())
			{			
					session.setAttribute(ATT_SESSION_USER, utilisateur );
					//Connexion avec succès à l'espace membre

			} 
			else {
				session.setAttribute(ATT_SESSION_USER, null );
				//Echec de la connexion à l'espace membre
				}
		}
		
			/* Stockage du formulaire et du bean dans l'objet request
		*/
		request.setAttribute( ATT_FORM, form );
		request.setAttribute( ATT_USER, utilisateur );
		
		/* Redirection vers l'index de l'espace Membre*/
		this.getServletContext().getRequestDispatcher( VUE
		).forward( request, response );
		
		/* Vérification des champs email et mot de passe avec la base de données */
		

						
	}
}
			
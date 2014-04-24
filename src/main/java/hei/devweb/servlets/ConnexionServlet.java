package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Equipe;
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


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Affichage de la page de connexion */
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("email");
		String mdp = request.getParameter("motdepasse");
		HttpSession session = request.getSession();

		List<Membre> membres = MembreManager.getInstance().listerMembres();
		for (int i = 0; i < membres.size(); i++) {
			if (login.equals(membres.get(i).getMailHEI())
					&& mdp.equals(membres.get(i).getMotdePasse())
					&& login.endsWith("@hei.fr")) {

				session.setAttribute("mailHEI", membres.get(i).getMailHEI()); // Succès
																				// de
																				// la
																				// connexion
																				// à
																				// l'espace
																				// Membre

				/* Redirection vers le menu de l'espace Membre */
				response.sendRedirect("indexM");
			} else {
//				request.getRequestDispatcher("connexion");
				session.setAttribute("mailHEI", null); // Echec de connexion à
														// l'espace Membre
				
			}

		}
	}
}
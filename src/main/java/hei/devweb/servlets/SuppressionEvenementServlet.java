package hei.devweb.servlets;

import hei.devweb.metier.EvenementManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SuppressionEvenementServlet est la classe qui permet de réaliser la
 * suppression d'un évènement.
 * 
 * @see HttpServlet
 */
public class SuppressionEvenementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Pour gérer la méthode GET
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEvenement = Integer.parseInt(request
				.getParameter("idEvenement"));
		EvenementManager.getInstance().supprimerEvenement(idEvenement);
		response.sendRedirect("listeEvenements");
	}

}

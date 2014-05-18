package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SuppressionRecetteServlet est la classe qui permet de realiser la suppression
 * d'une recette
 * 
 * @see HttpServlet
 */
public class SuppressionRecetteServlet extends HttpServlet {
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
		Integer idRecette = Integer.parseInt(request.getParameter("idRecette"));
		RecetteManager.getInstance().supprimerRecette(idRecette);
		response.sendRedirect("listeRecettes");
	}

}

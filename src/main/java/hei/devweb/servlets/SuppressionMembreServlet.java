package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * SuppressionMembreServlet est la classe qui permet de réaliser la suppression d'un membre.
 * 
 * @see HttpServlet
 */
public class SuppressionMembreServlet extends HttpServlet {
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
		Integer idMembre = Integer.parseInt(request.getParameter("idMembre"));
		MembreManager.getInstance().supprimerMembre(idMembre);
		response.sendRedirect("listeMembres");
	}

}

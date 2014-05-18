package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SuppressionEquipeServlet est la classe qui permet de réaliser la suppression
 * d'une équipe.
 * 
 * @see HttpServlet
 */
public class SuppressionEquipeServlet extends HttpServlet {
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
		Integer idEquipe = Integer.parseInt(request.getParameter("idEquipe"));
		EquipeManager.getInstance().supprimerEquipe(idEquipe);
		response.sendRedirect("listeEquipes");
	}

}

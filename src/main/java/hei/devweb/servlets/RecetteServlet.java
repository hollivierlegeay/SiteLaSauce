package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Recette;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * RecetteServlet est la classe qui permet d'afficher la page JSP suivante
 * :"recette.jsp".
 * 
 * @see HttpServlet
 */
public class RecetteServlet extends HttpServlet {
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
		Recette recette = RecetteManager.getInstance().getRecette(idRecette);
		request.setAttribute("recette", recette);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/recette.jsp");
		view.forward(request, response);
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
		Integer idRecette = Integer.parseInt(request.getParameter("idRecette"));

		response.sendRedirect("Recette?id=" + idRecette);
	}
}

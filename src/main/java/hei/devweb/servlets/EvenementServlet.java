package hei.devweb.servlets;

import hei.devweb.metier.EvenementManager;
import hei.devweb.model.Evenement;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * EvenementServlet est la classe qui permet d'afficher la page
 * ("evenement.jsp").
 * 
 * @see HttpServlet
 */
public class EvenementServlet extends HttpServlet {
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
		Evenement evenement = EvenementManager.getInstance().getEvenement(
				idEvenement);
		request.setAttribute("evenement", evenement);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/evenement.jsp");
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
		Integer idEvenement = Integer.parseInt(request
				.getParameter("idEvenement"));

		response.sendRedirect("Evenement?id=" + idEvenement);
	}
}

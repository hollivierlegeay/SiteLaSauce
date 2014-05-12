package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * MembreServlet est la classe qui permet d'afficher la page JSP suivante :"membre.jsp".
 * 
 * @see HttpServlet
 */
public class MembreServlet extends HttpServlet {
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
		Membre membre = MembreManager.getInstance().getMembre(idMembre);
		request.setAttribute("membre", membre);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/membre.jsp");
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
		Integer idMembre = Integer.parseInt(request.getParameter("idMembre"));

		response.sendRedirect("membre?id=" + idMembre);
	}

}


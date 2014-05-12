package hei.devweb.servlets;

import hei.devweb.metier.EvenementManager;
import hei.devweb.model.Evenement;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ListeEvenementsServlet est la classe qui permet d'afficher la liste des évènements via la page JSP suivante :"listeEvenements.jsp".
 * 
 * @see HttpServlet
 */

public class ListeEvenementsServlet extends HttpServlet {
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
		List<Evenement> evenements = EvenementManager.getInstance()
				.listerEvenements();
		request.setAttribute("evenements", evenements);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/listeEvenements.jsp");
		view.forward(request, response);
	}
}


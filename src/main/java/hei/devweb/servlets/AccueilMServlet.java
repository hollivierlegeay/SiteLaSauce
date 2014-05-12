package hei.devweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * AccueilMServlet est la classe qui permet d'afficher la page "indexM.jsp" c'est à dire l'accueil de l'espace "Membres"
 * 
 * 
 */
public class AccueilMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * Pour gérer la méthode GET
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/indexM.jsp");
		view.forward(request, response);
	}

}

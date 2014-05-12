package hei.devweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * AccueilServlet est la classe qui permet d'afficher la page "index.jsp" c'est à dire l'accueil du site.
 * 
 * 
 */
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * Pour gérer la méthode GET
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/index.jsp");
		view.forward(request, response);
	}

}

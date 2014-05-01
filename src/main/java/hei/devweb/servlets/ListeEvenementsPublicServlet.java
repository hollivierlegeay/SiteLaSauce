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


public class ListeEvenementsPublicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Evenement> evenements = EvenementManager.getInstance()
				.listerEvenements();
		request.setAttribute("evenements", evenements);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/listeEvenementsPublic.jsp");
		view.forward(request, response);
	}
}


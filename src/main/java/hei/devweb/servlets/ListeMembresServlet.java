package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListeMembresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Membre> membres = MembreManager.getInstance().listerMembres();
		request.setAttribute("membres", membres);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/listeMembres.jsp");
		view.forward(request, response);
	}

}

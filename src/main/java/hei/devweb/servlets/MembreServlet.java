package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idMembre = Integer.parseInt(request.getParameter("idMembre"));

		response.sendRedirect("membre?id=" + idMembre);
	}

}


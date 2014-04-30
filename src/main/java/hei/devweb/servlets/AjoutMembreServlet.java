package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;
import hei.devweb.model.Membre;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutMembreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/ajouterMembre.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idMembre = MembreManager.getInstance().listerMembres().size() + 1;
		MembreManager.getInstance().ajouterMembre(
				new Membre(idMembre, request.getParameter("nomMembre"),request.getParameter("prenomMembre"),request.getParameter("motdePasseMembre"),request.getParameter("mailHEIMembre"),request.getParameter("telephoneMembre")));

		response.sendRedirect("listeMembres");
	}
}

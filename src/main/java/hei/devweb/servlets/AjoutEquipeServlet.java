package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;
import hei.devweb.model.Equipe;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutEquipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/ajouterEquipe.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEquipe = EquipeManager.getInstance().listerEquipes().size() + 1;
		EquipeManager.getInstance().ajouterEquipe(
				new Equipe(idEquipe, request.getParameter("anneeMandatEquipe"),request.getParameter("descriptionEquipe"),request.getParameter("imgEquipe")));

		response.sendRedirect("listeEquipes");
	}
}

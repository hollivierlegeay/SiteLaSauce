package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Recette;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutRecetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/ajouterRecette.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idRecette = RecetteManager.getInstance().listerRecettes().size() + 1;
		RecetteManager.getInstance().ajouterRecette(
				new Recette(idRecette, request.getParameter("titrePlatRecette"),request.getParameter("difficulteRecette"),request.getParameter("typePlatRecette"),request.getParameter("ingredientsRecette"),request.getParameter("texteRecette")));

		response.sendRedirect("listeRecettes");
	}
}

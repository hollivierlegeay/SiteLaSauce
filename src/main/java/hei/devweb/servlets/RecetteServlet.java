package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Recette;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idRecette = Integer.parseInt(request
				.getParameter("idRecette"));
		Recette recette = RecetteManager.getInstance().getRecette(
				idRecette);
		request.setAttribute("recette", recette);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/recette.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idRecette = Integer.parseInt(request
				.getParameter("idRecette"));

		response.sendRedirect("Recette?id=" + idRecette);
	}
}

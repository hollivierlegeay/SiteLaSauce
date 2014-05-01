package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuppressionRecetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idRecette = Integer.parseInt(request.getParameter("idRecette"));
		System.out
				.println("Dans controlleur 'SupprimerChapitre' avec idRecette="
						+ idRecette);
		RecetteManager.getInstance().supprimerRecette(idRecette);
		response.sendRedirect("listeRecettes");
	}

}

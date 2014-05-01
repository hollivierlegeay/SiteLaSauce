package hei.devweb.servlets;

import hei.devweb.metier.MembreManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuppressionMembreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idMembre = Integer.parseInt(request.getParameter("idMembre"));
		System.out
				.println("Dans controlleur 'SupprimerMembre' avec idMembre="
						+ idMembre);
		MembreManager.getInstance().supprimerMembre(idMembre);
		response.sendRedirect("listeMembres");
	}

}

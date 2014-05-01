package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuppressionEquipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEquipe = Integer.parseInt(request.getParameter("idEquipe"));
		System.out
				.println("Dans controlleur 'SupprimerEquipe' avec idEquipe="
						+ idEquipe);
		EquipeManager.getInstance().supprimerEquipe(idEquipe);
		response.sendRedirect("listeEquipes");
	}

}

package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;
import hei.devweb.model.Equipe;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListeEquipesPublicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Equipe> equipes = EquipeManager.getInstance().listerEquipes();
		request.setAttribute("equipes", equipes);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/listeEquipesPublic.jsp");
		view.forward(request, response);
	}

}

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

/**
 * ListeEquipesPublicServlet est la classe qui permet d'afficher la liste des
 * équipes via la page JSP suivante :"listeEquipesPublic.jsp".
 * 
 * @see HttpServlet
 */
public class ListeEquipesPublicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Pour gérer la méthode GET
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 */
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

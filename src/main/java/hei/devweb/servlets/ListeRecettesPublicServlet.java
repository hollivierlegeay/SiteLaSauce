package hei.devweb.servlets;

import hei.devweb.metier.RecetteManager;
import hei.devweb.model.Recette;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ListeRecettesPublicServlet est la classe qui permet d'afficher la liste des recettes via la page JSP suivante :"listeRecettesPublic.jsp".
 * 
 * @see HttpServlet
 */

public class ListeRecettesPublicServlet extends HttpServlet {
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
			List<Recette> recettes = RecetteManager.getInstance()
					.listerRecettes();
			request.setAttribute("recettes", recettes);

			RequestDispatcher view = request
					.getRequestDispatcher("WEB-INF/pages/listeRecettesPublic.jsp");
			view.forward(request, response);
		}
	}



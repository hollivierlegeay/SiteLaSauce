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

public class ListeRecettesPublicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
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



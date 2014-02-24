package hei.devweb.servlets;

import hei.devweb.metier.EquipeManager;
import hei.devweb.model.Equipe;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EquipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEquipe = Integer.parseInt(request.getParameter("idEquipe"));
		Equipe equipe = EquipeManager.getInstance().getEquipe(idEquipe);
		request.setAttribute("equipe", equipe);

		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/equipe.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEquipe = Integer.parseInt(request.getParameter("idEquipe"));

		response.sendRedirect("equipe?id=" + idEquipe);
	}

}

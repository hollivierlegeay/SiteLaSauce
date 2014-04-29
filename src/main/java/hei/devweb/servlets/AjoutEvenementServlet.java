package hei.devweb.servlets;

import hei.devweb.metier.EvenementManager;
import hei.devweb.model.Evenement;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutEvenementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/pages/ajouterEvenement.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer idEvenement = EvenementManager.getInstance().listerEvenements().size() + 1;
		Date dateEvenement = null;
		try {
			dateEvenement = dateFormat.parse(request.getParameter("dateEvenement"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		EvenementManager.getInstance().ajouterEvenement(
				new Evenement(idEvenement, request.getParameter("titreEvenement"),dateEvenement,request.getParameter("detailEvenement"),request.getParameter("lieuEvenement") ));

		response.sendRedirect("listeEvenements");
	}
}

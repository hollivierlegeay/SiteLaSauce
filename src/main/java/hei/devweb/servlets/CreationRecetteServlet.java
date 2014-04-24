package hei.devweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hei.devweb.beans.Recette;

public class CreationRecetteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * Récupération des données saisies, envoyées en tant que paramètres de
		 * la requête GET générée à la validation du formulaire
		 */
		String titrePlat = request.getParameter("titrePlatRecette");
		String difficulte = request.getParameter("difficulteRecette");
		String typePlat = request.getParameter("typePlatRecette");
		String ingredients = request.getParameter("ingredientsRecette");
		String texteRecette = request.getParameter("texteRecette");
		String message;
		/*
		 * Initialisation du message à afficher : si un des champs obligatoires
		 * du formulaire n'est pas renseigné, alors on affiche un message
		 * d'erreur, sinon on affiche un message de succès
		 */
		if (titrePlat.trim().isEmpty() || difficulte.trim().isEmpty() || texteRecette.trim().isEmpty()) 
		{
			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"/WEB-INF/pages/creerRecette.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une recette.";
		} else {
			message = "Recette créé avec succès !";
		}
		/*
		 * Création du bean Recette et initialisation avec les données
		 * récupérées
		 */
		Recette recette = new Recette();
		recette.setTitrePlat(titrePlat);
		recette.setDifficulte(difficulte);
		recette.setTypePlat(typePlat);
		recette.setIngredients(ingredients);
		recette.setTexteRecette(texteRecette);
		/* Ajout du bean et du message à l'objet requête */
		request.setAttribute("recette", recette);
		request.setAttribute("message", message);
		/*
		 * Transmission à la page JSP en charge de l'affichage des données
		 */
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/afficherRecette.jsp")
				.forward(request, response);
	}
}
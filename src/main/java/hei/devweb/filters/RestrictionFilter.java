package hei.devweb.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * RestrictionFilter est la classe qui permet de restreindre l'accès à l'espace Membres.
 *
 */
public class RestrictionFilter implements Filter {
	public static final String ACCES_PUBLIC = "/connexion";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	/**
	 * Méthode appelée par le conteneur, elle permet d'ajouter des paramètres à l'initialisation du filtre.
	 *
	 * @param FilterConfig 
	 * 			Paramètre d'initialisation du filtre
	 *
	 */
	public void init(FilterConfig config) throws ServletException {
	}
	/**
	 * Méthode unique du filtre, donne les consignes à suivre.
	 *
	 * @param FilterChain 
	 * 			Paramètre du filtre.
	 * @see FilterChain
	 *
	 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		/* Cast des objets request et response */
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		/* Récupération de la session depuis la requête */
		HttpSession session = request.getSession();
		/**
		 * Si l'objet utilisateur n'existe pas dans la session en cours, alors
		 * l'utilisateur n'est pas connecté.
		 */
		if (session.getAttribute(ATT_SESSION_USER) == null) {
			/* Redirection vers la page publique */
			response.sendRedirect(request.getContextPath() + ACCES_PUBLIC);
		} else {
			/* Affichage de la page restreinte */
			chain.doFilter(request, response);
		}
	}
	/**
	 * Méthode liée au cycle de vie du filtre
	 * 
	 */
	public void destroy() {
	}
}

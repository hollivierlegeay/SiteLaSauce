package hei.devweb.forms;

import hei.devweb.beans.Utilisateur;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
/**
 * <b>ConnexionForm est la classe représentant le formulaire de connexion pour traiter et valider les données et connecter l'utilisateur</b>
 * <p>Un utilisateur est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un email HEI qui est propre à chaque membre.</li>
 * <li>Un mot de passe choisi lors de la création du membre enregistré dans la base de données.</li>
 * <li>Un nom.</li>
 * </ul>
 * </p>
 * <p>
 *L'Utilisateur n'intervient que pour la page de connexion à l'espace Membres.
 * </p>
 * 
 * 
 * 
 */
public final class ConnexionForm {
	 /**
     * Le champs email. 
     */
	private static final String CHAMP_EMAIL = "email";
	 /**
     * Le champs mot de passe.
     */
	private static final String CHAMP_PASS = "motdepasse";
	 /**
     * Le résultat du formulaire : Succès ou echec de la connexion.
     */
	private String resultat;
	 /**
     * Les erreurs sur le formulaire.
     */
	private Map<String, String> erreurs = new HashMap<String, String>();

	/**
     * Retourne le résultat de la connexion.
     * 
     * @return Le résultat de la connexion. 
     */
	public String getResultat() {
		return resultat;
	}
	/**
     * Retourne les erreurs relevées sur le formulaire.
     * 
     * @return Les erreurs. 
     */
	public Map<String, String> getErreurs() {
		return erreurs;
	}
	/**
     * Méthode qui traite et valide les données saisient dans le formulaire.
     * @param HttpServletRequest 
     * 			Contenu du formulaire
     * @return L'objet Utilisateur.
     * 
     * @see Utilisateur
     */
	public Utilisateur connecterUtilisateur(HttpServletRequest request) {
		/* Récupération des champs du formulaire */
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String motDePasse = getValeurChamp(request, CHAMP_PASS);
		Utilisateur utilisateur = new Utilisateur();
		/* Validation du champ email. */
		try {
			validationEmail(email);
		} catch (Exception e) {
			setErreur(CHAMP_EMAIL, e.getMessage());
		}
		utilisateur.setEmail(email);
		/* Validation du champ mot de passe. */
		try {
			validationMotDePasse(motDePasse);
		} catch (Exception e) {
			setErreur(CHAMP_PASS, e.getMessage());
		}
		utilisateur.setMotDePasse(motDePasse);
		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {
			resultat = "Succès de la connexion.";

		} else {
			resultat = "Échec de la connexion.";
		}
		return utilisateur;
	}

	/**
	 * Méthode qui valide l'adresse email saisie.
	 * @param email
	 * 		Mail saisi par l'utilisateur sur la page de connexion.
	 */
	private void validationEmail(String email) throws Exception {
		if (email != null
				&& !email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
			throw new Exception("Merci de saisir une adresse mail valide.");
		}
	}

	/**
	 * Méthode qui valide le mot de passe saisi.
	 * @param motDePasse
	 * 		Mot de passe saisi par l'utilisateur sur la page de connexion.
	 */
	private void validationMotDePasse(String motDePasse) throws Exception {
		if (motDePasse != null) {
			if (motDePasse.length() < 3) {
				throw new Exception(
						"Le mot de passe doit contenir au moins 3 caractères.");
			}
		} else {
			throw new Exception("Merci de saisir votre mot de passe.");
		}
	}

	/**
	 * Méthode qui ajoute un message correspondant au champ spécifié à la map des erreurs.
	 * @param champ
	 * @param message
	 */
	private void setErreur(String champ, String message) {
		erreurs.put(champ, message);
	}

	/**
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 * 
	 * @param HttpServletRequest
	 * @param nomChamp
	 * 
	 */
	private static String getValeurChamp(HttpServletRequest request,
			String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}
}
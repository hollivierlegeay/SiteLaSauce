package hei.devweb.beans;

/**
 * <b>Utilisateur est la classe représentant un utilisateur qui se connecte à
 * l'espace Membres</b>
 * <p>
 * Un utilisateur est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un email HEI qui est propre à chaque membre.</li>
 * <li>Un mot de passe choisi lors de la création du membre enregistré dans la
 * base de données.</li>
 * <li>Un nom.</li>
 * </ul>
 * </p>
 * <p>
 * L'Utilisateur n'intervient que pour la page de connexion à l'espace Membres.
 * </p>
 * 
 * 
 * 
 */

public class Utilisateur {
	/**
	 * L'email de l'utilisateur. Ce mail n'est pas modifiable.
	 * 
	 * @see Utilisateur#setEmail(String)
	 * @see Utilisateur#getEmail()
	 */
	private String email;
	/**
	 * Le mot de passe de l'utilisateur. Ce mot de passe n'est pas modifiable.
	 * 
	 * @see Utilisateur#setMotDePasse(String)
	 * @see Utilisateur#getMotDePasse()
	 */
	private String motDePasse;
	/**
	 * Le nom de l'utilisateur.
	 * 
	 * @see Utilisateur#setNom(String)
	 * @see Utilisateur#getNom()
	 */
	private String nom;

	/**
	 * Met à jour le mail de l'utilisateur.
	 * 
	 * @param email
	 *            Le nouveau email de l'utilisateur.
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Retourne le mail de l'utilisateur.
	 * 
	 * @return Le mail de l'utilisateur.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Met à jour le mot de passe de l'utilisateur.
	 * 
	 * @param motDePasse
	 *            Le nouveau mot de passe de l'utilisateur.
	 * 
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Retourne le mot de passe de l'utilisateur.
	 * 
	 * @return Le nom de l'utilisateur.
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Met à jour le nom de l'utilisateur.
	 * 
	 * @param nom
	 *            Le nouveau nom de l'utilisateur.
	 * 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Retourne le nom de l'utilisateur.
	 * 
	 * @return Le nom de l'utilisateur.
	 */
	public String getNom() {
		return nom;
	}
}
package hei.devweb.model;

/**
 * <b>Membre est la classe représentant un membre de l'association</b>
 * <p>
 * Un membre est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Un nom.</li>
 * <li>Une prénom.</li>
 * <li>Un mot de passe.</li>
 * <li>Un email HEI.</li>
 * <li>Un numéro de téléphone.</li>
 * </ul>
 * </p>
 * 
 * 
 * 
 */
public class Membre {
	/**
	 * L'id du membre. Cet id est généré automatiquement lors de la création du
	 * membre.
	 * 
	 * @see Membre#getIdMembre()
	 * @see Membre#setIdMembre(Integer)
	 */
	private Integer idMembre;
	/**
	 * Le nom du membre.
	 * 
	 * @see Membre#getNom()
	 * @see Membre#setNom(String)
	 */
	private String nom;
	/**
	 * Le prénom du membre.
	 * 
	 * @see Membre#getPrenom()
	 * @see Membre#setPrenom(String)
	 */
	private String prenom;
	/**
	 * Le mot de passe du membre.
	 * 
	 * @see Membre#getMotdePasse()
	 * @see Membre#setMotdePasse(String)
	 */
	private String motdePasse;
	/**
	 * L'email HEI du membre.
	 * 
	 * @see Membre#getMailHEI()
	 * @see Membre#setMailHEI(String)
	 */
	private String mailHEI;
	/**
	 * Le téléphone du membre.
	 * 
	 * @see Membre#getTelephone()
	 * @see Membre#setTelephone(String)
	 */
	private String telephone;

	/**
	 * Constructeur de la classe Membre
	 * 
	 * @param idMembre
	 *            L'identifiant du membre.
	 * @param nom
	 *            Le nom du membre.
	 * @param prenom
	 *            Le prénom du membre.
	 * @param motdePasse
	 *            Le mot de passe du membre.
	 * @param mailHEI
	 *            Le mail HEI du membre.
	 * @param telephone
	 *            Le telephone du membre.
	 * 
	 * 
	 */
	public Membre(Integer idMembre, String nom, String prenom,
			String motdePasse, String mailHEI, String telephone) {
		super();
		this.idMembre = idMembre;
		this.nom = nom;
		this.prenom = prenom;
		this.motdePasse = motdePasse;
		this.mailHEI = mailHEI;
		this.telephone = telephone;

	}

	/**
	 * Retourne l'id du membre.
	 * 
	 * @return L'id du membre.
	 */
	public Integer getIdMembre() {
		return idMembre;
	}

	/**
	 * Met à jour l'id du membre
	 * 
	 * @param idMembre
	 *            Le nouvel id du membre.
	 * 
	 */
	public void setIdMembre(Integer idMembre) {
		this.idMembre = idMembre;
	}

	/**
	 * Retourne le nom du membre.
	 * 
	 * @return Le nom du membre.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Met à jour le nom du membre
	 * 
	 * @param nom
	 *            Le nom du membre.
	 * 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Retourne le prenom du membre.
	 * 
	 * @return Le prenom du membre.
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Met à jour le prenom du membre.
	 * 
	 * @param prenom
	 *            Le prenom du membre.
	 * 
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Retourne le mot de passe du membre.
	 * 
	 * @return Le mot de passe du membre.
	 */

	public String getMotdePasse() {
		return motdePasse;
	}

	/**
	 * Met à jour le mot de passe du membre.
	 * 
	 * @param motdePasse
	 *            Le mot de passe du membre.
	 * 
	 */
	public void setMotdePasse(String motdePasse) {
		this.motdePasse = motdePasse;
	}

	/**
	 * Retourne le mail HEI du membre.
	 * 
	 * @return Le mail HEI du membre.
	 */
	public String getMailHEI() {
		return mailHEI;
	}

	/**
	 * Met à jour le mail HEI du membre.
	 * 
	 * @param mailHEI
	 *            Le mail HEI du membre.
	 * 
	 */
	public void setMailHEI(String mailHEI) {
		this.mailHEI = mailHEI;
	}

	/**
	 * Retourne le téléphone du membre.
	 * 
	 * @return Le téléphone du membre.
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Met à jour le téléphone du membre.
	 * 
	 * @param telephone
	 *            Le téléphone du membre.
	 * 
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}

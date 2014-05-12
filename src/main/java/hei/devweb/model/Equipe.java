package hei.devweb.model;

/**
 * <b>Equipe est la classe représentant une équipe de l'association</b>
 * <p>
 * Une équipe est caractérisée par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Une année de mandat. ex : 2013/2014</li>
 * <li>Une description de l'équipe.</li>
 * <li>Une image de l'équipe.</li>
 * </ul>
 * </p>
 * 
 * 
 * 
 */
public class Equipe {
	/**
	 * L'id de l'équipe. Cet id n'est pas modifiable et est généré
	 * automatiquement lors de la création de l'équipe.
	 * 
	 * @see Equipe#setIdEquipe(Integer)
	 * @see Equipe#getIdEquipe()
	 */
	private Integer idEquipe;
	/**
	 * L'année de mandat de l'équipe.
	 * 
	 * @see Equipe#setAnneeMandat(String)
	 * @see Equipe#getAnneeMandat()
	 */
	private String anneeMandat;
	/**
	 * La description de l'équipe.
	 * 
	 * @see Equipe#setDescriptionEquipe(String)
	 * @see Equipe#getDescriptionEquipe()
	 */
	private String descriptionEquipe;
	/**
	 * L'URL de l'image de l'équipe.
	 * 
	 * @see Equipe#setImgEquipe(String)
	 * @see Equipe#getImgEquipe()
	 */
	private String imgEquipe;

	/**
	 * Constructeur de la classe Equipe
	 * 
	 * @param idEquipe
	 *            L'identifiant de l'équipe.
	 * @param anneeMandat
	 *            L'année de mandat de l'équipe.
	 * @param descriptionEquipe
	 *            La description de l'équipe.
	 * @param imgEquipe
	 *            L'URL de la photo de l'équipe.
	 * 
	 * 
	 */
	public Equipe(Integer idEquipe, String anneeMandat,
			String descriptionEquipe, String imgEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.anneeMandat = anneeMandat;
		this.descriptionEquipe = descriptionEquipe;
		this.imgEquipe = imgEquipe;
	}

	/**
	 * Retourne l'URL de la photo de l'équipe.
	 * 
	 * @return L'URL de la photo.
	 */
	public String getImgEquipe() {
		return imgEquipe;
	}

	/**
	 * Met à jour l'URL de la photo de l'équipe.
	 * 
	 * @param imgEquipe
	 *            La nouvelle URL de la photo de l'équipe.
	 * 
	 */
	public void setImgEquipe(String imgEquipe) {
		this.imgEquipe = imgEquipe;
	}

	/**
	 * Retourne la description de l'équipe.
	 * 
	 * @return La description.
	 */
	public String getDescriptionEquipe() {
		return descriptionEquipe;
	}

	/**
	 * Met à jour la description de l'équipe.
	 * 
	 * @param descriptionEquipe
	 *            La nouvelle description de l'équipe.
	 * 
	 */
	public void setDescriptionEquipe(String descriptionEquipe) {
		this.descriptionEquipe = descriptionEquipe;
	}

	/**
	 * Retourne l'id de l'équipe.
	 * 
	 * @return L'id.
	 */
	public Integer getIdEquipe() {
		return idEquipe;
	}

	/**
	 * Met à jour l'id de l'équipe.
	 * 
	 * @param idEquipe
	 *            Le nouvel id de l'équipe.
	 * 
	 */
	public void setIdEquipe(Integer idEquipe) {
		this.idEquipe = idEquipe;
	}

	/**
	 * Retourne l'année de mandat de l'équipe.
	 * 
	 * @return L'année de mandat.
	 */
	public String getAnneeMandat() {
		return anneeMandat;
	}

	/**
	 * Met à jour l'année de mandat de l'équipe.
	 * 
	 * @param anneeMandat
	 *            La nouvelle anneeMandat de l'équipe.
	 * 
	 */
	public void setAnneeMandat(String anneeMandat) {
		this.anneeMandat = anneeMandat;
	}

}

package hei.devweb.model;

/**
 * <b>Recette est la classe représentant une recette</b>
 * <p>
 * Une recette est caractérisée par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Un titre.</li>
 * <li>Une URL de photo de recette.</li>
 * <li>Une difficulté.</li>
 * <li>Un type de plat.</li>
 * <li>Des ingrédients.</li>
 * <li>Un texte qui décrit la recette.</li>
 * </ul>
 * </p>
 * 
 * 
 * 
 */
public class Recette {
	/**
	 * L'id de la recette. Cet id est généré automatiquement lors de la création
	 * de la recette.
	 * 
	 * @see Recette#getIdRecette()
	 * @see Recette#setIdRecette(Integer)
	 */
	private Integer idRecette;
	/**
	 * Le titre de la recette.
	 * 
	 * @see Recette#getTitrePlat()
	 * @see Recette#setTitrePlat(String)
	 */
	private String titrePlat;
	/**
	 * L'URL de l'image de la recette.
	 * 
	 * @see Recette#getImgRecette()
	 * @see Recette#setImgRecette(String)
	 */
	private String imgRecette;
	/**
	 * La difficulté de la recette.
	 * 
	 * @see Recette#getDifficulte()
	 * @see Recette#setDifficulte(String)
	 */
	private String difficulte;
	/**
	 * Le type de plat.
	 * 
	 * @see Recette#getTypePlat()
	 * @see Recette#setTypePlat(String)
	 */
	private String typePlat;
	/**
	 * Les ingrédients de la recette.
	 * 
	 * @see Recette#getIngredients()
	 * @see Recette#setIngredients(String)
	 */
	private String ingredients;
	/**
	 * Le texte de la recette.
	 * 
	 * @see Recette#getTexteRecette()
	 * @see Recette#setTexteRecette(String)
	 */
	private String texteRecette;

	/**
	 * Constructeur de la classe Recette
	 * 
	 * @param idRecette
	 *            L'identifiant de la recette.
	 * @param titrePlat
	 *            Le titre de la recette.
	 * @param imgRecette
	 *            L'URL de l'image de la recette.
	 * @param difficulte
	 *            La difficulté de la recette.
	 * @param typePlat
	 *            Le type de plat.
	 * @param ingredients
	 *            Les ingrédients de la recette.
	 * @param texteRecette
	 *            Le texte de la recette.
	 * 
	 * 
	 */
	public Recette(Integer idRecette, String titrePlat, String imgRecette,
			String difficulte, String typePlat, String ingredients,
			String texteRecette) {
		super();

		this.idRecette = idRecette;
		this.titrePlat = titrePlat;
		this.imgRecette = imgRecette;
		this.difficulte = difficulte;
		this.typePlat = typePlat;
		this.ingredients = ingredients;
		this.texteRecette = texteRecette;

	}

	/**
	 * Retourne l'URL de l'image de la recette
	 * 
	 * @return l'URL de l'image.
	 */
	public String getImgRecette() {
		return imgRecette;
	}

	/**
	 * Met à jour l'URL de l'image de la recette
	 * 
	 * @param imgRecette
	 *            La nouvelle URL de l'image de la recette.
	 * 
	 */
	public void setImgRecette(String imgRecette) {
		this.imgRecette = imgRecette;
	}

	/**
	 * Retourne le titre de la recette.
	 * 
	 * @return Le titre de la recette.
	 */
	public String getTitrePlat() {
		return titrePlat;
	}

	/**
	 * Met à jour le titre de la recette
	 * 
	 * @param titrePlat
	 *            Le nouveau titre de la recette.
	 * 
	 */
	public void setTitrePlat(String titrePlat) {
		this.titrePlat = titrePlat;
	}

	/**
	 * Retourne la difficulté de la recette.
	 * 
	 * @return La difficulté de la recette.
	 */
	public String getDifficulte() {
		return difficulte;
	}

	/**
	 * Met à jour la difficulté de la recette
	 * 
	 * @param difficulte
	 *            La nouvelle difficulté de la recette.
	 * 
	 */
	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}

	/**
	 * Retourne le type de plat de la recette.
	 * 
	 * @return Le type de plat de la recette.
	 */
	public String getTypePlat() {
		return typePlat;
	}

	/**
	 * Met à jour le type de plat de la recette
	 * 
	 * @param typePlat
	 *            Le nouveau type de plat de la recette.
	 * 
	 */
	public void setTypePlat(String typePlat) {
		this.typePlat = typePlat;
	}

	/**
	 * Retourne les ingrédients de la recette.
	 * 
	 * @return Les ingrédients de la recette.
	 */
	public String getIngredients() {
		return ingredients;
	}

	/**
	 * Met à jour les ingrédients de la recette
	 * 
	 * @param ingrédients
	 *            Le nouveau champ ingrédients de la recette.
	 * 
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Retourne le texte de la recette.
	 * 
	 * @return Le texte de la recette.
	 */
	public String getTexteRecette() {
		return texteRecette;
	}

	/**
	 * Met à jour le texte de la recette
	 * 
	 * @param texteRecette
	 *            Le nouveau texte de la recette.
	 * 
	 */

	public void setTexteRecette(String texteRecette) {
		this.texteRecette = texteRecette;
	}

	/**
	 * Retourne l'id de la recette.
	 * 
	 * @return L'id de la recette.
	 */
	public Integer getIdRecette() {
		return idRecette;
	}

	/**
	 * Met à jour l'id de la recette
	 * 
	 * @param idRecette
	 *            Le nouvel id de la recette.
	 * 
	 */

	public void setIdRecette(Integer idRecette) {
		this.idRecette = idRecette;
	}

}

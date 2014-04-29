package hei.devweb.model;

public class Recette {

	private Integer idRecette;
	private String titrePlat;
	private String imgRecette;
	private String difficulte;
	private String typePlat;
	private String ingredients;
	private String texteRecette;

	public Recette(Integer idRecette, String titrePlat, String imgRecette, String difficulte, String typePlat, String ingredients, String texteRecette) {
		super();
		this.idRecette = idRecette;
		this.titrePlat = titrePlat;
		this.imgRecette = imgRecette;
		this.difficulte = difficulte;
		this.typePlat = typePlat;
		this.ingredients = ingredients;
		this.texteRecette = texteRecette;

	}

	public String getImgRecette() {
		return imgRecette;
	}

	public void setImgRecette(String imgRecette) {
		this.imgRecette = imgRecette;
	}

	
	public String getTitrePlat() {
		return titrePlat;
	}

	public void setTitrePlat(String titrePlat) {
		this.titrePlat = titrePlat;
	}

	public String getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}

	public String getTypePlat() {
		return typePlat;
	}

	public void setTypePlat(String typePlat) {
		this.typePlat = typePlat;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getTexteRecette() {
		return texteRecette;
	}

	public void setTexteRecette(String texteRecette) {
		this.texteRecette = texteRecette;
	}

	public Integer getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(Integer idRecette) {
		this.idRecette = idRecette;
	}

}

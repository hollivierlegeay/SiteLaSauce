package hei.devweb.beans;

public class Recette {

	private Integer idRecette;
	private String titrePlat;
	private String difficulte;
	private String typePlat;
	private String ingredients;
	private String texteRecette;

	public Recette() {
		super();

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

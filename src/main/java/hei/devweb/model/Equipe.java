package hei.devweb.model;

public class Equipe {

	private Integer idEquipe;
	private String anneeMandat;
	private String descriptionEquipe;
	private String imgEquipe;

	public Equipe(Integer idEquipe, String anneeMandat, String descriptionEquipe, String imgEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.anneeMandat = anneeMandat;
		this.descriptionEquipe = descriptionEquipe;
		this.imgEquipe =imgEquipe;
	}

	public String getImgEquipe() {
		return imgEquipe;
	}

	public void setImgEquipe(String imgEquipe) {
		this.imgEquipe = imgEquipe;
	}

	public String getDescriptionEquipe() {
		return descriptionEquipe;
	}

	public void setDescriptionEquipe(String descriptionEquipe) {
		this.descriptionEquipe = descriptionEquipe;
	}

	public Integer getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(Integer idEquipe) {
		this.idEquipe = idEquipe;
	}

	public String getAnneeMandat() {
		return anneeMandat;
	}

	public void setAnneeMandat(String anneeMandat) {
		this.anneeMandat = anneeMandat;
	}

}

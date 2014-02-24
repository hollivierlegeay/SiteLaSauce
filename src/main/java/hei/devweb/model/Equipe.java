package hei.devweb.model;

public class Equipe {

	private Integer idEquipe;
	private String anneeMandat;
	private String descriptionEquipe;

	public Equipe(Integer idEquipe, String anneeMandat, String descriptionEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.anneeMandat = anneeMandat;
		this.descriptionEquipe = descriptionEquipe;

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

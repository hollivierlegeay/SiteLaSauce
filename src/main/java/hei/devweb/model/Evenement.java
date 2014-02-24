package hei.devweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Evenement {
	
	private static DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

	
	private Integer idEvenement;
	private String titreEvenement;
	private Date dateEvenement;
	private String detailEvenement;
	private String lieuEvenement;
	
	public Evenement(Integer idEvenement, String titreEvenement, Date dateEvenement, String detailEvenement, String lieuEvenement) {
		super();
		this.idEvenement = idEvenement;
		this.titreEvenement = titreEvenement;
		this.dateEvenement = dateEvenement;
		this.detailEvenement = detailEvenement;
		this.lieuEvenement = lieuEvenement;
	}

	public Integer getIdEvenement() {
		return idEvenement;
	}

	public void setIdEvenement(Integer idEvenement) {
		this.idEvenement = idEvenement;
	}

	public String getTitreEvenement() {
		return titreEvenement;
	}

	public void setTitreEvenement(String titreEvenement) {
		this.titreEvenement = titreEvenement;
	}

	public Date getDateEvenement() {
		return dateEvenement;
	}

	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	public String getDetailEvenement() {
		return detailEvenement;
	}

	public void setDetailEvenement(String detailEvenement) {
		this.detailEvenement = detailEvenement;
	}

	public String getLieuEvenement() {
		return lieuEvenement;
	}

	public void setLieuEvenement(String lieuEvenement) {
		this.lieuEvenement = lieuEvenement;
	}



}

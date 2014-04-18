package hei.devweb.model;

public class Membre {

	private Integer idMembre;
	private String nom;
	private String prenom;
	private String motdePasse;
	private String mailHEI;
	private String telephone;

	public Membre(Integer idMembre, String nom, String prenom, String motdePasse, String mailHEI, String telephone) {
		super();
		this.idMembre = idMembre;
		this.nom = nom;
		this.prenom = prenom;
		this.motdePasse = motdePasse;
		this.mailHEI = mailHEI;
		this.telephone = telephone;

	}

	public Integer getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(Integer idMembre) {
		this.idMembre = idMembre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMotdePasse() {
		return motdePasse;
	}

	public void setMotdePasse(String motdePasse) {
		this.motdePasse = motdePasse;
	}

	public String getMailHEI() {
		return mailHEI;
	}

	public void setMailHEI(String mailHEI) {
		this.mailHEI = mailHEI;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



}

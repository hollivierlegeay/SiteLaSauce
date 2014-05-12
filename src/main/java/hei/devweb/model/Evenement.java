package hei.devweb.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <b>Evenement est la classe représentant une évènement de l'association</b>
 * <p>
 * Une évènement est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Un titre.</li>
 * <li>Une date.</li>
 * <li>Un détail, qui est la description de l'évènement.</li>
 * <li>Un lieu.</li>
 * </ul>
 * </p>
 * 
 * 
 * 
 */
public class Evenement {
	/**
	 * Format de la date.
	 * 
	 */
	private static DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
	/**
	 * L'id de l'évènement. Cet id n'est pas modifiable et est généré
	 * automatiquement lors de la création de l'évènement.
	 * 
	 * @see Evenement#setIdEvenement(Integer)
	 * @see Evenement#getIdEvenement()
	 */
	private Integer idEvenement;
	/**
	 * Le titre de l'évènement.
	 * 
	 * @see Evenement#setTitreEvenement(String)
	 * @see Evenement#getTitreEvenement()
	 */
	private String titreEvenement;
	/**
	 * La date de l'évènement.
	 * 
	 * @see Evenement#setDateEvenement(Date)
	 * @see Evenement#getDateEvenement()
	 */
	private Date dateEvenement;
	/**
	 * Le detail de l'évènement.
	 * 
	 * @see Evenement#setDetailEvenement(String)
	 * @see Evenement#getDetailEvenement()
	 */
	private String detailEvenement;
	/**
	 * Le lieu de l'évènement.
	 * 
	 * @see Evenement#setLieuEvenement(String)
	 * @see Evenement#getLieuEvenement()
	 */
	private String lieuEvenement;

	/**
	 * Constructeur de la classe Evenement
	 * 
	 * @param idEvenement
	 *            L'identifiant de l'évènement.
	 * @param titreEvenement
	 *            Le titre de l'évènement.
	 * @param dateEvenement
	 *            La date de l'évènement.
	 * @param detailEvenement
	 *            Le detail de l'évènement.
	 * @param lieuEvenement
	 *            Le lieu de l'évènement.
	 * 
	 * 
	 */
	public Evenement(Integer idEvenement, String titreEvenement,
			Date dateEvenement, String detailEvenement, String lieuEvenement) {
		super();
		this.idEvenement = idEvenement;
		this.titreEvenement = titreEvenement;
		this.dateEvenement = dateEvenement;
		this.detailEvenement = detailEvenement;
		this.lieuEvenement = lieuEvenement;
	}

	/**
	 * Retourne l'id de l'évènement.
	 * 
	 * @return L'id de l'évènement.
	 */
	public Integer getIdEvenement() {
		return idEvenement;
	}

	/**
	 * Met à jour l'id de l'évènement.
	 * 
	 * @param idEvenement
	 *            Le nouvel id de l'évènement.
	 * 
	 */
	public void setIdEvenement(Integer idEvenement) {
		this.idEvenement = idEvenement;
	}

	/**
	 * Retourne le titre de l'évènement.
	 * 
	 * @return Le titre de l'évènement.
	 */
	public String getTitreEvenement() {
		return titreEvenement;
	}

	/**
	 * Met à jour le titre de l'évènement.
	 * 
	 * @param titreEvenement
	 *            Le nouveau titre de l'évènement.
	 * 
	 */
	public void setTitreEvenement(String titreEvenement) {
		this.titreEvenement = titreEvenement;
	}

	/**
	 * Retourne la date de l'évènement.
	 * 
	 * @return La date de l'évènement.
	 */
	public Date getDateEvenement() {
		return dateEvenement;
	}

	/**
	 * Met à jour la date de l'évènement.
	 * 
	 * @param dateEvenement
	 *            La date de l'évènement.
	 * 
	 */
	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}

	/**
	 * Retourne le détail de l'évènement.
	 * 
	 * @return Le détail de l'évènement.
	 */
	public String getDetailEvenement() {
		return detailEvenement;
	}

	/**
	 * Met à jour le détail de l'évènement.
	 * 
	 * @param détailEvenement
	 *            Le nouveau détail de l'évènement.
	 * 
	 */
	public void setDetailEvenement(String detailEvenement) {
		this.detailEvenement = detailEvenement;
	}

	/**
	 * Retourne le lieu de l'évènement.
	 * 
	 * @return Le lieu de l'évènement.
	 */
	public String getLieuEvenement() {
		return lieuEvenement;
	}

	/**
	 * Met à jour le lieu de l'évènement.
	 * 
	 * @param lieuEvenement
	 *            Le nouveau lieu de l'évènement.
	 * 
	 */
	public void setLieuEvenement(String lieuEvenement) {
		this.lieuEvenement = lieuEvenement;
	}

}

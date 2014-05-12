package hei.devweb.dao;

import hei.devweb.model.Evenement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * <b>EvenementDaoTestCase est la classe qui teste les méthodes de la classe
 * EvenementDao</b>
 * <p>
 * Rappel : * Une évènement est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Un titre.</li>
 * <li>Une date.</li>
 * <li>Un détail, qui est la description de l'évènement.</li>
 * <li>Un lieu.</li>
 * </ul>
 * </p>
 * 
 * @see EvenementDao
 * 
 */

public class EvenementDaoTestCase {

	private EvenementDao evenementDao = new EvenementDao();

	/**
	 * Méthode qui vide le contenu de la base de données
	 * 
	 */
	@Before
	public void purgeBDD() throws Exception {
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM Evenement");
		stmt.executeUpdate("INSERT INTO Evenement (idEvenement,titreEvenement,dateEvenement,detailEvenement,lieuEvenement) VALUES (1,'Evenement1', '2013-11-01','soiree de foliiiiiiiie','r�sidence St-JO')");
		stmt.close();
		connection.close();
	}

	/**
	 * Méthode qui teste la méthode "listerEvenement" de la classe EvenementDao.
	 * 
	 * @see EvenementDao#listerEvenements()
	 * 
	 */
	@Test
	public void testListerEvenements() {
		List<Evenement> evenements = evenementDao.listerEvenements();
		Assert.assertEquals(1, evenements.size());
		Assert.assertEquals(1, evenements.get(0).getIdEvenement().intValue());
		Assert.assertEquals("Evenement1", evenements.get(0).getTitreEvenement());
		Assert.assertEquals("soiree de foliiiiiiiie", evenements.get(0)
				.getDetailEvenement());
		Assert.assertEquals("r�sidence St-JO", evenements.get(0)
				.getLieuEvenement());

		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Assert.assertEquals(cal.getTime(), evenements.get(0).getDateEvenement());
	}

	/**
	 * Méthode qui teste la méthode "ajouterEvenement" de la classe
	 * EvenementDao.
	 * 
	 * @see EvenementDao#ajouterEvenement(Evenement)
	 * 
	 */
	@Test
	public void testAjouterEvenement() throws Exception {
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 2);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		Evenement nouveauEvenement = new Evenement(null, "Evenement2",
				cal.getTime(), "diner special de noel", "residence Saint-Omer");
		evenementDao.ajouterEvenement(nouveauEvenement);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM Evenement");
		results.next();
		results.next();
		Assert.assertEquals("Evenement2", results.getString("titreEvenement"));
		Assert.assertEquals(cal.getTime(), results.getDate("dateEvenement"));
		Assert.assertEquals("diner special de noel",
				results.getString("detailEvenement"));
		Assert.assertEquals("residence Saint-Omer",
				results.getString("lieuEvenement"));
	}

	/**
	 * Méthode qui teste la méthode "getEvenement" de la classe EvenementDao.
	 * 
	 * @see EvenementDao#getEvenement(Integer)
	 * 
	 */
	@Test
	public void testgetEvenement() {
		Evenement Evenement = evenementDao.getEvenement(1);
		Assert.assertEquals(1, Evenement.getIdEvenement().intValue());
		Assert.assertEquals("Evenement1", Evenement.getTitreEvenement());
		Assert.assertEquals("soiree de foliiiiiiiie",
				Evenement.getDetailEvenement());
		Assert.assertEquals("r�sidence St-JO", Evenement.getLieuEvenement());

		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Assert.assertEquals(cal.getTime(), Evenement.getDateEvenement());

	}

}

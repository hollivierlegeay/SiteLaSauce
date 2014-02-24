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

public class EvenementDaoTestCase {

	private EvenementDao evenementDao = new EvenementDao();

	@Before
	public void purgeBDD() throws Exception {
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM Evenement");
		stmt.executeUpdate("INSERT INTO Evenement (idEvenement,titreEvenement,dateEvenement,detailEvenement,lieuEvenement) VALUES (1,'Evenement1', '2013-11-01','soiree de foliiiiiiiie','résidence St-JO')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testListerEvenements() {
		List<Evenement> evenements = evenementDao.listerEvenements();
		Assert.assertEquals(1, evenements.size());
		Assert.assertEquals(1, evenements.get(0).getIdEvenement().intValue());
		Assert.assertEquals("Evenement1", evenements.get(0).getTitreEvenement());
		Assert.assertEquals("soiree de foliiiiiiiie", evenements.get(0).getDetailEvenement());
		Assert.assertEquals("résidence St-JO", evenements.get(0).getLieuEvenement());

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

		Evenement nouveauEvenement = new Evenement(null, "Evenement2", cal.getTime(),"diner special de noel" ,"residence Saint-Omer");
		evenementDao.ajouterEvenement(nouveauEvenement);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM Evenement");
		results.next();
		results.next();
		Assert.assertEquals("Evenement2", results.getString("titreEvenement"));
		Assert.assertEquals(cal.getTime(), results.getDate("dateEvenement"));
		Assert.assertEquals("diner special de noel", results.getString("detailEvenement"));
		Assert.assertEquals("residence Saint-Omer", results.getString("lieuEvenement"));
	}

	@Test
	public void testgetEvenement() {
		Evenement Evenement = evenementDao.getEvenement(1);
		Assert.assertEquals(1, Evenement.getIdEvenement().intValue());
		Assert.assertEquals("Evenement1", Evenement.getTitreEvenement());
		Assert.assertEquals("soiree de foliiiiiiiie", Evenement.getDetailEvenement());
		Assert.assertEquals("résidence St-JO", Evenement.getLieuEvenement());
	

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

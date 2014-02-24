package hei.devweb.dao;

import hei.devweb.model.Recette;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecetteDaoTestCase {

	private RecetteDao recetteDao = new RecetteDao();

	@Before
	public void purgeBDD() throws Exception {
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM Recette");
		stmt.executeUpdate("INSERT INTO Recette (idRecette,titrePlat,difficulte,typePlat,ingredients,texteRecette) VALUES (1,'Recette1','facile','entrée','ingrédient1','Contenu1')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testListerRecettes() {
		List<Recette> recettes = recetteDao.listerRecettes();
		Assert.assertEquals(1, recettes.size());
		Assert.assertEquals(1, recettes.get(0).getIdRecette().intValue());
		Assert.assertEquals("Recette1", recettes.get(0).getTitrePlat());
		Assert.assertEquals("facile", recettes.get(0).getDifficulte());
		Assert.assertEquals("entrée", recettes.get(0).getTypePlat());
		Assert.assertEquals("ingrédient1", recettes.get(0).getIngredients());
		Assert.assertEquals("Contenu1", recettes.get(0).getTexteRecette());
	}

	@Test
	public void testAjouterRecette() throws Exception {

		Recette nouveauRecette = new Recette(null, "Recette2","difficile","plat","ingredient2" ,"Text2");
		recetteDao.ajouterRecette(nouveauRecette);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM Recette");
		results.next();
		results.next();
		Assert.assertEquals("Recette2", results.getString("titrePlat"));
		Assert.assertEquals("difficile", results.getString("difficulte"));
		Assert.assertEquals("plat", results.getString("typePlat"));
		Assert.assertEquals("ingredient2", results.getString("ingredients"));
		Assert.assertEquals("Text2", results.getString("texteRecette"));
	}

	@Test
	public void testgetRecette() {
		Recette Recette = recetteDao.getRecette(1);
		Assert.assertEquals(1, Recette.getIdRecette().intValue());
		Assert.assertEquals("Recette1", Recette.getTitrePlat());
		Assert.assertEquals("facile", Recette.getDifficulte());
		Assert.assertEquals("entrée", Recette.getTypePlat());
		Assert.assertEquals("ingrédient1", Recette.getIngredients());
		Assert.assertEquals("Contenu1", Recette.getTexteRecette());

	}

}

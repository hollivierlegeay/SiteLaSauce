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
		stmt.executeUpdate("INSERT INTO Recette (idRecette,titrePlat,imgRecette,difficulte,typePlat,ingredients,texteRecette) VALUES (1,'Recette1','https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyydlw1E4x8RYso8IA88WC6gw-RowY7VyuPgcWwiJWef8DiWF3','facile','entree','ingrédient1','Contenu1')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testListerRecettes() {
		List<Recette> recettes = recetteDao.listerRecettes();
		Assert.assertEquals(1, recettes.size());
		Assert.assertEquals(1, recettes.get(0).getIdRecette().intValue());
		Assert.assertEquals("Recette1", recettes.get(0).getTitrePlat());
		Assert.assertEquals("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyydlw1E4x8RYso8IA88WC6gw-RowY7VyuPgcWwiJWef8DiWF3",recettes.get(0).getImgRecette());
		Assert.assertEquals("facile", recettes.get(0).getDifficulte());
		Assert.assertEquals("entree", recettes.get(0).getTypePlat());
		Assert.assertEquals("ingrédient1", recettes.get(0).getIngredients());
		Assert.assertEquals("Contenu1", recettes.get(0).getTexteRecette());
	}

	@Test
	public void testAjouterRecette() throws Exception {

		Recette nouveauRecette = new Recette(null,"Recette2","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTq3uGOxV3lK6hflhVPKSusgZhgtm-4k41CGF9Iw2JP1ppZySXE", "difficile","plat","ingredient2" ,"Text2");
		recetteDao.ajouterRecette(nouveauRecette);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM Recette");
		results.next();
		results.next();
		Assert.assertEquals("Recette2", results.getString("titrePlat"));
		Assert.assertEquals("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTq3uGOxV3lK6hflhVPKSusgZhgtm-4k41CGF9Iw2JP1ppZySXE",results.getString("imgRecette"));
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
		Assert.assertEquals("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyydlw1E4x8RYso8IA88WC6gw-RowY7VyuPgcWwiJWef8DiWF3",Recette.getImgRecette());
		Assert.assertEquals("facile", Recette.getDifficulte());
		Assert.assertEquals("entree", Recette.getTypePlat());
		Assert.assertEquals("ingrédient1", Recette.getIngredients());
		Assert.assertEquals("Contenu1", Recette.getTexteRecette());

	}

}

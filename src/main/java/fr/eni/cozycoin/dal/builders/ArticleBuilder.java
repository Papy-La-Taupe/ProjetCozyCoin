package fr.eni.cozycoin.dal.builders;

import fr.eni.cozycoin.bo.Article;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleBuilder {
    public Article articleBuilder(ResultSet rs) throws SQLException {
        Article article;
        article = new Article();
        article.setNumArticle(rs.getInt("no_article"));
        article.setNom(rs.getString("nom_article"));
        article.setDescription(rs.getString("description"));
        article.setDebut(rs.getDate("date_debut_encheres"));
        article.setFin(rs.getDate("date_fin_encheres"));
        article.setPrixInitial(rs.getInt("prix_initial"));
        article.setPrixVente(rs.getInt("prix_vente"));
        article.setUserId(rs.getInt("no_utilisateur"));
        article.setCategorie(rs.getInt("no_categorie"));

        return article;
    }

}

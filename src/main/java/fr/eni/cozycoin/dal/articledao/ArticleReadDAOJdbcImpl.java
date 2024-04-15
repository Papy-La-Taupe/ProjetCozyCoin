package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.dal.ConnectionProvider;
import fr.eni.cozycoin.dal.builders.ArticleBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleReadDAOJdbcImpl implements ArticleReadDAO {
    private static final String SELECT = "SELECT no_article,nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie FROM articles_vendus;";


    public List<Article> readArticles() {
        List<Article> articles = new ArrayList<>();

        try (Connection cnx = ConnectionProvider.getConnection()) {
            PreparedStatement pstmt = cnx.prepareStatement(SELECT);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ArticleBuilder builder = new ArticleBuilder();
                    Article article = builder.articleBuilder(rs);
                    articles.add(article);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

}

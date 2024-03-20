package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticleUpdateDAOJdbcImpl implements ArticleUpdateDAO {
    private static final String UPDATE = "UPDATE articles_vendus SET nom_article=?, description=?, date_debut_encheres=?,date_fin_encheres=?,prix_intial=?, prix_vente=?, no_categorie=? WHERE nom_article=?;";

    public void updateArticle(String nom, Article article) {
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(UPDATE);
            pstmt.setString(1, article.getNom());
            pstmt.setString(2, article.getDescription());
            pstmt.setDate(3, article.getDebut());
            pstmt.setDate(4, article.getFin());
            pstmt.setInt(5, article.getPrixInitial());
            pstmt.setInt(6, article.getPrixVente());
            pstmt.setInt(7, article.getCategorie());
            pstmt.setString(8, nom);
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

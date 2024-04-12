package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.dal.ConnectionProvider;
import fr.eni.cozycoin.dal.builders.ArticleBuilder;
import fr.eni.cozycoin.dal.builders.UserBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleReadDAOJdbcImpl implements ArticleReadDAO {
    private static final String SELECT = "SELECT nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie FROM articles_vendus WHERE no_article=?;";


    public Article readArticle(int id) {

        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(SELECT);
            pstmt.setInt(1, id);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()) {
                    ArticleBuilder builder = new ArticleBuilder();
                    return builder.articleBuilder(rs);
                }else{
                    System.out.println("une erreur est survenue lors de la recherche");
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

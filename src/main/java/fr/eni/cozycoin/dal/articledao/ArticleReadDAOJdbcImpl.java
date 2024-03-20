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
    private static final String SELECT = "SELECT pseudo, nom, prenom, email,telephone, rue, code_postal,ville, mot_de_passe FROM articles_vendus WHERE nom_article=?;";


    public Article readArticle(String nom) {

        if(nom.isEmpty()){
            System.out.println("email introuvable");
        }
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(SELECT);
            pstmt.setString(1, nom);
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

package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ArticleDeleteDAOJdbcImpl implements ArticleDeleteDAO {
    private static final String DELETE = "DELETE FROM articles_vendus WHERE nom_article=?;";

    public void deleteArticle(String nom){
        if(nom.equals("")){
            //prévoir exception
            System.out.println("Pas d'article");
        }
        try(Connection cnx = ConnectionProvider.getConnection()) {
            PreparedStatement pstmt = cnx.prepareStatement(DELETE);
            pstmt.setString(1, nom);
            pstmt.executeUpdate();
            System.out.println("L'article : "+nom+" a bien été supprimé !");
        }
        catch(SQLException e){
            //a améliorer par exception perso
            e.printStackTrace();
        }
    }


}



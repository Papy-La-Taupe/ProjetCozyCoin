package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class ArticleCreateDAOJdbcImpl implements ArticleCreateDAO {
    private static final String INSERT ="INSERT INTO articles_vendus(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?)";

    public void createArticle(String nom, String description, Date debut, Date fin, int prixInitial, User user, int categorie) {
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(INSERT);
            pstmt.setString(1, nom);
            pstmt.setString(2, description);
            pstmt.setDate(3, debut);
            pstmt.setDate(4, fin);
            pstmt.setInt(5, prixInitial);
            pstmt.setInt(6, user.getNumUtilisateur());
            pstmt.setInt(7, categorie);
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

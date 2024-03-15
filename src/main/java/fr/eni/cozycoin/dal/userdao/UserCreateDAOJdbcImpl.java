package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCreateDAOJdbcImpl implements UserCreateDAO {
    private static final String INSERT ="INSERT INTO utilisateurs(pseudo, nom, prenom, email,telephone, rue, code_postal,ville, mot_de_passe) VALUES(?,?,?,?,?,?,?,?,?)";
    @Override
    public void createUser(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) {
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(INSERT);
            pstmt.setString(1, pseudo);
            pstmt.setString(2, nom);
            pstmt.setString(3, prenom);
            pstmt.setString(4, email);
            pstmt.setString(5, telephone);
            pstmt.setString(6, rue);
            pstmt.setString(7, codePostal);
            pstmt.setString(8, ville);
            pstmt.setString(9, motDePasse);
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

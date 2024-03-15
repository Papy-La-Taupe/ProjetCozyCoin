package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateDAOJdbcImpl implements UserUpdateDAO{
    private static final String UPDATE = "UPDATE utilisateurs SET pseudo=?, nom=?, prenom=?,email=?,telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=? WHERE email=?;";
    @Override
    public void updateUser(String email, User user) {
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(UPDATE);
            pstmt.setString(1, user.getPseudo());
            pstmt.setString(2, user.getNom());
            pstmt.setString(3, user.getPrenom());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getTelephone());
            pstmt.setString(6, user.getRue());
            pstmt.setString(7, user.getCodePostal());
            pstmt.setString(8, user.getVille());
            pstmt.setString(9, user.getMotDePasse());
            pstmt.setString(10, email);
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserReadDAOJdbcImpl implements UserReadDAO{
    private static final String SELECT = "SELECT pseudo, nom, prenom, email,telephone, rue, code_postal,ville, mot_de_passe FROM utilisateurs WHERE email=?;";
    @Override
    public User readUser(String email) {
        if(email.isEmpty()){
            System.out.println("email introuvable");
        }
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(SELECT);
            pstmt.setString(1, email);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()) {
                    return userBuilder(rs);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    private User userBuilder(ResultSet rs) throws SQLException{
        User user;
        user = new User();
        user.setNumUtilisateur(rs.getInt("no_utilisateur"));
        user.setPseudo(rs.getString("pseudo"));
        user.setNom(rs.getString("nom"));
        user.setPrenom(rs.getString("prenom"));
        user.setEmail(rs.getString("email"));
        user.setTelephone(rs.getString("telephone"));
        user.setRue(rs.getString("rue"));
        user.setCodePostal(rs.getString("code_postal"));
        user.setVille(rs.getString("ville"));
        user.setMotDePasse(rs.getString("mot_de_passe"));

        return user;
    }
}

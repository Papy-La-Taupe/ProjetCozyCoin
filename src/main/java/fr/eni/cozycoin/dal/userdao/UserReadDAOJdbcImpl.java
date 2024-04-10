package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.ConnectionProvider;
import fr.eni.cozycoin.dal.builders.UserBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserReadDAOJdbcImpl implements UserReadDAO{
    private static final String SELECT = "SELECT no_utilisateur, pseudo, nom, prenom, email,telephone, rue, code_postal,ville, mot_de_passe FROM utilisateurs WHERE email=? OR pseudo=?;";

    @Override
    public User readUser(String identifiant) {

        if(identifiant.isEmpty()){
            System.out.println("ce mix identifiant/mot de passe ne fonctionne pas");
        }
        try(Connection cnx = ConnectionProvider.getConnection()){
            PreparedStatement pstmt = cnx.prepareStatement(SELECT);
            pstmt.setString(1, identifiant);
            pstmt.setString(2, identifiant);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()) {
                    UserBuilder builder = new UserBuilder();
                    return builder.userBuilder(rs);
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

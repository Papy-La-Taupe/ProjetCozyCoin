package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.dal.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeleteDAOJdbcImpl implements UserDeleteDAO{
    private static final String DELETE = "DELETE FROM utilisateurs WHERE no_utilisateur=?;";
    @Override
    public void deleteUser(int no_utilisateur){
        if(no_utilisateur == 0){
            //prévoir exception
            System.out.println("Pas d'id");
        }
        try(Connection cnx = ConnectionProvider.getConnection()) {
            PreparedStatement pstmt = cnx.prepareStatement(DELETE);
            pstmt.setInt(1, no_utilisateur);
            pstmt.executeUpdate();
            System.out.println("L'utilisateur (id : "+no_utilisateur+") a bien été supprimé !");
        }
        catch(SQLException e){
            //a améliorer par exception perso
            e.printStackTrace();
        }
    }
}



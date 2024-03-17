package fr.eni.cozycoin.dal.builders;

import fr.eni.cozycoin.bo.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBuilder {
    public User userBuilder(ResultSet rs) throws SQLException {
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

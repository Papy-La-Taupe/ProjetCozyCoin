package fr.eni.cozycoin.bll.usermanager;

import fr.eni.cozycoin.dal.DAOUserFactory;
import fr.eni.cozycoin.dal.userdao.UserCreateDAO;

public class UserCreateManager {
    private final UserCreateDAO userCreateDAO;
    public UserCreateManager(){
        this.userCreateDAO = DAOUserFactory.userCreateDAO();
    }

    public void CreateUser(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse){
        this.userCreateDAO.createUser(pseudo, nom, prenom, email,telephone, rue, codePostal,ville, motDePasse);
    }
}

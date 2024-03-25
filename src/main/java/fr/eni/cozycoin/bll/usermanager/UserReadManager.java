package fr.eni.cozycoin.bll.usermanager;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.DAOUserFactory;
import fr.eni.cozycoin.dal.userdao.UserReadDAO;

public class UserReadManager {
    private final UserReadDAO userReadDAO;
    public UserReadManager(){
        this.userReadDAO = DAOUserFactory.userReadDAO();
    }

    public User ReadUser(String identifiant){
       return this.userReadDAO.readUser(identifiant);
    }
}

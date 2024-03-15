package fr.eni.cozycoin.bll.usermanager;

import fr.eni.cozycoin.dal.DAOUserFactory;
import fr.eni.cozycoin.dal.userdao.UserReadDAO;

public class UserReadManager {
    private final UserReadDAO userReadDAO;
    public UserReadManager(){
        this.userReadDAO = DAOUserFactory.userReadDAO();
    }

    public void ReadUser(String email){
        this.userReadDAO.readUser(email);
    }
}

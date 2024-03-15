package fr.eni.cozycoin.bll.usermanager;

import fr.eni.cozycoin.dal.DAOUserFactory;
import fr.eni.cozycoin.dal.userdao.UserDeleteDAO;

public class UserDeleteManager {
    private final UserDeleteDAO userDeleteDAO;
    public UserDeleteManager(){
        this.userDeleteDAO = DAOUserFactory.userDeleteDAO();
    }

    public void DeleteUser(int no_utilisateur){
        this.userDeleteDAO.deleteUser(no_utilisateur);
    }
}

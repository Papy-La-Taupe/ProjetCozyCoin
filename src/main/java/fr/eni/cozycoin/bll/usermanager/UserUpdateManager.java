package fr.eni.cozycoin.bll.usermanager;

import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.DAOUserFactory;
import fr.eni.cozycoin.dal.userdao.UserUpdateDAO;

public class UserUpdateManager {
    private final UserUpdateDAO userUpdateDAO;
    public UserUpdateManager(){
        this.userUpdateDAO = DAOUserFactory.userUpdateDAO();
    }

    public void UpdateUser(String email, User user){
        this.userUpdateDAO.updateUser(email, user);
    }
}

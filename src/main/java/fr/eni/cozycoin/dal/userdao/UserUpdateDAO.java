package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.bo.User;

public interface UserUpdateDAO {
    public void updateUser(String email, User user);
}

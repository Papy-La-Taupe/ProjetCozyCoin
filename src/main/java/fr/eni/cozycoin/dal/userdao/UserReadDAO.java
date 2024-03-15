package fr.eni.cozycoin.dal.userdao;

import fr.eni.cozycoin.bo.User;

public interface UserReadDAO {
    public User readUser(String email);
}

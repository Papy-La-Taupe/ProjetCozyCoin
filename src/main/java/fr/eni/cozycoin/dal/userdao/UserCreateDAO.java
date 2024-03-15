package fr.eni.cozycoin.dal.userdao;

public interface UserCreateDAO {
    public void createUser(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse);
}

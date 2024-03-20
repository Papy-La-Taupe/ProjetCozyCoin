package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.User;

import java.sql.Date;

public interface ArticleCreateDAO {
    public void createArticle(String nom, String description, Date debut, Date fin, int prixInitial, User user, int categorie);
}

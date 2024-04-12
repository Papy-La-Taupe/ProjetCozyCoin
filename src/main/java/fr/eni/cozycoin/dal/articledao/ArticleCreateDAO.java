package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.User;

import java.sql.Date;
import java.time.LocalDate;

public interface ArticleCreateDAO {
    public void createArticle(String nom, String description, LocalDate debut, LocalDate fin, int prixInitial, User user, int categorie);
}

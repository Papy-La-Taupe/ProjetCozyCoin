package fr.eni.cozycoin.bll.articlemanager;


import fr.eni.cozycoin.bo.User;
import fr.eni.cozycoin.dal.DAOArticleFactory;
import fr.eni.cozycoin.dal.articledao.ArticleCreateDAO;
import java.sql.Date;


public class ArticleCreateManager {
    private final ArticleCreateDAO articleCreateDAO;
    public ArticleCreateManager(){
        this.articleCreateDAO = DAOArticleFactory.articleCreateDAO();
    }

    public void CreateArticle(String nom, String description, Date debut, Date fin, int prixInitial, User user, int categorie){
        this.articleCreateDAO.createArticle(nom, description, debut, fin, prixInitial, user, categorie);
    }
}

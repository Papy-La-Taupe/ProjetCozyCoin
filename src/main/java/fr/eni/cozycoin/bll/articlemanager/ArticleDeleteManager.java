package fr.eni.cozycoin.bll.articlemanager;

import fr.eni.cozycoin.dal.articledao.ArticleDeleteDAO;
import fr.eni.cozycoin.dal.DAOArticleFactory;
public class ArticleDeleteManager {
    private final ArticleDeleteDAO articleDeleteDAO;
    public ArticleDeleteManager(){
        this.articleDeleteDAO = DAOArticleFactory.articleDeleteDAO();
    }

    public void DeleteArticle(String nom){
        this.articleDeleteDAO.deleteArticle(nom);
    }
}

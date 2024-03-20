package fr.eni.cozycoin.bll.articlemanager;


import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.dal.DAOArticleFactory;
import fr.eni.cozycoin.dal.articledao.ArticleUpdateDAO;

public class ArticleUpdateManager {
    private final ArticleUpdateDAO articleUpdateDAO;
    public ArticleUpdateManager(){
        this.articleUpdateDAO = DAOArticleFactory.articleUpdateDAO();
    }

    public void UpdateArticle(String nom, Article article){
        this.articleUpdateDAO.updateArticle(nom, article);
    }
}

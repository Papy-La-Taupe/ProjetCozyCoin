package fr.eni.cozycoin.bll.articlemanager;

import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.dal.DAOArticleFactory;
import fr.eni.cozycoin.dal.articledao.ArticleReadDAO;

import java.util.List;

public class ArticleReadManager {
    private final ArticleReadDAO articleReadDAO;
    public ArticleReadManager(){
        this.articleReadDAO = DAOArticleFactory.articleReadDAO();
    }

    public List<Article> ReadArticles(){
        return articleReadDAO.readArticles();
    }
}

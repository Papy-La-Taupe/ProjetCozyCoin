package fr.eni.cozycoin.bll.articlemanager;

import fr.eni.cozycoin.dal.DAOArticleFactory;
import fr.eni.cozycoin.dal.articledao.ArticleReadDAO;

public class ArticleReadManager {
    private final ArticleReadDAO articleReadDAO;
    public ArticleReadManager(){
        this.articleReadDAO = DAOArticleFactory.articleReadDAO();
    }

    public void ReadArticle(String nom){
        this.articleReadDAO.readArticle(nom);
    }
}

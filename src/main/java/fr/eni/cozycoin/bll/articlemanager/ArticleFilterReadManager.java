package fr.eni.cozycoin.bll.articlemanager;

import fr.eni.cozycoin.dal.DAOArticleFactory;
import fr.eni.cozycoin.dal.articledao.ArticleFilterReadDAO;
import fr.eni.cozycoin.dal.articledao.ArticleReadDAO;

public class ArticleFilterReadManager {
    private final ArticleFilterReadDAO articleFilterReadDAO;
    public ArticleFilterReadManager(){
        this.articleFilterReadDAO = DAOArticleFactory.articleFilterReadDAO();
    }

    public void ReadFilterArticle(int id){
        this.articleFilterReadDAO.readFilterArticle(id);
    }
}

package fr.eni.cozycoin.dal;

import fr.eni.cozycoin.dal.articledao.*;

public class DAOArticleFactory {
    public static ArticleCreateDAO articleCreateDAO() {
        return new ArticleCreateDAOJdbcImpl();
    }
    public static ArticleReadDAO articleReadDAO() {
        return new ArticleReadDAOJdbcImpl();
    }
    public static ArticleUpdateDAO articleUpdateDAO() {
        return new ArticleUpdateDAOJdbcImpl();
    }
    public static ArticleDeleteDAO articleDeleteDAO() {
        return new ArticleDeleteDAOJdbcImpl();
    }
}

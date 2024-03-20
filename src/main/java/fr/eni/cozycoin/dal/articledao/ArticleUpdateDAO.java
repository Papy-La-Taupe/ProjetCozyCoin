package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;

public interface ArticleUpdateDAO {
    public void updateArticle(String nom, Article article);
}

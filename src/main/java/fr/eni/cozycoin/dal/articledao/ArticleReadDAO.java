package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;

public interface ArticleReadDAO {
    public Article readArticle(String nom);
}

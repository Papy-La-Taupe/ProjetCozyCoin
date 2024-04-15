package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;

import java.util.List;

public interface ArticleReadDAO {
    List<Article> readArticles();
}

package fr.eni.cozycoin.dal.articledao;

import fr.eni.cozycoin.bo.Article;

public interface ArticleFilterReadDAO {
    Article readFilterArticle(int id);
}

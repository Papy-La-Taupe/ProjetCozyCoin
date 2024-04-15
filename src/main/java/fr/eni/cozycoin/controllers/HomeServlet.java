package fr.eni.cozycoin.controllers;

import fr.eni.cozycoin.bll.articlemanager.ArticleReadManager;
import fr.eni.cozycoin.bll.usermanager.UserReadManager;
import fr.eni.cozycoin.bo.Article;
import fr.eni.cozycoin.bo.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final ArticleReadManager manager = new ArticleReadManager();
        final List<Article> articles = manager.ReadArticles();

        req.setAttribute("articles", articles);
        req.getRequestDispatcher("/WEB-INF/jspFiles/home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/jspFiles/home.jsp").forward(req, resp);
    }
}

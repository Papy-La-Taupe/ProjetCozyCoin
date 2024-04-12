package fr.eni.cozycoin.controllers.article;

import fr.eni.cozycoin.bll.articlemanager.ArticleCreateManager;
import fr.eni.cozycoin.bll.usermanager.UserCreateManager;
import fr.eni.cozycoin.bll.usermanager.UserReadManager;
import fr.eni.cozycoin.bo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

@WebServlet("/newSale")
public class NewSaleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jspFiles/article/newSale.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String nomArticle = req.getParameter("nomArticle");
        final String description = req.getParameter("description");
        final LocalDate dateDebutEncheres = LocalDate.parse(req.getParameter("dateDebutEncheres"));
        final LocalDate dateFinEncheres = LocalDate.parse(req.getParameter("dateFinEncheres"));
        final int prixInitial = Integer.parseInt(req.getParameter("prixInitial"));
        HttpSession session = req.getSession();
        final User user = (User) session.getAttribute("connectedUser");
        final int noCategorie = Integer.parseInt(req.getParameter("noCategorie"));
        final ArticleCreateManager manager = new ArticleCreateManager();
        manager.CreateArticle(nomArticle, description, dateDebutEncheres, dateFinEncheres, prixInitial, user, noCategorie);
        req.getRequestDispatcher("/WEB-INF/jspFiles/home.jsp").forward(req, resp);
    }
}

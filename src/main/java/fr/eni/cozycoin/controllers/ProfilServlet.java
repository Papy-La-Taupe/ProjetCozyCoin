package fr.eni.cozycoin.controllers;

import fr.eni.cozycoin.bll.usermanager.UserCreateManager;
import fr.eni.cozycoin.bll.usermanager.UserReadManager;
import fr.eni.cozycoin.bll.usermanager.UserUpdateManager;
import fr.eni.cozycoin.bo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/profil")
public class ProfilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jspFiles/profil.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final String pseudo = req.getParameter("pseudo");
        final String nom = req.getParameter("nom");
        final String prenom = req.getParameter("prenom");
        final String email = req.getParameter("email");
        final String telephone = req.getParameter("telephone");
        final String rue = req.getParameter("rue");
        final String codePostal = req.getParameter("codePostal");
        final String ville = req.getParameter("ville");
        final String motDePasse = req.getParameter("motDePasse");

        HttpSession session = req.getSession();
        final User connectedUser = (User) session.getAttribute("connectedUser");
        final String connectedUserEmail = connectedUser.getEmail();
        final User userUpdater = new User(pseudo,nom,prenom,email,telephone,rue,codePostal,ville,motDePasse);

        final UserUpdateManager manager = new UserUpdateManager();
        manager.UpdateUser(connectedUserEmail, userUpdater);

        final UserReadManager updateUserManager = new UserReadManager();
        final User updatedUser = updateUserManager.ReadUser(pseudo);

        session.setAttribute("connectedUser", updatedUser);
        req.getRequestDispatcher("/WEB-INF/jspFiles/profil.jsp").forward(req, resp);
    }
}

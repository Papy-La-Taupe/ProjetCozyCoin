package fr.eni.cozycoin.controllers.user;

import java.io.*;

import fr.eni.cozycoin.bll.usermanager.UserReadManager;
import fr.eni.cozycoin.bo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jspFiles/user/connexion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String identifiant = req.getParameter("identifiant");
        final String motDePasse = req.getParameter("motDePasse");
        final UserReadManager manager = new UserReadManager();
        final User user = manager.ReadUser(identifiant);
        if(user != null && user.getMotDePasse().equals(motDePasse)){
            HttpSession session = req.getSession();
            session.setAttribute("connectedUser", user);
            resp.sendRedirect("home");
        }
        else{
            req.setAttribute("error", "error");
            req.getRequestDispatcher("/WEB-INF/jspFiles/user/connexion.jsp").forward(req, resp);
        }
    }
}

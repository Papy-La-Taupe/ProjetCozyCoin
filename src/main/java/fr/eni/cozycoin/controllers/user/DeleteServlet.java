package fr.eni.cozycoin.controllers.user;

import fr.eni.cozycoin.bll.usermanager.UserDeleteManager;
import fr.eni.cozycoin.bo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jspFiles/user/delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        final User connectedUser = (User) session.getAttribute("connectedUser");
        final int connectedUserId = connectedUser.getNumUtilisateur();
        final UserDeleteManager manager = new UserDeleteManager();

        manager.DeleteUser(connectedUserId);
        req.getSession().invalidate();
        req.getRequestDispatcher("/WEB-INF/jspFiles/user/connexion.jsp").forward(req, resp);
    }
}

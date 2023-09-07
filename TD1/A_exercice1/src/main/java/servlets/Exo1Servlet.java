package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class Exo1Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO appeler la jsp de login
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//TODO récupérer le login et le mdp et les comparer avec la paire stockée statiquement; appeler la jsp bonjour en cas de succès et la jsp de login sinon
        String login=request.getParameter("login");
        String password=request.getParameter("password");

        if (login.equals("fabii") && password.equals("fabii")) {
            request.setAttribute("login", login);
            request.setAttribute("password",password);
            request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request,response);
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }
}

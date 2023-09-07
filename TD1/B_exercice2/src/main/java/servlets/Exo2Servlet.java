package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class Exo2Servlet extends HttpServlet {
    private final Option[] options={new Option("Beau",1),new Option("Couvert",2),new Option("Pluie",3), new Option("Neige",4)};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        toJsp(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        toJsp(request,response);
    }

    private void toJsp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("options",options);
        request.getRequestDispatcher("WEB-INF/meteo.jsp").forward(request,response);
    }

    public class Option{
        private String value;
        private int key;

        public Option(String value, int key) {
            this.value = value;
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public int getKey() {
            return key;
        }
    }
}

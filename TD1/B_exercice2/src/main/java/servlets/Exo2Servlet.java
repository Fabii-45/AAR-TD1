package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/")
public class Exo2Servlet extends HttpServlet {
    private final Option[] options = { new Option("Beau", 1), new Option("Couvert", 2), new Option("Pluie", 3),
            new Option("Neige", 4) };
    private Map<String, Integer> optionCounts = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        toJsp(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérez la valeur sélectionnée dans la requête POST
        String selectedOption = request.getParameter("meteo");

        if (selectedOption != null) {
            optionCounts.put(selectedOption, optionCounts.getOrDefault(selectedOption, 0) + 1);
        }

        toJsp(request, response);
    }

    private void toJsp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("options", options);
        request.setAttribute("optionCounts", optionCounts);
        request.getRequestDispatcher("WEB-INF/meteo.jsp").forward(request, response);
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

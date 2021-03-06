package by.andervyd;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("Hello, " + name + " " + surname);
        printWriter.println("</html>");

        // redirect
//        response.sendRedirect("https://google.com");
//        response.sendRedirect("/info");

        // forward (only server links)
        RequestDispatcher dispatcher = request.getRequestDispatcher("/info");
        dispatcher.forward(request, response);
    }
}

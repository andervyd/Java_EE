package by.andervyd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCount")
public class ServletCount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");
        if(count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h2>Count: " + count + "</h2>");
        printWriter.println("</html>");
    }
}

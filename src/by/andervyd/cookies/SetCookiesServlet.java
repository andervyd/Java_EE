package by.andervyd.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookieId = new Cookie("id", "0000");
        Cookie cookieName = new Cookie("name", "root");

        cookieId.setMaxAge(24 * 60 * 60); // second: one day
        cookieName.setMaxAge(24 * 60 * 60);

        response.addCookie(cookieId);
        response.addCookie(cookieName);
    }
}

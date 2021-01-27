<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: andervyd
  Date: 1/27/21
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%--        <%  %> not to view, only to code java--%>
<%--        <%=  %> mast return string--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome</title>
    </head>

    <body>
        <h1>Welcome to the JSP page</h1>
        <p>
            <%= "Return string line ..." %>
            <br/>
            <br/>
            <% java.util.Date date = new Date();
               String currentDate = "Current date: " + date;
            %>
            <%= currentDate %>
        </p>
    </body>
</html>

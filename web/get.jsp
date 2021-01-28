<%--
  Created by IntelliJ IDEA.
  User: andervyd
  Date: 1/28/21
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Get parameters</title>
    </head>
    <body>
        <h2>GET request:</h2>
        <br/>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
        %>
        <%= "Hello, " + name + " " + surname %>
    </body>
</html>

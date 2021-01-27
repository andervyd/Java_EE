<%--
  Created by IntelliJ IDEA.
  User: andervyd
  Date: 1/27/21
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Import Class</title>
    </head>

    <body>
        <h3>Current time:</h3>
        <br/>
        <%@page import="java.util.Date" %>
        <%= new Date() %>
    </body>
</html>

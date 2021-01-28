<%@ page import="by.andervyd.market.Cart" %><%--
  Created by IntelliJ IDEA.
  User: andervyd
  Date: 1/28/21
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Cart</title>
    </head>
    <body>
        <%@ page import="by.andervyd.market.Cart " %>

        <h2>Your cart: </h2>
        <br/>
        <% Cart cart = (Cart) session.getAttribute("cart"); %>
        Name: <%= cart.getName() %>
        <br/>
        Quantity: <%= cart.getQuantity() %>
    </body>
</html>
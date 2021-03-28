<%-- 
    Document   : addTwo
    Created on : Mar 6, 2021, 1:48:33 PM
    Author     : Nate Hepker
--%>

<%@page import="com.hepker.SumModel"%>
<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String firstNum = (String)request.getAttribute("firstNum");
    String secondNum = (String)request.getAttribute("secondNum");
    String message = (String)request.getAttribute("message");
    String error1 = (String)request.getAttribute("error1");
    String error2 = (String)request.getAttribute("error2");
%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Add Two</title>
    </head>
    <body>
        <h1>Add Two</h1>
        <h1>Addition Assignment</h1>
        <form method="POST" action="Sum">
            <label for="firstNum">First Number:</label>
            <input type="text" name="firstNum" id="firstNum" value="<%= firstNum %>"><br><br>
            <label for="secondNum">Second Number:</label>
            <input type="text" name="secondNum" id="secondNum" value="<%= secondNum %>"><br><br>
            <input type="submit" value="Submit" /><br><br>
            <label for="message">Result: <%= message %></label>
        </form>
    </body>
</html>
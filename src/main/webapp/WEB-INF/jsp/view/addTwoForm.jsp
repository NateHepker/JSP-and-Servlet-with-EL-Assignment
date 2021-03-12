<%-- 
    Document   : index
    Created on : Feb 25, 2021, 8:47:42 PM
    Author     : Nate Hepker
--%>

<%@page import="com.hepker.SumModel"%>
<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    
    String firstNum = request.getParameter("firstNum");
    String secondNum = request.getParameter("secondNum");
    SumModel sumModel = new SumModel(firstNum, secondNum);
    String message = sumModel.getMessage();
    
%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Add Two</title>
    </head>
    <body>
        <h1>Add Two</h1>
        <h1>Addition Assignment</h1>
        <form action="addTwo" method="POST">
            <input type="hidden" name="action" value="addTwoForm" />
            <label for="firstNum">First Number:</label>
            <input type="text" name="firstNum" id="firstNum" value="<%= firstNum %>"><br><br>
            <label for="secondNum">Second Number:</label>
            <input type="text" name="secondNum" id="secondNum" value="<%= secondNum %>"><br><br>
            <input type="submit" value="Submit" /><br><br>
            <label for="sum">Result: <%= message %></label>
        </form>
    </body>
</html>
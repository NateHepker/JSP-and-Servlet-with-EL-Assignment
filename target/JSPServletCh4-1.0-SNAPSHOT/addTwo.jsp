<%-- 
    Document   : addTwo
    Created on : Mar 6, 2021, 1:48:33 PM
    Author     : Nate Hepker
--%>

<%@page import="com.hepker.SumModel"%>
<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    SumModel sumModel = new SumModel();
    String firstNum = sumModel.getFirstNum();
    String secondNum = sumModel.getSecondNum();
    String message = sumModel.getMessage();
    String error1 = sumModel.getError1();
    String error2 = sumModel.getError2();
%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Add Two</title>
    </head>
    <body>
        <h1>Add Two</h1>
        <h1>Addition Assignment</h1>
        <form action="Sum" method="POST">
            <label for="firstNum">First Number:</label>
            <input type="text" name="firstNum" id="firstNum" value="<%= firstNum %>"><br><br>
            <label for="secondNum">Second Number:</label>
            <input type="text" name="secondNum" id="secondNum" value="<%= secondNum %>"><br><br>
            <input type="submit" value="Submit" /><br><br>
            <label for="message">Result: <%= message %></label>
        </form>
    </body>
</html>
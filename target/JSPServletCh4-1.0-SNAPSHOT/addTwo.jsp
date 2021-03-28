<%-- 
    Document   : addTwo
    Created on : Mar 6, 2021, 1:48:33 PM
    Author     : Nate Hepker
--%>

<%@page import="com.hepker.SumModel"%>
<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="./styles/main.css" rel="stylesheet">
        <title>Add Two</title>
    </head>
    <body>
        <div class="add-two-group">
            <div class="header">
                <h1>Add Two</h1>
            </div>
            <div class="header">
                <h2>Addition Assignment</h2>
            </div>
            <div class="form-container">
                <form method="POST" action="Sum">
                    <div class="table">

                        <div class="row">
                            <label for="firstNum">First Number:</label>
                            <input type="text" name="firstNum" id="firstNum" value="${firstNum}">
                        </div>
                        
                        <div class="row">
                            <label for="secondNum">Second Number:</label>
                            <input type="text" name="secondNum" id="secondNum" value="${secondNum}">
                        </div>
                        
                        <div class="row">
                            <div ><input id="button" type="submit" value="Submit" /></div>
                        </div>
                        
                        <div class="row" id="result">
                            <label id="resultL" for="message">Result:</label> 
                            <label id="resultR" for="message">${message}</label>
                        </div>
                        
                        <div classs="row">
                            <div><p> </p></div>
                            
                        </div>
                        
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
<%-- 
    Document   : index
    Created on : Feb 25, 2021, 8:47:42 PM
    Author     : nate_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Add Two</title>
    </head>
    <body>
        <h1>Add Two</h1>
        <h1>Addition Assignment</h1>
        <form method="POST" action="Sum" enctype="multipart/form-data">
            <input type="hidden" name="action" value="addTwoForm" />
            <label for="firstNum">First Number:</label>
            <input type="text" name="firstNumber" id="firstNumber"><br><br>
            <label for="secondNum">Second Number:</label>
            <input type="text" name="secondNumber" id="secondNumber"><br><br>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
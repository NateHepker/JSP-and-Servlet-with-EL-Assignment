<%-- 
    Document   : AddTwo
    Created on : Feb 25, 2021, 8:06:39 PM
    Author     : Nate Hepker


<% //scriplets
    String firstNum = (String)request.getAttribute("firstNumber");
    String secondNum = (String)request.getAttribute("secondNumber");
    String sum = (String)request.getAttribute("sum");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Two</title>
    </head>
    <body>
        <h1>Add Two</h1>
        <h1>Basic Add Two Servlet Assignment</h1><br>
        <p style="font-style: italic"> <%=firstNum%>" + "<%=secondNum%>" = "<%=sum%> </p><br><br>
        <label type="text" name="sum" id="sum">result: <%=sum%> </label><br><br>
        <a href="<c:url value="/Sum" />">Return to Add Two Form</a>
    </body>
</html>--%>
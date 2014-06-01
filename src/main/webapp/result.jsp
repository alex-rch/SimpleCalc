<%-- 
    Document   : result
    Created on : 01.06.2014, 19:27:13
    Author     : Алексей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h3>Result:</h3>
        <jsp:useBean id="mybean" scope="session" class="com.mycompany.calc.SimpleCalc" />
        <jsp:setProperty name="mybean" property="operand1" />
        <jsp:setProperty name="mybean" property="operation" />
        <jsp:setProperty name="mybean" property="operand2" />
        <jsp:getProperty name="mybean" property="ans" />
    </body>
</html>

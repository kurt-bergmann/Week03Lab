<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2022, 4:10:27 PM
    Author     : Kurt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="Age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Submit">
        </form>
        <div>${message}</div>
        <a href="arithmetic">Arithmtic Calculator</a>
    </body>
</html>

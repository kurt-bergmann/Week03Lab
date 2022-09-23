<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2022, 4:49:50 PM
    Author     : Kurt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
                <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
        </form>
        <a href="Age">Age Calculator</a>
        <div>Result: ${result}</div>
        
        
    </body>
</html>

<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2021, 2:16:20 PM
    Author     : david
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
        <div>
            <form method="POST" action="arithmetic">
                <label>First:</label>
                <input type="text" name="first_input" value="${firstInput}">
                <br>
                <label>Second:</label>
                <input type="text" name="second_input" value="${secondInput}">
                <br>
                <input type="submit" name="action" value="+">
                <input type="submit" name="action" value="-">
                <input type="submit" name="action" value="*">
                <input type="submit" name="action" value="/">                
                
            </form>
        </div>
        <div>
            <p>Result: ${message}</p>
        </div>
        <nav>
            <a href="../Lab03-Calculators/age">Age Calculator</a>
        </nav>
    </body>
</html>

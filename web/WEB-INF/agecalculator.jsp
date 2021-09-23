<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2021, 11:45:04 AM
    Author     : david
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
        <div>
            <form method="POST" action="age">
                <label>Enter your age:</label>
                <input type="text" name="input_age" value="${inputAge}">
                <br>
                <input type="submit" value="Age next birthday">
            </form>
        </div>
        <p>${message}</p>
        <nav>
            <a href="../Lab03-Calculators/arithmetic">Arithmetic Calculator</a>
        </nav>
    </body>
</html>

<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Página JSP Olá Mundo</title>
</head>
<body>

    <h1>Formulário</h1>
        <form action="/myproject/pedrojonassm" method="post">
            Número:<input type="number" name="numero"/><br><br>
            Nome:<input type="text" name="txtnome"/><br>
            
            <input type="submit" value="Enviar"/>
        </form>
</body>
</html>
<%
   if(session.getAttribute("userLoggedSession") != null){
        response.sendRedirect("home.jsp");
   }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/Screenshot_20230411-201845_Canva.jpg"/>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="style.css" type="text/css">
        <title>Site para Adoção</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class='container'>
        <div class='card'>
        <form action="Login" method="post" id="form-login">
            <img src= "img/Screenshot_20230411-201845_Canva.jpg" width="320" alt="Logotipo CentralPet"/>
            <br>
            
            <input type="email" name="user" id="user" class="fields" placeholder="Digite seu email" required>
            <br><br>
            
            <input type="password" name="pass" id="pass" class="fields" placeholder="Digite sua senha" required>
            <br><br>
        
            <input type="submit" value="Entrar">
        </form>
            </div>
       </div>
    </body>
</html>
<%@page import="model.User" %>
<%
    User uSession = (User)session.getAttribute("userLoggedSession");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>body { padding-top: 70px; }</style>

<!--******************* Navbar *******************-->

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header">
    <h1 class="navbar-brand"><a href="#top">CENTRAL.PET</a></h1>
  </div>
    </ul>
  </div>
  <!-- /.navbar-collapse -->
</nav>
<div id="top"></div>


<div id="headerwrap">
      <header class="clearfix">
        <h1><span>CENTRAL.PET 🐾</span> Bem vindo ao Central.PET o melhor site para adoção e doação de animais de Porto Alegre.</h1>
          <div class="row">
            <div class="col-md-12">
              <h2>Cadastre-se em nosso site para doar ou adotar um parceiro!</h2>
              
              
<div class='container'>
  <div class='card'>
      <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="session/verify.jsp" %>
        <p>
            Bem vindo <%= (uSession != null)
                            ? uSession.getUserName()
                            : "visitante" %>
            <button onclick="window.location.href='session/logout.jsp'">Logout</button>
        </p>
        <hr>
        <button id="BT" onclick="window.location.href='cadastroAN.jsp'">CADASTRAR ANIMAL</button>
        <button id="BT" onclick="window.location.href='listaSÇ.jsp'">VER SERVIÇOS LISTADOS</button>
    </body>
</html>
            </div>   
    </div>
  </div>          
    
            </div>
            <!-- /.col-md-12 -->
          </div>
          <!-- /.row -->
        
          <div class="row">
            <div class="col-md-12">
              <ul class="icon">
              </ul>
            </div>
            <!-- /.col-md-12 -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.container -->
      </header>
      <!-- /.header -->
    </div>
    <!-- /.headerwrap -->


 <!--******************* Feature *******************-->
  
    <div class="scrollblock">
      <section id="feature">
       <div class="container">
        <div class="row">
          <div class="col-md-12">
            <article>
                <p>Nosso objetivo é facilitar a doção de animais e garantir adoções responsáveis, para que tanto os animais quanto os usuários do site possam encontrar os seus companheiros.</p>
              </article>
          </div>
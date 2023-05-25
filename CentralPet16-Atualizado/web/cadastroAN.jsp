<%-- 
    Document   : cadastro
    Created on : 10 de mai. de 2023, 19:24:55
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastrar Animal</h1>
        <hr>
        <form action="CadastroAnimal" method="post">
            <h3>Novo Animal</h3>
            
            <%--LOJA--%>
            <div class="label-float">
            <input type="text" name="cnpj" value="" placeholder="Digite o CNPJ da sua Empresa" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="number" name="celular"  value="" placeholder="(xx) xxxxx-xxxx" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="nomefantasia" value="" placeholder="Digite o nome da sua Empresa" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="cidade" placeholder="cidade" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="bairro" placeholder="bairro" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="rua" placeholder="rua" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="number" name="n" placeholder="n°" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="number" name="cep" placeholder="cep" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="email" placeholder="Digite o seu email" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <%--Animal--%>
            <input type="text" name="raça" placeholder="Digite a raça do animal" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <select name="sexo" required>
                <option value="">Selecione o Sexo do Animal</option>
                <option value="1">M</option>
                <option value="2">F</option>
            </select>
                </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="porte" placeholder="Digite o porte de seu animal" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="pelagem" placeholder="Digite a pelagemn do animal" required>
            </div>
          <br><br>
        
          <div class="label-float">
            <input type="text" name="peso" placeholder="Digite o peso do animal" required>
            </div>
          <br><br>
          
          <div class="label-float">
            <input type="text" name="temperamento" placeholder="Diga como é o temperamento do animal" required>
            </div>
         <br><br>
         
         <div class="label-float">
            <input type="text" name="saude" placeholder="Diga como etá a saúde do animal" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="text" name="pme" placeholder="Diga os lugares mais adequados para o animal" required>
            </div>
            <br><br>
            
            <div class="label-float">
            <input type="submit" value="cadastrar" ><hr><br>
            </div>
               
        </form>
        <a href="home.jsp" >Pagina inicial</a>
        
    </body>
</html>
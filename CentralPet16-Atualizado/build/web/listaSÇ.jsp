<%-- 
    Document   : lista
    Created on : 10 de mai. de 2023, 19:25:10
    Author     : QI
--%>

<%@page import="model.AnimalDAO" %>
<%@page import="model.Animal" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Site para Adoção</title>
    </head>
    <body>
        <h1>LISTA DE SERVIÇOS</h1>
        <hr>
        
        <<h3>Animais em Lojas</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>CNPJ</th>
                    <th>CELULAR</th>
                    <th>NOMEFANTASIA</th>
                    <th>CIDADE</th>
                    <th>BAIRRO</th>
                    <th>RUA</th>
                    <th>N°</th>
                    <th>CEP</th>
                    <th>EMAIL</th>
                    <th>RAÇA</th>
                    <th>SEXO</th>
                    <th>PORTE</th>
                    <th>PELAGEM</th>
                    <th>PESO</th>
                    <th>TEMPERAMENTO</th>
                    <th>SAUDE</th>
                    <th>PODE MORAR EM:</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    AnimalDAO andao = new AnimalDAO();
                    for(Animal an : andao.listAll()) {
                %>
                <tr>
                    <td><%= an.getId() %></td>
                    <td><%= an.getCnpj() %></td>
                    <td><%= an.getCelular ()%></td>
                    <td><%= an.getNomefantasia() %></td>
                    <td><%= an.getCidade ()%></td>
                    <td><%= an.getBairro ()%></td>
                    <td><%= an.getRua ()%></td>
                    <td><%= an.getN ()%></td>
                    <td><%= an.getCep ()%></td>
                    <td><%= an.getEmail ()%></td>
                    <td><%= an.getRaça ()%></td>
                    <td><%= an.getSexo ()%></td>
                    <td><%= an.getPorte ()%></td>
                    <td><%= an.getPelagem ()%></td>
                    <td><%= an.getPeso ()%></td>
                    <td><%= an.getTemperamento ()%></td>
                    <td><%= an.getSaude ()%></td>
                    <td><%= an.getPme ()%></td>
                    <td>
                        <a href="AnimalUpdate?id=">EDITAR</a>
                    </td>
                    <td>
                        <a onclick="confirmDelete()">EXCLUIR</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>

        
        <hr>
        <a href="home.jsp" >Pagina inicial</a>
        
        <script>
            function confirmDelete() {
                if(confirm("Deseja realmente excluir?")) {
                    window.location.replace("AnimalDelete?cod=");
                } else {
                    alert("Exclusão cancelada!");
                }
            }
        </script>
        
    </body>
</html>

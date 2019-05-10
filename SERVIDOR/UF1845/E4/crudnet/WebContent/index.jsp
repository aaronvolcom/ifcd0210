<%-- 
    Document   : index
    Created on : 23-abr-2019, 19:56:39
    Author     : aula1tarde6
--%>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.*" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <link href= "css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <%
        Connection con;
        String url="jdbc:mysql://localhost:3306/dbe4";
        String driver="com.mysql.jdbc.Driver";
        String user="root";
        String clave="";
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, clave);
        
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("select * from usuario");
        rs=ps.executeQuery();
        %>
        
        <div class="container">
            <h1>lista de registro</h1>
            <hr>
            
            <table class="table table-bordered">
                <tr>
               
                    <th class="text-center">ID</th>
                    <th class="text-center">Usuario</th>
                     <th class="text-center">Contraseña</th>
                      <th class="text-center">Nombre</th>
                       <th class="text-center">Apellidos</th>
                        <th class="text-center">Edad</th>
                         <th class="text-center">Ocupacíon</th>
                         <th class="text-center">Acciones</th>
                         
                </tr>
                 
                <%
                    while(rs.next()) {
                %>
                 
                <tr>
                    <td class="text-center"><%= rs.getInt("idUsuario")%></td>
                    <td class="text-center"><%= rs.getString("Nick")%></td>
                    <td class="text-center"><%= rs.getString("Contraseña")%></td>
                    <td class="text-center"><%= rs.getString("Nombre")%></td>
                    <td class="text-center"><%= rs.getString("Apellidos") %></td>
                    <td class="text-center"><%= rs.getInt("Edad")%></td>
                    <td class="text-center"><%= rs.getString("Ocupacion")%></td>
                    <td class="text-center">
                        <a href="Editar.jsp?id=<%= rs.getInt("idUsuario")%>" class="btn btn-warning btn-sm">Editar</a>
                        <a href="Eliminar.jsp?id=<%= rs.getInt("idUsuario")%>" class="btn btn-danger btn-sm">Eliminar</a>
                    </td>
                      
                </tr>
               <% } %>
             
            </table>
            <a href="Agregar.jsp">Añadir usuario</a>
            </div>
           
            </body>
</html>
        
    


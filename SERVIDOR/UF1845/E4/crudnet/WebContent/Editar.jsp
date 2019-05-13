
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<title>Editar Usuario</title>
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
        int iduser=Integer.parseInt(request.getParameter("id"));
        ps = con.prepareStatement("select * from usuario where idUsuario="+iduser);
        rs=ps.executeQuery();
        while(rs.next()){
        	
        %>
        <div class="container">

        <h1>Modificar usuario</h1>
        <form action="" method="post" class="form-control">
        <table class="table table-bordered">
                <tr>
                    
                    <th class="text-center">Nick</th>
                    <th class="text-center">Contraseña</th>
                    <th class="text-center, nom">Nombre</th>
                    <th class="text-center, ape">Apellidos</th>
                    <th class="text-center">Edad</th>
                    <th class="text-center">Ocupacion</th>
                </tr>
                <tr>

                    <td ><input type="text" class="form-control" name="Nick" id="Nick" readonly="" value="<%= rs.getString("Nick")%>"></td>
                    <td ><input type="password" class="form-control" name="contraseña" id="contraseña" value="<%= rs.getString("Contraseña")%>"></td>
                    <td ><input type="text" class="form-control" name="nombre" id="nombre" value="<%= rs.getString("Nombre")%>"></td>
                    <td ><input type="text" class="form-control" name="apellidos" id="apellidos" value="<%= rs.getString("Apellidos")%>"></td>
                    <td ><input type="number" class="form-control" name="edad" id="edad" value="<%= rs.getInt("Edad")%>"></td>
                    <td ><select name="ocupacion"  class="form-control" form="nuevoUser" id="ocupacion">
                            <option value="Estudiante">Estudiante</option>
                            <option value="Desempleado">Desempleado</option>
                            <option value="TrabajadorCP">Trabajador por cuenta
                                propia</option>
                            <option value="TrabajadorCA">Trabajador por cuenta ajena</option>
                    </select></td>
                    <td class="text-center"><input type="submit" value="Editar" class="btn btn-primary btn-lg" id="enviar"></td>
                </tr>
               
            </table>
        </form>
        
    </div>
<%}%>
</body>
</html>
<%

Integer Edad;
    String Nick, Contraseña, Nombre, Apellidos, Ocupacion;
    
    Nick = request.getParameter("Nick");
    Contraseña = request.getParameter("contraseña");
    Nombre = request.getParameter("nombre");
    Apellidos = request.getParameter("apellidos");
    
    try {
        Edad = Integer.parseInt(request.getParameter("edad"));
        }
    catch(Exception e) {
        Edad = 0;
    }
    
    
    Ocupacion = request.getParameter("ocupacion");


if (Nick != null && Contraseña != null && Nombre != null && Apellidos != null && Edad != null  && Ocupacion != null){
        ps = con.prepareStatement("update usuario set Contraseña='"+Contraseña+"',Nombre='"+Nombre+"',Apellidos='"+Apellidos+"',Edad='"+Edad+"',Ocupacion='" +Ocupacion+"'where idUsuario="+iduser);
    ps.executeUpdate();
    response.sendRedirect("index.jsp");
    }

%>
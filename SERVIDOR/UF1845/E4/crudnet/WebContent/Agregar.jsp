<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href= "css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<title>Registro de nuevo usuario</title>
</head>
<body>

    <div class="container">

        <h2>Ingresar nuevo usuario</h2>
        <form id="nuevoUser" action="" method="POST">
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
                    <td class="text-center"><input type="text" name="Nick" id="Nick"></td>
                    <td class="text-center"><input type="password" name="contraseña" id="contraseña"></td>
                    <td class="text-center"><input type="text" name="nombre" id="nombre"></td>
                    <td class="text-center"><input type="text" name="apellidos" id="apellidos"></td>
                    <td class="text-center"><input type="number" name="edad" id="edad"></td>
                    <td class="text-center"><select name="ocupacion" form="nuevoUser" id="ocupacion">
                            <option value="Estudiante">Estudiante</option>
                            <option value="Desempleado">Desempleado</option>
                            <option value="TrabajadorCP">Trabajador por cuenta
                                propia</option>
                            <option value="TrabajadorCA">Trabajador por cuenta ajena</option>
                    </select></td>
                    <td class="text-center"><input type="submit" value="Registrar usuario" class="btn btn-primary btn-lg" id="enviar"></td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>

<%
    //Conectar con la base de datos

    Connection con;
    String url = "jdbc:mysql://localhost:3306/dbe4"; //Dirección de la base de datos (lo ultimo es el nombre de la BD)
    String driver = "com.mysql.jdbc.Driver";
    String usuario = "root"; //Usuario de la base de datos
    String contraseña = ""; //Contraseña de la base de datos
    Class.forName(driver);
    con = DriverManager.getConnection(url, usuario, contraseña);

    //Listar los datos de la base de datos

    PreparedStatement ps;
    
    ResultSet rs;
    ps = con.prepareStatement("select * from usuario");
    rs = ps.executeQuery();
    
    Integer id, edad;
    String user, pass, nombre, apellidos, ocupacion;
    
    id= 0;
    
    while (rs.next()) {
        
    id= rs.getInt("idUsuario") + 1;
    
    }
    
    user = request.getParameter("Nick");
    pass = request.getParameter("contraseña");
    nombre = request.getParameter("nombre");
    apellidos = request.getParameter("apellidos");
    
    try {
        edad = Integer.parseInt(request.getParameter("edad"));
        }
    catch(Exception e) {
        edad = 0;
    }
    
    
    ocupacion = request.getParameter("ocupacion");


if (user != null && pass != null && nombre != null && apellidos != null && edad != null  && ocupacion != null){
        ps = con.prepareStatement(
                "insert into usuario(idUsuario, Nick, Contraseña, Nombre, Apellidos, Edad, Ocupacion)values('"
                        + id + "','" + user + "','" + pass + "','" + nombre + "','" + apellidos + "','" + edad
                        + "','" + ocupacion + "')");
    ps.executeUpdate();
    response.sendRedirect("index.jsp");
    }

%>
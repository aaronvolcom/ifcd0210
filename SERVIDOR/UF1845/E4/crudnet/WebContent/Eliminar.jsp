<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
        int iduser=Integer.parseInt(request.getParameter("id"));
        ps = con.prepareStatement("delete from usuario where idUsuario="+iduser);
        ps.executeUpdate();
        response.sendRedirect("index.jsp");
       
        %>
</body>
</html>
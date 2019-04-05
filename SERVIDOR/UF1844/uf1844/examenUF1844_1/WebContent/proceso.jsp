<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<style type="text/css" media="screen">
     <%@ include file="estilo.css" %>
</style>
</head>
<body>
 <center>
<%
   
   String edad=(String)request.getParameter("edad");
   String prefieres=(String)request.getParameter("preferencia");
   out.print("tu nombre es "+request.getParameter("nombre")+" "+request.getParameter("apellido"));
   out.print("<br/>");
   out.print("tienes "+edad+" años");
   out.print("<br/>");
   out.print("tu lugar favorito es "+request.getParameter("Lugar"));
   out.print("<br/>");
   out.print("y te gusta "+prefieres+" ");
   out.print("<br/>");
   out.print("Bienvenido  "+ request.getParameter("nombre").toString().toUpperCase());
 %>
 
 </center>
</body>
</html>
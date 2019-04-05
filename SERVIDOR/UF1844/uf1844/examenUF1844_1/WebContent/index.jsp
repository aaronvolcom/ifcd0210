<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<style type="text/css" media="screen">
     <%@ include file="estilo.css"%>
</style>
</head>
<body>
<center>
<div id=cuadro>
<form action="servelet1" method="post">
<table class="blueTable">
    <tr>
    <th><label>Nombre:</label>
    <input type="text" name="nombre"></th>
    </tr>
    <tr>  
    <td><label>Apellido:</label>
    <input type="text" name="apellido"></td>
    </tr>
    <tr>
    <td><label>Edad:</label>
    <input type="text" name="edad"></td>
    </tr>
    <tr>
    <td><label>Lugar Preferido:</label>
    <select name="Lugar">
      <option value="playa">playa
      <option value="montaña" selected>montaña
      <option value="ciudad">ciudad
      <option value="pueblo">pueblo
      <option value="desierto">desierto</td>
    </select>
    </tr>
    <tr>
    <th><label>Me gusta:</label></th>
    <tr>
    <td><input type="Radio" name="preferencia" value= "dibujar"checked>Dibujar   
    <input type="Radio" name= "preferencia"value= "leer">Leer   
    <input type="Radio" name= "preferencia"value="fiesta">Fiesta   
    <input type="Radio" name= "preferencia"value="cine">Cine</td>
    </tr>
    
 
    <td colspan="2"><input type="submit" value="Enviar"></td>
    </table>
</form>

</div>
</center>
</body>
</html>
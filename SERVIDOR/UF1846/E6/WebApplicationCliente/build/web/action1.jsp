<%-- 
    Document   : action1
    Created on : 21-may-2019, 20:24:03
    Author     : aula1tarde6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    <%
    try {
        String name = request.getParameter("name");
        
	pqws.ServiceWsd_Service service = new pqws.ServiceWsd_Service();
	pqws.ServiceWsd port = service.getServiceWsdPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = name;
	// TODO process result here
	java.lang.String result = port.mostrarSaludo(nombre);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

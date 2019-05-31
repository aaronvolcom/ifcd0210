<%-- 
    Document   : action2
    Created on : 24-may-2019, 18:03:43
    Author     : aula1tarde6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        
        
    <%-- start web service invocation --%><hr/>
    <%
          int var1 = Integer.parseInt(request.getParameter("valor5"));
        int var2 = Integer.parseInt(request.getParameter("valor6"));
    try {
	com.example.Calculatorwebserver_Service service = new com.example.Calculatorwebserver_Service();
	com.example.Calculatorwebserver port = service.getCalculatorwebserverPort();
	 // TODO initialize WS operation arguments here
	float i = (float)var1;
	float j = (float)var2;
	// TODO process result here
	java.lang.String result = port.multiplication(i, j);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

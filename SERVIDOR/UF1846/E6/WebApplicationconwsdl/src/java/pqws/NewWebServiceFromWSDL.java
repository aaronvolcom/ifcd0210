/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqws;

import javax.jws.WebService;


@WebService(serviceName = "ServiceWsd", portName = "ServiceWsdPort", endpointInterface = "pqws.ServiceWsd", targetNamespace = "http://pqws/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/ServiceWsdl.wsdl")
public class NewWebServiceFromWSDL {

    public java.lang.String hello(java.lang.String name) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String mostrarSaludo(java.lang.String nombre) {
        //TODO implement this method
        return "Nuevo saludo" + nombre;
    }
    
}

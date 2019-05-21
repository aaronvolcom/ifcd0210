/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServiceWsd")
public class ServiceWsd {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarSaludo")
    public String mostrarSaludo(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return "Bienvenido " + nombre;
    }
}

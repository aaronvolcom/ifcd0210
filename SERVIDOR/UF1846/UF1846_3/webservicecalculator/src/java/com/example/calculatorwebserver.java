/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aula1tarde6
 */
@WebService(serviceName = "calculatorwebserver")
public class calculatorwebserver {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public String Addition(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        float res = i + j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Subtraction")
    public String Subtraction(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        float res = i - j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplication")
    public String Multiplication(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
       float res = i * j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public String Division(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        float res = i / j;
        return (Float.toString(res));
    }
}

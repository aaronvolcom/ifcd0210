
package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "calculatorwebserver", targetNamespace = "http://example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculatorwebserver {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Division")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Division", targetNamespace = "http://example.com/", className = "com.example.Division")
    @ResponseWrapper(localName = "DivisionResponse", targetNamespace = "http://example.com/", className = "com.example.DivisionResponse")
    @Action(input = "http://example.com/calculatorwebserver/DivisionRequest", output = "http://example.com/calculatorwebserver/DivisionResponse")
    public String division(
        @WebParam(name = "i", targetNamespace = "")
        float i,
        @WebParam(name = "j", targetNamespace = "")
        float j);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Subtraction")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Subtraction", targetNamespace = "http://example.com/", className = "com.example.Subtraction")
    @ResponseWrapper(localName = "SubtractionResponse", targetNamespace = "http://example.com/", className = "com.example.SubtractionResponse")
    @Action(input = "http://example.com/calculatorwebserver/SubtractionRequest", output = "http://example.com/calculatorwebserver/SubtractionResponse")
    public String subtraction(
        @WebParam(name = "i", targetNamespace = "")
        float i,
        @WebParam(name = "j", targetNamespace = "")
        float j);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Multiplication")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Multiplication", targetNamespace = "http://example.com/", className = "com.example.Multiplication")
    @ResponseWrapper(localName = "MultiplicationResponse", targetNamespace = "http://example.com/", className = "com.example.MultiplicationResponse")
    @Action(input = "http://example.com/calculatorwebserver/MultiplicationRequest", output = "http://example.com/calculatorwebserver/MultiplicationResponse")
    public String multiplication(
        @WebParam(name = "i", targetNamespace = "")
        float i,
        @WebParam(name = "j", targetNamespace = "")
        float j);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Addition")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Addition", targetNamespace = "http://example.com/", className = "com.example.Addition")
    @ResponseWrapper(localName = "AdditionResponse", targetNamespace = "http://example.com/", className = "com.example.AdditionResponse")
    @Action(input = "http://example.com/calculatorwebserver/AdditionRequest", output = "http://example.com/calculatorwebserver/AdditionResponse")
    public String addition(
        @WebParam(name = "i", targetNamespace = "")
        float i,
        @WebParam(name = "j", targetNamespace = "")
        float j);

}

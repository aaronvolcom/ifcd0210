
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Subtraction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Subtraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subtraction", propOrder = {
    "i",
    "j"
})
public class Subtraction {

    protected float i;
    protected float j;

    /**
     * Obtiene el valor de la propiedad i.
     * 
     */
    public float getI() {
        return i;
    }

    /**
     * Define el valor de la propiedad i.
     * 
     */
    public void setI(float value) {
        this.i = value;
    }

    /**
     * Obtiene el valor de la propiedad j.
     * 
     */
    public float getJ() {
        return j;
    }

    /**
     * Define el valor de la propiedad j.
     * 
     */
    public void setJ(float value) {
        this.j = value;
    }

}

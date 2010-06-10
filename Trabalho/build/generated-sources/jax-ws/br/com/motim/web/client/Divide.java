
package br.com.motim.web.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divide complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divide">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oper2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divide", propOrder = {
    "oper1",
    "oper2"
})
public class Divide {

    protected double oper1;
    protected double oper2;

    /**
     * Gets the value of the oper1 property.
     * 
     */
    public double getOper1() {
        return oper1;
    }

    /**
     * Sets the value of the oper1 property.
     * 
     */
    public void setOper1(double value) {
        this.oper1 = value;
    }

    /**
     * Gets the value of the oper2 property.
     * 
     */
    public double getOper2() {
        return oper2;
    }

    /**
     * Sets the value of the oper2 property.
     * 
     */
    public void setOper2(double value) {
        this.oper2 = value;
    }

}

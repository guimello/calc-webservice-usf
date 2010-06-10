/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.motim.web.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guimello
 */
@WebService()
public class Calculator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sum")
    public double sum(@WebParam(name = "oper1")
    final double oper1, @WebParam(name = "oper2")
    final double oper2) {
        //TODO write your implementation code here:
        return oper1 + oper2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public double subtract(@WebParam(name = "oper1")
    final double oper1, @WebParam(name = "oper2")
    final double oper2) {
        //TODO write your implementation code here:
        return oper1 - oper2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public double multiply(@WebParam(name = "oper1")
    final double oper1, @WebParam(name = "oper2")
    final double oper2) {
        //TODO write your implementation code here:
        return oper1 * oper2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public double divide(@WebParam(name = "oper1")
    final double oper1, @WebParam(name = "oper2")
    final double oper2) {
        //TODO write your implementation code here:
        return oper1 / oper2;
    }

}

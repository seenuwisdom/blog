
package com.brunozambiazi.ws.publisher;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWebService", targetNamespace = "http://publisher.ws.brunozambiazi.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWebService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "print", targetNamespace = "http://publisher.ws.brunozambiazi.com/", className = "com.brunozambiazi.ws.publisher.Print")
    @ResponseWrapper(localName = "printResponse", targetNamespace = "http://publisher.ws.brunozambiazi.com/", className = "com.brunozambiazi.ws.publisher.PrintResponse")
    @Action(input = "http://publisher.ws.brunozambiazi.com/HelloWebService/printRequest", output = "http://publisher.ws.brunozambiazi.com/HelloWebService/printResponse")
    public void print(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

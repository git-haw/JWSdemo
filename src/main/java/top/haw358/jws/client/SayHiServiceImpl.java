
package top.haw358.jws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SayHiServiceImpl", targetNamespace = "http://server.jws.haw358.top/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHiServiceImpl {


    /**
     * 
     */
    @WebMethod(operationName = "SayHiDefault")
    @Action(input = "http://server.jws.haw358.top/SayHiServiceImpl/SayHiDefaultRequest", output = "http://server.jws.haw358.top/SayHiServiceImpl/SayHiDefaultResponse")
    public void sayHiDefault();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.jws.haw358.top/SayHiServiceImpl/checkTimeRequest", output = "http://server.jws.haw358.top/SayHiServiceImpl/checkTimeResponse")
    public int checkTime(
        @WebParam(name = "arg0", partName = "arg0")
        XMLGregorianCalendar arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "SayHiServiceHi")
    @Action(input = "http://server.jws.haw358.top/SayHiServiceImpl/SayHiServiceHiRequest", output = "http://server.jws.haw358.top/SayHiServiceImpl/SayHiServiceHiResponse")
    public void sayHiServiceHi(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}

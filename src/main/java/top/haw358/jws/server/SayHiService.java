package top.haw358.jws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

/**
 * Created by haw on 17-8-2.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHiService {

    /**
     * 执行测试的WebService方法
     */
    @WebMethod
    void SayHiDefault();

    /**
     * 执行测试的WebService方法(有参)
     * @param name
     */
    @WebMethod
    void SayHiServiceHi(@WebParam(name = "name") String name);

    /**
     * 执行测试的WebService方法(用于时间校验)
     * @param clientTime 客户端时间
     * @return 0表示时间校验失败 1表示校验成功
     */
    @WebMethod
    @WebResult(name = "valid")
    int checkTime(@WebParam(name = "clientTime")Date clientTime);
}

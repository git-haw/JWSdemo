package top.haw358.jws.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作为测试的WebService实现类
 * @author haw
 * Created by haw on 17-8-2.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SayHiServiceImpl implements SayHiService {

    public void SayHiDefault() {
        System.out.println("Hi, haw!");
    }

    public void SayHiServiceHi(String name) {
        System.out.println("Hi, " + name + "!");
    }

    public int checkTime(Date clientTime) {
        // 精确到秒
        String dateServer = new java.sql.Date(System.currentTimeMillis())
                .toString()
                + " "
                + new java.sql.Time(System.currentTimeMillis());
        String dateClient = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(clientTime);
        return dateServer.equals(dateClient) ? 1 : 0;
    }
}

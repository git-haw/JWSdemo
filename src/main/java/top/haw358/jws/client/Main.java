package top.haw358.jws.client;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by haw on 17-8-2.
 */
public class Main {
    public static void main(String args[]) throws DatatypeConfigurationException {
        SayHiServiceImplService sayHiServiceImplService = new SayHiServiceImplService();
        SayHiServiceImpl service = sayHiServiceImplService.getSayHiServiceImplPort();
        service.sayHiDefault();
        service.sayHiServiceHi("qwe");

        // checktime
        // 这里主要说一下时间日期的xml传递，方法还略显复杂
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(new Date(System.currentTimeMillis()));
        XMLGregorianCalendar xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
        System.out.println(service.checkTime(xmldate));
    }
}

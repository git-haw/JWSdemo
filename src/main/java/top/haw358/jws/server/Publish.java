package top.haw358.jws.server;

import javax.xml.ws.Endpoint;

/**
 * Created by haw on 17-8-2.
 */
public class Publish {
    public static void main(String args[]){
        Endpoint.publish("http://localhost:8080/testjws/service/sayHi", new SayHiServiceImpl());
        System.out.println("发布成功");
    }
}

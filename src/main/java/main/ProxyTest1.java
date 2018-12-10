package main;

import Iimpl.Fool;
import Iimpl.Wise;
import handler.MyInvocationHandler;
import interfaces.Foo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: proxy
 * @description:
 * @author: hetao
 * @create: 2018-12-07 16:36
 **/

public class ProxyTest1 {

    public static void main(String[] args) {

        /**
         * 传入不同的handler 得到不同的代理类 （实现统一接口）
         */


        /**
         * 老板：你是谁？
         *     我是fool，我在工作:(
         * 老板：我知道了！
         */
//        Fool fool = new Fool();
//        InvocationHandler handler = new MyInvocationHandler(fool);

        /**
         *老板：你是谁？
         *     我是wise man ，我在玩游戏:)
         * 老板：我知道了！
         */
        Wise wise = new Wise();
        InvocationHandler handler = new MyInvocationHandler(wise);

        Foo foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),new Class[]{Foo.class},handler);

        foo.work();

    }

}

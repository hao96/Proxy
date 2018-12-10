package handler;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: proxy
 * @description:
 * @author: hetao
 * @create: 2018-12-07 15:37
 **/

public class MyInvocationHandler implements InvocationHandler {

    private Object delegate;

    public MyInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("老板：你是谁？");
        method.invoke(delegate);
        System.out.println("老板：我知道了！");

        return null;
    }

}

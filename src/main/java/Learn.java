/**
 * @program: proxy
 * @description:
 * @author: hetao
 * @create: 2018-12-07 15:33
 **/

public class Learn {

    /**
     *
     * 1，创建一个代理实现了多个接口的对象
     *
     *     InvocationHandler handler = new handler.MyInvocationHandler(...);
     *     Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
     *                                          new Class<?>[] { Foo.class },
     *                                          handler);
     *
     *  1）需要创建一个 handler （一个实现了 InvocationHandler接口的类）
     *  2) 需要一个 ClassLoader
     *  3) 类对象的数组 interfaces
     *
     *  2，动态生成代理类名 的前缀 $Proxy
     *  3，代理类是非抽象和用final修饰的，所以说不可以被继承。
     *  4，代理类继承了 java.lang.reflect.Proxy
     *  5，代理类在创建时实现了指定的接口，顺序与给定接口的顺序相同，同时包含了接口中所有的方法。
     *  6，代理类可以转型到他实现的任意接口上。
     *  7，每次调用代理类的方法时，都会分配调用与之相对应的handler的invoke方法。
     *  8，代理类不会重写Object的hashcode() toString() equals()方法，调用的还是Object中的。
     *  9，实现的每个接口若都为public，则生成的代理类在顶层包，否则，生成在非public的相应的包中。
     *
     */

}

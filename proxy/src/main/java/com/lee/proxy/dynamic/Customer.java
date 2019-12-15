package com.lee.proxy.dynamic;


import com.lee.proxy.staticp.Owner;
import com.lee.proxy.staticp.Sales;

/**
 * 客户端，使用代理类和主题接口完成一些工作。<br>
 * 在这里表示买房子的客户
 *
 */
public class Customer {
    public static void main(String[] args) {
        Sales delegate = new Owner();
        //动态代理
        Sales proxy = (Sales) new SalesInvocationHandler().bind(delegate);
        proxy.sell();
    }
}

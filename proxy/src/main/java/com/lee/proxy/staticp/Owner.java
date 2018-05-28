package com.lee.proxy.staticp;

/**
 * 真实主题，具体处理业务。<br>
 * 在这里表示房东
 *
 */
public class Owner implements Sales {
    @Override
    public void sell() {
        System.out.println("我是房东我正在出售我的房产");
    }
}
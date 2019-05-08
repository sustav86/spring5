package com.sustav.devtool.patterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPattern {

    public static void main(String[] args) {

        ProxyPattern proxyPattern = new ProxyPattern();
        Object o = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                proxyPattern.getClass().getInterfaces(),
                (proxy, method, args1) -> method.invoke(proxy, args1));
    }
}

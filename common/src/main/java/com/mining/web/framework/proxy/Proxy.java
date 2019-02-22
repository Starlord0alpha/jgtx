/**
 * File Name: Proxy.java
 * Author: 
 * Created Time: 2019-02-22
 */

package com.mining.web.framework.proxy;

/**
 * class: Proxy
 * desc: 
 */
public interface Proxy{
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}

/**
 * File Name: Handler.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.bean;

import java.lang.reflect.Method;

/**
 * class: Handler
 * desc: 封装Action信息
 */
public class Handler{
    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}

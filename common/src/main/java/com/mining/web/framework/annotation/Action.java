/**
 * File Name: Action.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * class: Action
 * desc: 方法注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action{
    /**
     * 请求类型与路径
     */
    String value();
}

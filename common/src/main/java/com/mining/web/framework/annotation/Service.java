/**
 * File Name: Service.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * class: Service
 * desc: 服务类注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service{
}

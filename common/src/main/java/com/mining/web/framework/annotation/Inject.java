/**
 * File Name: Inject.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * class: Inject
 * desc: 依赖注入注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject{
}

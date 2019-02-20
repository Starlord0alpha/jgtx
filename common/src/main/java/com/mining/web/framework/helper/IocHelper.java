/**
 * File Name: IocHelper.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.helper;

import java.lang.reflect.Field;
import java.util.Map;
import com.mining.web.framework.annotation.Inject;
import com.mining.web.framework.util.ArrayUtil;
import com.mining.web.framework.util.CollectionUtil;
import com.mining.web.framework.util.ReflectionUtil;

/**
 * class: IocHelper
 * desc: 依赖注入助手类
 */
public class IocHelper {
    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            // 遍历 Bean Map
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                // 从 beanMap 中获取bean类与bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                
                // 获取 bean 类定义的所有成员变量
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    // 遍历bean Field
                    for (Field beanField : beanFields) {
                        // 如果当前字段含有Inject注解
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            // 获取值
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            // 通过反射设置值
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * File Name: HelperLoader.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.helper;

import com.mining.web.framework.util.ClassUtil;

/**
 * class: HelperLoader
 * desc: 加载相应的 Helper 类
 */
public class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
            ClassHelper.class,
            BeanHelper.class,
            AopHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}

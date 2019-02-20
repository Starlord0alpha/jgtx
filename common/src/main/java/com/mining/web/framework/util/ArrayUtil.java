/**
 * File Name: ArrayUtil.java
 * Author: 
 * Created Time: 2019-02-17
 */

package com.mining.web.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * class: ArrayUtil
 * desc: 数组工具类
 */
public class ArrayUtil {
    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

    /**
     * 判断字符串是否为非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }
}

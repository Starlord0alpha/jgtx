/**
 * File Name: Param.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.bean;

import java.util.Map;
import com.mining.web.framework.util.CastUtil;

/**
 * class: Param
 * desc: 请求参数对象
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取 Long 型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}

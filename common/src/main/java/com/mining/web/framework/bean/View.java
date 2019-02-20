/**
 * File Name: View.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * class: View
 * desc: 返回视图对象
 */
public class View{
    private String path;

    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}

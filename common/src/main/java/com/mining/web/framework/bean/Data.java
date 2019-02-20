/**
 * File Name: Data.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.bean;

/**
 * class: Data
 * desc: 返回数据对象
 */
public class Data{
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}

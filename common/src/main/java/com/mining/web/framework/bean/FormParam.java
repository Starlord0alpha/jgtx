/**
 * File Name: FormParam.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.bean;

import java.io.InputStream;

/**
 * class: FormParam
 * desc: 封装上传文件参数
 */
public class FormParam {
    private String fieldName;
    private Object fieldValue;

    public FormParam(String fieldName, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public Object getFieldValue() {
        return this.fieldValue;
    }
}


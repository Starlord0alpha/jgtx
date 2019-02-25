/**
 * File Name: CustomerService.java
 * Author: 
 * Created Time: 2019-02-17
 */

package com.mining.web.framework.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mining.web.framework.bean.FileParam;
import com.mining.web.framework.helper.DatabaseHelper;
import com.mining.web.framework.helper.UploadHelper;
import com.mining.web.framework.model.Customer;
import com.mining.web.framework.util.PropsUtil;

/**
 * class: CustomerService
 * desc: 提供客户数据服务
 */
public class CustomerService {
    private static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT  * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer where id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap, FileParam fileParam) {
        boolean result = DatabaseHelper.insertEntity(Customer.class, fieldMap);
        if (result) {
            UploadHelper.uploadFile("/tmp/upload", fileParam);
        }
        return 
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}

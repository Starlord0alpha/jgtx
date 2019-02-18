/**
 * File Name: CustomerService.java
 * Author: 
 * Created Time: 2019-02-17
 */

package com.mining.web.framework.service;

import java.sql.Connection;
// import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mining.web.framework.helper.DatabaseHelper;
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
        Connection conn = null;
        try {
            String sql = "SELECT  * FROM customer";
            conn = DatabaseHelper.getConnection();
            return DatabaseHelper.queryEntityList(Customer.class, conn, sql);
        } finally {
            DatabaseHelper.closeConnection(conn);
        }
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        // TODO
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        // TODO
        return false;
    }
}

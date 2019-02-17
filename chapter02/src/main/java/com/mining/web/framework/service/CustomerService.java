/**
 * File Name: CustomerService.java
 * Author: 
 * Created Time: 2019-02-17
 */

package com.mining.web.framework.service;

import java.util.List;
import java.util.Map;

import com.mining.web.framework.model.Customer;

/**
 * class: CustomerService
 * desc: 提供客户数据服务
 */
public class CustomerService {
    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(String keyword) {
        // TODO
        return null;
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

/**
 * File Name: CustomerDeleteServlet.java
 * Author: 
 * Created Time: 2019-02-17
 */

package com.mining.web.framework.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * class: CustomerDeleteServlet
 * desc: 删除客户
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {
    /**
     * 处理 删除客户 请求
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }
}

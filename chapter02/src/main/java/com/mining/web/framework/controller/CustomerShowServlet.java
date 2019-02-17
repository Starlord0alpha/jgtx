/**
 * File Name: CustomerShowServlet.java
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
 * class: CustomerShowServlet
 * desc: 显示客户基本信息
 */
@WebServlet("/customer_create")
public class CustomerShowServlet extends HttpServlet {
    /**
     * 进入 显示客户 界面
     */
    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // TODO
    } 
}

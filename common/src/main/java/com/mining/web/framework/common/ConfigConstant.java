/**
 * File Name: ConfigConstant.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.common;

/**
 * class: ConfigConstant
 * desc: 提供相关配置项常量
 */
public interface ConfigConstant{
    String CONFIG_FILE = "config.properties";

    String JDBC_DRIVER = "jdbc.driver";
    String JDBC_URL = "jdbc.url";
    String JDBC_USERNAME = "jdbc.username";
    String JDBC_PASSWORD = "jdbc.password";

    String APP_BASE_PACKAGE = "app.base_package";
    String APP_JSP_PATH = "app.jsp_path";
    String APP_ASSET_PATH = "app.asset_path";

    String APP_UPLOAD_LIMIT = "app.upload_limit";
}

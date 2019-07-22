/**
 * File Name: Security.java
 * Author: 
 * Created Time: 2019-02-26
 */

package com.mining.web.framework.plugin.security;

import java.util.Set;

/**
 * class: Security
 * desc: 
 */
public interface Security {
    /**
     * 根据用户名获取密码
     */
    String getPassword(String username);

    /**
     * 根据用户名获取角色集合
     */
    Set<String> getRoleNameSet(String username);

    /**
     * 根据角色名获取权限集合
     */
    Set<String> getPermissioinNameSet(String roleName);
}

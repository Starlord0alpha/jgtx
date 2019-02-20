/**
 * File Name: ControllerHelper.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.helper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.mining.web.framework.annotation.Action;
import com.mining.web.framework.bean.Handler;
import com.mining.web.framework.bean.Request;
import com.mining.web.framework.util.ArrayUtil;
import com.mining.web.framework.util.CollectionUtil;

/**
 * class: ControllerHelper
 * desc: 控制器助手类
 */
public class ControllerHelper{
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();

        if (CollectionUtil.isNotEmpty(controllerClassSet)) {
            for (Class<?> controllerClass : controllerClassSet) {
                Method[] methods = controllerClass.getDeclaredMethods();
                for (Method method : methods) {
                    if (ArrayUtil.isNotEmpty(methods)) {
                        if (method.isAnnotationPresent(Action.class)) {
                            Action action = method.getAnnotation(Action.class);

                            String mapping = action.value();

                            // 验证URL映射规则
                            if (mapping.matches("\\w+:/\\w*")) {
                                String[] array = mapping.split(":");
                                if (ArrayUtil.isNotEmpty(array) && array.length == 2) {
                                    String requestMethod = array[0];
                                    String requestPath = array[1];
                                    Request request = new Request(requestMethod, requestPath);
                                    Handler handler = new Handler(controllerClass, method);
                                    ACTION_MAP.put(request, handler);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static Handler getHandler(String requestMethod, String requestPath) {
        Request request = new Request(requestMethod, requestPath);
        return ACTION_MAP.get(request);
    }
}

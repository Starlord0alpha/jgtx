/**
 * File Name: StreamUtil.java
 * Author: 
 * Created Time: 2019-02-20
 */

package com.mining.web.framework.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class: StreamUtil
 * desc: 流操作工具类
 */
public class StreamUtil {
    private static Logger logger = LoggerFactory.getLogger(StreamUtil.class);

    public static String getString(InputStream is) {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            logger.error("get string failure", e);
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    /**
     * 将输入流复制到输出流
     */
    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            int length;
            byte[] buffer = new byte[ 4 * 1024 ];
            while ((length = inputStream.read(buffer, 0, buffer.length)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.flush();
        } catch (Exception e) {
            logger.error("copy stream failure", e);
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                logger.error("close stream failure", e);
            }
        }
    }
}

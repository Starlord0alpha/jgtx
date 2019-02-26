/**
 * File Name: FileUtil.java
 * Author: 
 * Created Time: 2019-02-26
 */

package com.mining.web.framework.util;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class: FileUtil
 * desc: 
 */
public class FileUtil {
    private static Logger logger = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 获取真实文件名(自动去掉文件路径)
     */
    public static String getRealFileName(String fileName) {
        return FilenameUtils.getName(fileName);
    }

    /**
     * 创建文件
     */
    public static File createFile(String filePath) {
        File file;

        try {
            file = new File(filePath);
            File parentDir = file.getParentFile();
            if (!parentDir.exists()) {
                FileUtils.forceMkdir(parentDir);
            }
        } catch (Exception e) {
            logger.error("create file failure", e);
            throw new RuntimeException(e);
        }

        return file;
    }
}

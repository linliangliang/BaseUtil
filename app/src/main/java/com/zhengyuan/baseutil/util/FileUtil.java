package com.zhengyuan.baseutil.util;

import java.io.File;

/**
 * Created by 林亮 on 2018/12/25
 */

public class FileUtil {


    /**
     * 递归删除一个文件夹下面的所有文件，使用有危险
     * @param root
     */
    public static void deleteAllFiles(File root) {

        File files[] = root.listFiles();
        if (files != null)
            for (File f : files) {
                if (f.isDirectory()) { // 判断是否为文件夹
                    deleteAllFiles(f);
                    try {
                        f.delete();
                    } catch (Exception e) {
                    }
                } else {
                    if (f.exists()) { // 判断是否存在
                        deleteAllFiles(f);
                        try {
                            f.delete();
                        } catch (Exception e) {
                        }
                    }
                }
            }
    }
}

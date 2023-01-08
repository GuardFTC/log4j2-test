package com.ftc.log4j2test;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-01-06 15:30:07
 * @describe: 自定义日志打印器
 */
public class CustomLogger {

    private static final Log CUSTOM_LOG = LogFactory.get("custom");

    /**
     * 打印info级别日志
     *
     * @param log 日志内容
     */
    public static void info(String log) {
        CUSTOM_LOG.info(log);
    }
}

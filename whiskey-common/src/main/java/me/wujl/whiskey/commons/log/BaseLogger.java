package me.wujl.whiskey.commons.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.commons.log
 * @Description: 日志基类
 * @date 2017-02-20 16:34
 */

public class BaseLogger {
    public Logger logger = LoggerFactory.getLogger(getClass());
}

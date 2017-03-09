package me.wujl.whiskey.olap.kylin.utils;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.utils
 * @Description:
 * @date 2017-03-09 15:41
 */

public class AssertUtil {

    public static boolean notNull(Object obj) {
        if(obj == null) {
            return false ;
        } else {
            return true;
        }
    }

    public static boolean notEmpty(Object obj) {
        if(obj.equals("")) {
            return false ;
        } else {
            return true;
        }
    }
}

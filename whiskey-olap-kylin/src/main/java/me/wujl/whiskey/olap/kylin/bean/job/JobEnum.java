package me.wujl.whiskey.olap.kylin.bean.job;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.bean.job
 * @Description: job中相关的枚举类
 * @date 2017-02-27 11:03
 */

public enum JobEnum {

    // job's type
    JOB_TYPE_DROP("drop") ,
    JOB_TYPE_EDIT("edit") ,
    JOB_TYPE_BUILD("build") ,
    JOB_TYPE_REFRESH("refresh") ,
    JOB_TYPE_MERGE("merge") ,
    JOB_TYPE_ENABLE("enable") ,
    JOB_TYPE_PURGE("purge") ,
    JOB_TYPE_CLONE("clone") ,

    // status
    STATUS_PENDING("pending"),
    STATUS_RUNNING("running"),
    STATUS_FINISHED("finished");

    private String stringValue ;
    private int intValue ;

    JobEnum(int intValue) {
        this.intValue = intValue;
    }

    JobEnum(String stringValue) {
        this.stringValue = stringValue;
    }
}

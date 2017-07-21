package me.wujl.whiskey.olap.kylin.bean.cube;

import java.util.List;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.bean.cube
 * @Description: cube
 * @date 2017-03-18 11:26
 */

public class Cube {


    /**
    * uuid
    */
    private String uuid ;
    /**
    * 最新修改时间
    */
    private long last_modified;
    /**
    * 名称
    */
    private String name ;
    /**
    * 所属者
    */
    private String owner ;
    /**
    * 版本
    */
    private String version ;
    /**
    * cube内容（包含维度和度量&表间关系）
    */
    private String descriptor ;
    /**
    * 消费？？
    */
    private String cost ;
    /**
    * 状态
    */
    private String status ;
    /**
    * 分区
    */
    private List<Segment> segments ;
    /**
    * 创建时间
    */
    private long create_time ;
    /**
    * 资源记录数
    */
    private long source_records_count ;
    /**
    * 资源记录大小
    */
    private long source_records_size ;
    /**
    *
    */
    private long size_kb ;


}

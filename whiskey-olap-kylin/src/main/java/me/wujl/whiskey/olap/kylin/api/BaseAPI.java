package me.wujl.whiskey.olap.kylin.api;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;

/**
 * @author wujl
 * @version V1.0
 * @Title: chivas-whiskey
 * @Package me.wujl.whiskey.olap.kylin.api
 * @Description:
 * @date 2017-02-24 10:46
 */


public abstract class BaseAPI {

    protected static final String BASE_URL = "" ;
//    protected static final String BASE_URL = "http://10.0.8.4:7070/kylin/api" ;
    protected static Header jsonHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
    protected static Header xmlHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_XML.toString());

}

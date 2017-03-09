package me.wujl.whiskey.olap.kylin.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import me.wujl.whiskey.olap.kylin.bean.job.Job;
import me.wujl.whiskey.olap.kylin.client.LocalHttpClient;
import me.wujl.whiskey.olap.kylin.utils.AssertUtil;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wujl
 * @version V1.0
 * @Title: chivas-whiskey
 * @Package me.wujl.whiskey.olap.kylin.api
 * @Description: JobAPI
 * @date 2017-02-24 15:16
 */
public class JobAPI extends BaseAPI{

    public static final Logger logger = LoggerFactory.getLogger(JobAPI.class);

    /**
     * @Description: 条件过滤job信息
     * @param: filter
     * @return: java.lang.String
     * @Date: 2017-03-09 16:34
     */
    public static String getJobs (String filter){
        // 解析过滤条件
        JSONObject condition = JSON.parseObject(filter);
        String cubeName = condition.getString("cubeName");
        String limit = condition.getString("limit");
        String offset = condition.getString("offset");
        String projectName = condition.getString("projectName");
        String timeFilter = condition.getString("timeFilter");
        String statuses = condition.getString("statuses");

        // 拼接URL
        String and = "&";
        StringBuffer URL = new StringBuffer(BASE_URL+"/jobs?")
                .append("limit="+limit+and)
                .append("offset="+offset+and)
                .append("timeFilter="+timeFilter);

        if(AssertUtil.notEmpty(projectName)){
            URL.append("&projectName="+projectName);
        }
        if(AssertUtil.notEmpty(cubeName)){
            URL.append("&cubeName="+cubeName);
        }
        if(AssertUtil.notEmpty(statuses)){
            String [] status = statuses.split(",");
            for(String s : status){
                URL.append("&status="+s);
            }
        }
        logger.info("getJobs请求路径："+URL);
        // 请求接口
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(URL.toString())
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest);
    }

    /**
     * @Description: 恢复job状态到READY
     * @param: jobId
     * @return: me.wujl.whiskey.olap.kylin.bean.job.Job
     * @Date: 2017-03-09 15:10
     */
    public static Job ResumeJob (String jobId){
        HttpUriRequest httpUriRequest = RequestBuilder.put()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(BASE_URL+"/jobs/"+jobId+"/resume")
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest,Job.class);
    }
    /**
     * @Description: 获取Job状态
     * @param: jobId
     * @return: me.wujl.whiskey.olap.kylin.bean.job.Job
     * @Date: 2017-03-09 15:21
     */
    public static Job getJobStatus (String jobId){
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(BASE_URL+"/jobs/"+jobId)
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest,Job.class);
    }

    /**
     * @Description: 取消job
     * @param: jobId
     * @return: me.wujl.whiskey.olap.kylin.bean.job.Job
     * @Date: 2017-03-09 15:22
     */
    public static Job DiscardJob (String jobId){
        HttpUriRequest httpUriRequest = RequestBuilder.put()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(BASE_URL+"/jobs/"+jobId+"/cancel")
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest,Job.class);
    }

    /**
     * @Description: 获取job某step的output
     * @param: jobId
     * @param: stepId
     * @return: java.lang.String
     * @Date: 2017-03-09 15:22
     */
    public static String getJobStepOutput (String jobId,String stepId){
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(BASE_URL+"/jobs/"+jobId+"/steps/"+stepId+"/output")
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest);
    }
    /**
     * @Description: 暂停job
     * @param: jobId
     * @return: java.lang.String
     * @Date: 2017-03-09 15:23
     */
    public static String PauseJob (String jobId){
        HttpUriRequest httpUriRequest = RequestBuilder.put()
                .setHeader(jsonHeader)
                .setHeader("Authorization", "Basic QURNSU46S1lMSU4=")
                .setUri(BASE_URL+"/jobs/"+jobId+"/pause")
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest);
    }
}

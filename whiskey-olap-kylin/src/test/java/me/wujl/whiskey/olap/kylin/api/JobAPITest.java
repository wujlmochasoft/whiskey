package me.wujl.whiskey.olap.kylin.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.api
 * @Description:
 * @date 2017-03-09 13:46
 */

public class JobAPITest {

    public static final Logger logger = LoggerFactory.getLogger(JobAPITest.class);

    @Test
    public void discardJob() throws Exception {
        String jobId = "d1e33a19-78c7-4c6d-9fd1-5fccc307e980" ;
        logger.info("discardJob接口返回值："+JobAPI.DiscardJob(jobId).toString());
    }

    @Test
    public void getJobStepOutput() throws Exception {
        String jobId = "1363a7b7-3b46-4e85-9940-ed5094f1cbbb" ;
        String stepId = "1363a7b7-3b46-4e85-9940-ed5094f1cbbb-01";
        logger.info("getJobStepOutput接口返回值："+JobAPI.getJobStepOutput(jobId,stepId));

    }

    @Test
    public void resumeJob() throws Exception {
        String jobId = "d91f1dd7-f752-4e85-b51f-893255f8f153" ;
        logger.info("resumeJob接口返回值："+JobAPI.ResumeJob(jobId).toString());
    }

    @Test
    public void getJobStatus() throws Exception {
        String jobId = "67346b51-b70f-4c9b-9463-5b30b5e8151a" ;
        logger.info("getJobStatus接口返回值："+JobAPI.getJobStatus(jobId).toString());
    }

    @Test
    public void pauseJob() throws Exception {
        String jobId = "d91f1dd7-f752-4e85-b51f-893255f8f153" ;
        logger.info("pauseJob接口返回值："+JobAPI.PauseJob(jobId).toString());
    }

    @Test
    public void getJobs() throws Exception {
        // NOTE：
        // status的取值仅为：0,1,2,4,8,16
        String filter = "{\"limit\":\"5\",\"offset\":\"0\",\"timeFilter\":\"1\",\"cubeName\":\"\",\"projectName\":\"\",\"statuses\":\"\"}" ;
        logger.info("getJobs接口返回值："+JobAPI.getJobs(filter));
    }

}
package me.wujl.whiskey.olap.kylin.bean.job;

import java.util.List;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.bean.job
 * @Description: kylin中构建cube时候
 * @date 2017-02-27 10:05
 */

public class Job {

    /**
    * id
    */
    private	String	uuid	;
    /**
    * 最新一次修改时间
    */
    private	long last_modified	;
    /**
    * job名称
    */
    private	String	name	;
    /**
    * job的类型（"build","drop","edit"...,详细见JobEnum.class中type）
    */
    private	String	type	;
    /**
    * 持续时长
    */
    private	long duration	;
    /**
    * 关联cube的名称
    */
    private	String	related_cube	;
    /**
    * 关联的时间区间
    */
    private	String	related_segment	;
    /**
    * 执行开始时间
    */
    private	long exec_start_time	;
    /**
    * 执行结束时间
    */
    private	long exec_end_time	;
    /**
    * mapReduce等待时间
    */
    private	long mr_waiting	;
    /**
    * job的状态（详细见JobEnum.class中status）
    */
    private	String job_status ;
    /**
    * 过程??
    */
    private	double progress ;
    /**
    * 提交者
    */
    private String submitter ;
    /**
    * 步骤集合(应该有12)
    */
    private List<Step> steps ;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(long last_modified) {
        this.last_modified = last_modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getRelated_cube() {
        return related_cube;
    }

    public void setRelated_cube(String related_cube) {
        this.related_cube = related_cube;
    }

    public String getRelated_segment() {
        return related_segment;
    }

    public void setRelated_segment(String related_segment) {
        this.related_segment = related_segment;
    }

    public long getExec_start_time() {
        return exec_start_time;
    }

    public void setExec_start_time(long exec_start_time) {
        this.exec_start_time = exec_start_time;
    }

    public long getExec_end_time() {
        return exec_end_time;
    }

    public void setExec_end_time(long exec_end_time) {
        this.exec_end_time = exec_end_time;
    }

    public long getMr_waiting() {
        return mr_waiting;
    }

    public void setMr_waiting(long mr_waiting) {
        this.mr_waiting = mr_waiting;
    }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {
        this.job_status = job_status;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Job{" +
                "uuid='" + uuid + '\'' +
                ", last_modified=" + last_modified +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", related_cube='" + related_cube + '\'' +
                ", related_segment='" + related_segment + '\'' +
                ", exec_start_time=" + exec_start_time +
                ", exec_end_time=" + exec_end_time +
                ", mr_waiting=" + mr_waiting +
                ", job_status='" + job_status + '\'' +
                ", progress=" + progress +
                ", submitter='" + submitter + '\'' +
                ", steps=" + steps +
                '}';
    }
}

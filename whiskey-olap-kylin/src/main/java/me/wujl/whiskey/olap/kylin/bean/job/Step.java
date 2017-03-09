package me.wujl.whiskey.olap.kylin.bean.job;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.olap.kylin.bean.job
 * @Description:  kylin的Job中包含多个固定步骤，此类为步骤（step）实体类
 * @date 2017-02-27 10:06
 */

public class Step {

    /**
    * id
    */
    private String id ;
    /**
    * 中断命令
    */
    private	String	interruptCmd ;
    /**
    * 步骤名称
    */
    private	String	name ;
    /**
     * 步骤信息
     */
    private	String	info ;
    /**
    * 步骤序列号（各步骤序列号为固定，一共有12个步骤）
    */
    private	int sequence_id	;
    /**
    * 执行命令
    */
    private	String	exec_cmd ;
    /**
    * 中断命令
    */
    private	String	interrupt_cmd ;
    /**
    * 执行开始时间
    */
    private	long exec_start_time ;
    /**
    * 执行结束时间
    */
    private	long exec_end_time ;
    /**
    * 执行等待时间
    */
    private	long exec_wait_time	;
    /**
    * 步骤状态（"pending","running","finished"）
    */
    private	String	step_status	;
    /**
    * 命令行类型（类型固定）
    */
    private	String	cmd_type ;
    /**
    * 是否异步运行
    */
    private	boolean	run_async ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInterruptCmd() {
        return interruptCmd;
    }

    public void setInterruptCmd(String interruptCmd) {
        this.interruptCmd = interruptCmd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getSequence_id() {
        return sequence_id;
    }

    public void setSequence_id(int sequence_id) {
        this.sequence_id = sequence_id;
    }

    public String getExec_cmd() {
        return exec_cmd;
    }

    public void setExec_cmd(String exec_cmd) {
        this.exec_cmd = exec_cmd;
    }

    public String getInterrupt_cmd() {
        return interrupt_cmd;
    }

    public void setInterrupt_cmd(String interrupt_cmd) {
        this.interrupt_cmd = interrupt_cmd;
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

    public long getExec_wait_time() {
        return exec_wait_time;
    }

    public void setExec_wait_time(long exec_wait_time) {
        this.exec_wait_time = exec_wait_time;
    }

    public String getStep_status() {
        return step_status;
    }

    public void setStep_status(String step_status) {
        this.step_status = step_status;
    }

    public String getCmd_type() {
        return cmd_type;
    }

    public void setCmd_type(String cmd_type) {
        this.cmd_type = cmd_type;
    }

    public boolean isRun_async() {
        return run_async;
    }

    public void setRun_async(boolean run_async) {
        this.run_async = run_async;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id='" + id + '\'' +
                ", interruptCmd='" + interruptCmd + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", sequence_id=" + sequence_id +
                ", exec_cmd='" + exec_cmd + '\'' +
                ", interrupt_cmd='" + interrupt_cmd + '\'' +
                ", exec_start_time=" + exec_start_time +
                ", exec_end_time=" + exec_end_time +
                ", exec_wait_time=" + exec_wait_time +
                ", step_status='" + step_status + '\'' +
                ", cmd_type='" + cmd_type + '\'' +
                ", run_async=" + run_async +
                '}';
    }
}

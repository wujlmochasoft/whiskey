package me.wujl.whiskey.commons.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wujl
 * @version V1.0
 * @Title: whiskey
 * @Package me.wujl.whiskey.commons.constants
 * @Description: 常量基类
 * @date 2017-02-20 13:59
 */

@Component
public class BaseConstants {

    @Value("${project.name}")
    private String project_name ;

    @Value("${application.version}")
    private String version ;

    public String getProject_name() {
        return project_name;
    }

    public String getVersion() {
        return version;
    }
}

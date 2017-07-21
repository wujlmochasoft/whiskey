package me.wujl.whiskey.data.datasource;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import me.wujl.whiskey.commons.log.BaseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.List;

/**
 * Created by wujl on 2017/07/20
 */
@Configuration
@PropertySource("classpath:application.properties")
public class WhiskeyDataSource extends BaseLogger {


    @Autowired
    Environment env ;

    @Bean(name = "dataSource",destroyMethod = "close")
    public DruidDataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("db.connection.driver","com.mysql.jdbc.Driver"));
        dataSource.setUrl(env.getProperty("db.connection.url","jdbc:mysql://localhost:3306/whiskey?characterEncoding=UTF-8&useUnicode=true"));
        dataSource.setUsername(env.getProperty("db.connection.username","root"));
        dataSource.setPassword(env.getProperty("db.connection.password",""));
        List<Filter> filters = Lists.newArrayList();
        filters.add(statFilter());
        filters.add(slf4jLogFilter());
        dataSource.setProxyFilters(filters);

        logger.info("connection db driver: {}", dataSource.getDriverClassName());
        logger.info("connection db url: {}", dataSource.getUrl());

        return dataSource;
    }

    @Bean
    public StatFilter statFilter() {
        StatFilter statFilter = new StatFilter();
        statFilter.setSlowSqlMillis(1000);
        statFilter.setLogSlowSql(true);

        return statFilter;
    }

    @Bean
    public Slf4jLogFilter slf4jLogFilter() {
        Slf4jLogFilter slf4jLogFilter = new Slf4jLogFilter();
        slf4jLogFilter.setStatementLogErrorEnabled(true);
        return slf4jLogFilter;
    }
}

//package com.hiynn.jizhen.gk.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.validation.constraints.NotNull;
//import java.sql.SQLException;
//
//@Configuration
//@ConfigurationProperties("datasource")
//public class OracleConfiguration {
//
//    @NotNull
//    private String driverClassName;
//    @NotNull
//    private String url;
//    @NotNull
//    private String username;
//    @NotNull
//    private String password;
//
//    private Integer initialSize;
//    private Integer minIdle;
//    private Integer maxActive;
//    private Integer maxWait;
//    private Integer timeBetweenEvictionRunsMillis;
//    private Integer minEvictableIdleTimeMillis;
//    private String validationQuery;
//    private Boolean testWhileIdle;
//    private Boolean testOnBorrow;
//    private Boolean testOnReturn;
//    private Boolean poolPreparedStatements;
//    private Integer maxOpenPreparedStatements;
//    private Boolean removeAbandoned;
//    private Integer removeAbandonedTimeout;
//    private String filters;
//    private Boolean logAbandoned;
//
//    @Bean
//    DruidDataSource dataSource() throws SQLException {
//
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setInitialSize(initialSize);
//        dataSource.setMinIdle(minIdle);
//        dataSource.setMaxActive(maxActive);
//        dataSource.setMaxWait(maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        dataSource.setValidationQuery(validationQuery);
//        dataSource.setTestWhileIdle(testWhileIdle);
//        dataSource.setTestOnBorrow(testOnBorrow);
//        dataSource.setTestOnReturn(testOnReturn);
//        dataSource.setPoolPreparedStatements(poolPreparedStatements);
//        return dataSource;
//
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public Integer getInitialSize() {
//        return initialSize;
//    }
//
//    public void setInitialSize(Integer initialSize) {
//        this.initialSize = initialSize;
//    }
//
//    public Integer getMinIdle() {
//        return minIdle;
//    }
//
//    public void setMinIdle(Integer minIdle) {
//        this.minIdle = minIdle;
//    }
//
//    public Integer getMaxActive() {
//        return maxActive;
//    }
//
//    public void setMaxActive(Integer maxActive) {
//        this.maxActive = maxActive;
//    }
//
//    public Integer getMaxWait() {
//        return maxWait;
//    }
//
//    public void setMaxWait(Integer maxWait) {
//        this.maxWait = maxWait;
//    }
//
//    public Integer getTimeBetweenEvictionRunsMillis() {
//        return timeBetweenEvictionRunsMillis;
//    }
//
//    public void setTimeBetweenEvictionRunsMillis(Integer timeBetweenEvictionRunsMillis) {
//        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
//    }
//
//    public Integer getMinEvictableIdleTimeMillis() {
//        return minEvictableIdleTimeMillis;
//    }
//
//    public void setMinEvictableIdleTimeMillis(Integer minEvictableIdleTimeMillis) {
//        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
//    }
//
//    public String getValidationQuery() {
//        return validationQuery;
//    }
//
//    public void setValidationQuery(String validationQuery) {
//        this.validationQuery = validationQuery;
//    }
//
//    public Boolean getTestWhileIdle() {
//        return testWhileIdle;
//    }
//
//    public void setTestWhileIdle(Boolean testWhileIdle) {
//        this.testWhileIdle = testWhileIdle;
//    }
//
//    public Boolean getTestOnBorrow() {
//        return testOnBorrow;
//    }
//
//    public void setTestOnBorrow(Boolean testOnBorrow) {
//        this.testOnBorrow = testOnBorrow;
//    }
//
//    public Boolean getTestOnReturn() {
//        return testOnReturn;
//    }
//
//    public void setTestOnReturn(Boolean testOnReturn) {
//        this.testOnReturn = testOnReturn;
//    }
//
//    public Boolean getPoolPreparedStatements() {
//        return poolPreparedStatements;
//    }
//
//    public void setPoolPreparedStatements(Boolean poolPreparedStatements) {
//        this.poolPreparedStatements = poolPreparedStatements;
//    }
//
//    public Integer getMaxOpenPreparedStatements() {
//        return maxOpenPreparedStatements;
//    }
//
//    public void setMaxOpenPreparedStatements(Integer maxOpenPreparedStatements) {
//        this.maxOpenPreparedStatements = maxOpenPreparedStatements;
//    }
//
//
//    public Integer getRemoveAbandonedTimeout() {
//        return removeAbandonedTimeout;
//    }
//
//    public void setRemoveAbandonedTimeout(Integer removeAbandonedTimeout) {
//        this.removeAbandonedTimeout = removeAbandonedTimeout;
//    }
//
//
//    public void setUsername(String username) {
//
//        this.username = username;
//
//    }
//
//    public void setPassword(String password) {
//
//        this.password = password;
//
//    }
//
//    public void setUrl(String url) {
//
//        this.url = url;
//
//    }
//
//    public Boolean getRemoveAbandoned() {
//        return removeAbandoned;
//    }
//
//    public void setRemoveAbandoned(Boolean removeAbandoned) {
//        this.removeAbandoned = removeAbandoned;
//    }
//
//    public String getFilters() {
//        return filters;
//    }
//
//    public void setFilters(String filters) {
//        this.filters = filters;
//    }
//
//    public Boolean getLogAbandoned() {
//        return logAbandoned;
//    }
//
//    public void setLogAbandoned(Boolean logAbandoned) {
//        this.logAbandoned = logAbandoned;
//    }
//}
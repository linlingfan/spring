package com.llf.spring.day5_12.constructor;

import java.util.Properties;

/**
 * Created by lenovo on 2016/5/12.
 * Properties的配置使用
 * 比如配置数据库科链接
 *
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}

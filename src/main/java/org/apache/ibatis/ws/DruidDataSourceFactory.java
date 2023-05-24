package org.apache.ibatis.ws;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceException;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author zhoujun
 * @version 1.0
 * @date 2023-05-24 11:15:54
 */
public class DruidDataSourceFactory extends PooledDataSourceFactory {
  public DruidDataSourceFactory() {
    dataSource = new DruidDataSource();
  }
}

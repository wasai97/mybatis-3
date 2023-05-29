package org.apache.ibatis.ws;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

/**
 * @author zhoujun
 * @version 1.0
 * @date 2023-05-24 15:45:44
 */
public class TestInterceptor implements Interceptor {
  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    return null;
  }
}

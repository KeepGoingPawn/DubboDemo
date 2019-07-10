package com.kevin.dubbo.api;

import java.util.List;

/**
 * @Author:Kevin
 * @Description:
 * @Date: 2019/7/9 14:44
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}

package com.kevin.dubbo.impl;

import com.kevin.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Kevin
 * @Description:
 * @Date: 2019/7/9 14:45
 */
public class DemoServiceImpl  implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}

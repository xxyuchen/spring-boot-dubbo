package com.atem.providersecond.apiService.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atem.providersecond.apiService.SecondProviderService;

/**
 * @author tangzhen
 * @create 2018/10/24 上午11:57
 * @desc
 **/
@Service(version = "1.0.0",interfaceClass = SecondProviderService.class)
public class SecondProviderServiceImpl implements SecondProviderService {
    @Override
    public String secondProvider() {
        return System.currentTimeMillis()+"";
    }
}

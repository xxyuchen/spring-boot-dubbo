package com.atem.providerfirst.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atem.providerfirst.service.FirstApiService;
import org.springframework.stereotype.Component;

/**
 * @author tangzhen
 * @create 2018/10/23 下午7:21
 * @desc
 **/
@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = FirstApiService.class)
public class FirstApiServiceImpl implements FirstApiService {
    @Override
    public String firestMethod() {
        long time = System.currentTimeMillis();
        return time+"";
    }
}

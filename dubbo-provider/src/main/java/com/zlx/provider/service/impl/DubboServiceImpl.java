package com.zlx.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zlx.api.service.DubboService;
import org.springframework.stereotype.Component;

@Service
//@Component
public class DubboServiceImpl implements DubboService {
    @Override
    public String printDubbo() {
        return "nohao dubbo";
    }
}

package com.zlx.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zlx.api.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Reference
    private DubboService service;

    @RequestMapping("1")
    public String getDubbo(){
        return service.printDubbo();
    }
}

package com.fanqiepp.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fanqiepp.dubboapi.service.HelloService;

/**
 * @author : sunzhaol@fanqiepinpin.com
 * @date : 2019-08-14 16:13
 **/
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+":'Hello!'";
    }
}

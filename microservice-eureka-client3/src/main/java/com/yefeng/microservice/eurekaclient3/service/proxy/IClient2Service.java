package com.yefeng.microservice.eurekaclient3.service.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/21 15:49
 **/
@FeignClient(value = "eureka-client2")
public interface IClient2Service {

}

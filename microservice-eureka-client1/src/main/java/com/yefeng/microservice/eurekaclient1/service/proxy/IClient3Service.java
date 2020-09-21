package com.yefeng.microservice.eurekaclient1.service.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/21 15:49
 **/
@FeignClient(value = "eureka-client3")
public interface IClient3Service {
	
}

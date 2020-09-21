package com.yefeng.microservice.eurekaclient1.service.proxy;

import com.yefeng.commondata.dto.ResultDTO;
import com.yefeng.microservice.eurekaclient1.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/21 15:48
 **/
@FeignClient(value = "eureka-client2")
public interface IClient2Service {
	@GetMapping("/getaccount")
	ResultDTO<AccountDTO> getAccount();
}

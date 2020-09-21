package com.yefeng.microservice.eurekaclient1.controller;

import com.yefeng.commondata.dto.ResultDTO;
import com.yefeng.microservice.eurekaclient1.dto.AccountDTO;
import com.yefeng.microservice.eurekaclient1.service.proxy.IClient2Service;
import com.yefeng.microservice.eurekaclient1.service.proxy.IClient3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/21 15:48
 **/
@RestController
@RequestMapping("/")
public class IndexController {

	@Autowired
	IClient2Service client2Service;

	@Autowired
	IClient3Service client3Service;

	@GetMapping("getaccount")
	public ResultDTO<AccountDTO> getAccount() {
		ResultDTO<AccountDTO> resultDTO = client2Service.getAccount();
		return resultDTO;
	}

}

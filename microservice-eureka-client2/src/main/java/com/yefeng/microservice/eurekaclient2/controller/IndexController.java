package com.yefeng.microservice.eurekaclient2.controller;

import com.yefeng.commondata.dto.ResultDTO;
import com.yefeng.microservice.eurekaclient2.common.CustomOutputUtility;
import com.yefeng.microservice.eurekaclient2.dto.AccountDTO;
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

	@GetMapping("getaccount")
	public ResultDTO<AccountDTO> getAccount() {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setUserId(10000);
		accountDTO.setUserCode("pototallxg");
		accountDTO.setUserName("liuxiaogang");
		accountDTO.setCompanyName("房天下");
		accountDTO.setRoleName("系统管理员");
		return CustomOutputUtility.excuteSuccess(accountDTO);
	}
}

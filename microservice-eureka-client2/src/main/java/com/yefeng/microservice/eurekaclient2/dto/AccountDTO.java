package com.yefeng.microservice.eurekaclient2.dto;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/21 16:33
 **/

public class AccountDTO {

	private Integer userId;
	private String userCode;
	private String userName;
	private String companyName;
	private String roleName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}

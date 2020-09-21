package com.yefeng.microservice.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.TimeZone;

/**
 * @description: 启动类
 * @author: liuxiaogang.bj
 * @create: 2019/9/25 11:15
 **/

@SpringBootApplication
@ServletComponentScan
@EnableEurekaClient
@EnableFeignClients
public class Client2Application {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SpringApplication.run(Client2Application.class, args);
	}
}

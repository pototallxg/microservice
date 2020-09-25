package com.yefeng.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.TimeZone;

/**
 * @description:
 * @author: liuxiaogang.bj
 * @create: 2020/9/22 17:16
 **/
@SpringBootApplication
@ServletComponentScan
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SpringApplication.run(ZuulApplication.class, args);
	}
}
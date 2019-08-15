package com.watero.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
@EnableDubbo
@SpringBootApplication
public class SpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}

}

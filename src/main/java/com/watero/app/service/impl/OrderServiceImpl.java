package com.watero.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.watero.bean.UserAdress;
import com.watero.service.OrderService;
import com.watero.service.UserService;

/**
 * 
 * @author yang 
 * 1.将服务提供者住的到服务中心 
 * 		1).导入dubbo依赖 。zookeeper客户端依赖
 * 		2）.暴露服务
 * 2.将服务消费者去注册中心订阅服务提供者的服务地址
 *
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference
	UserService userService;

	@Override
	public List<UserAdress> initOrder(String userId) {
		System.out.println("用户ID："+userId);
		List<UserAdress> list = userService.getUserAdressList(userId);
		System.out.println(list.toString());
		return list;
	}

}

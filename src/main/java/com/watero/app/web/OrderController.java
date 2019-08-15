package com.watero.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.watero.bean.UserAdress;
import com.watero.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;

	@ResponseBody
	@RequestMapping("/getAdress")
	public List<UserAdress> initAdress(@RequestParam("uid")String userId) {
		List<UserAdress> list = orderService.initOrder(userId);
		return list;

	}

}

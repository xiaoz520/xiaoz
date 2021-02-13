package org.spring.springboot.web;

import org.spring.springboot.service.IBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	// @Autowired
	// private IOrderManager orderManager;

	@Autowired
	@Qualifier("order")
	private IBill bill;

	@RequestMapping("/create/one")
	public String createOrder() {

		return JSONObject.toJSONString(bill.createBill());

	}

}

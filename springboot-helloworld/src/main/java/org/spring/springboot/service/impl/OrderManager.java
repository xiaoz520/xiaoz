package org.spring.springboot.service.impl;

import org.spring.springboot.entity.Order;
import org.spring.springboot.service.IOrderManager;
import org.springframework.stereotype.Service;

@Service
public class OrderManager implements IOrderManager {

	@Override
	public Order createOrder() {
		Order prodOrder = new Order();
		prodOrder.setSn("0001");
		prodOrder.setAddress("大口乡");
		return prodOrder;
	}

}

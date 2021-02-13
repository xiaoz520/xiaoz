package org.spring.springboot.service.impl;

import org.spring.springboot.service.IBill;
import org.springframework.stereotype.Service;

@Service
public class Order implements IBill {

	@Override
	public String createBill() {
		return "Order";
	}

}

package org.spring.springboot.service.impl;

import org.spring.springboot.service.IBill;
import org.springframework.stereotype.Service;

@Service
public class Protocol implements IBill {

	@Override
	public String createBill() {
		// TODO Auto-generated method stub
		return "Protocol";
	}

}
